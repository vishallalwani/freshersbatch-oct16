
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ImageMain {

    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@10.20.0.7:1521:xe";
    private static final String USERNAME = "system";
    private static final String PASSWORD = "12345";
    private static Connection conn;

    public static void main(String[] args) throws Exception {

        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

        // insertImage();
        retrieveImage();

        conn.close();
    }

    private static void retrieveImage() throws Exception {

        File imageFile = new File("photo2.jpg");
        InputStream fileInputStream = null;
        FileOutputStream fileOutputStream = new FileOutputStream(imageFile);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM vishal_image");

        while (rs.next()) {
            fileInputStream = rs.getBinaryStream("Image");
        }

        int i = 0;
        do {
            i = fileInputStream.read();
            fileOutputStream.write(i);
        } while (i != -1);
        System.out.println("Image Downloaded");

    }

    public static void insertImage() throws Exception {

        File imageFile = new File("photo.jpg");
        FileInputStream fileInputStream = new FileInputStream(imageFile);
        PreparedStatement pstmt = conn
                .prepareStatement("INSERT INTO vishal_image VALUES(?,?)");
        pstmt.setInt(1, 1);
        pstmt.setBinaryStream(2, fileInputStream);

        int result = pstmt.executeUpdate();

        System.out.println(result);
    }

}