package Nested_class;

import java.util.Random;

public class AlertMain{

    public static void main(String[] args) throws Exception {

        Random r = new Random();
        Alert bm = new Alert();
        Alert.HighBloodPressureListener hbpl = bm.new HighBloodPressureListener();

        while (true) {
            int value = r.nextInt(200);
            bm.addData(value);
            bm.setPressure(hbpl);
            Thread.sleep(1000);
        }
    }
}

class Alert {

    private int value;

    public void addData(int value) {
        this.value = value;
    }

    public void setPressure(BloodPressure bps) {
        if (bps.checkBloodPressure(value)) {
            System.err.println("High Blood Pressure ! ");
        } else {
            System.out.println("Normal Blood Pressure");
        }
    }

    class HighBloodPressureListener implements BloodPressure {

        @Override
        public boolean checkBloodPressure(int value) {
            if (value > 140)
                return true;
            return false;
        }

    }

    interface BloodPressure {
        public boolean checkBloodPressure(int value);
    }

}