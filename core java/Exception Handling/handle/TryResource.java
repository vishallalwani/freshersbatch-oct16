package handle;

interface AutoClosable {
	public void close() throws Exception;
}



 class TryRes implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("MyAutoClosable closed!");
	}
}
 

public class TryResource {

	public static void main(String[] args) {
		try (TryRes tr = new TryRes();) {

			tr.close();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally.");
		}
	
	}
}