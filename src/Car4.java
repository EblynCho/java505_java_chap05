public class Car4 {
    TireI frontLeftTire = new HankookTire2();
    TireI frontRightTire = new HankookTire2();
    TireI backLeftTire = new HankookTire2();
    TireI backRightTire = new HankookTire2();

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
