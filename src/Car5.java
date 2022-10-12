public class Car5 {
    TireI[] tires = new TireI[4];
//    TireI[] tires = {
//            new HankookTire2(),
//            new HankookTire2(),
//            new HankookTire2(),
//            new HankookTire2()
//    };

    public Car5() {
//        for (TireI item : tires) {
//            item = new HankookTire2();
//        }
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new HankookTire2();
        }
//        tires[0] = new HankookTire2();  // 이 방법 대신 위의 방법 사용하면 간단
    }

    void run() {
        for (TireI item : tires) {
            item.roll();
        }
    }
}
