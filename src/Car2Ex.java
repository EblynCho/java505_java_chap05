public class Car2Ex {
    public static void main(String[] args) {
        Car2 car = new Car2();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    break;

                case 2:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽", 13);
                    break;

                case 3:
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;

                case 4:
                    System.out.println("뒤오른쪽 KumhoTire로 교체");
                    car.backRightTire = new KumhoTire("뒤오른쪽", 17);
                    break;
            }
            System.out.println("-------------------------------");
        }

        Car3 car3 = new Car3();

        for (int i = 1; i <= 5; i++) {
            int problemLacation = car3.run();

            if (problemLacation != 0) {
                System.out.println(car3.tires[problemLacation -1].location + "HankookTire로 교체");
            car3.tires[problemLacation -1] = new HankookTire((car3.tires[problemLacation -1].location), 15);
            }
            System.out.println("-------------------------------");


        }
    }
}
