public class Driver2Ex {
    public static void main(String[] args) {

        System.out.println("\n----- 각각 객체를 생성하여 실행 -----\n");
        Bus2 bus2 = new Bus2();
        Taxi2 taxi2 = new Taxi2();

        bus2.run();
        taxi2.run();

        System.out.println("\n ----- 익명 객체를 통한 구현 -----\n");
        Vehicle2 vehicle2 = new Vehicle2() {
            @Override
            public void run() {
                System.out.println("탈것이 달립니다.");
            }
        };
        vehicle2.run();

        System.out.println("\n ----- 부모 인터페이스 타입의 변수에 자식 객체를 대입 -----\n");
        vehicle2 = bus2;
        vehicle2.run();
        vehicle2 = taxi2;
        vehicle2.run();

        System.out.println("\n----- 인터페이스 변수를 매개변수로 사용 시 -----\n");
        Driver2 driver2 = new Driver2();
        driver2.drive(bus2);
        driver2.drive(taxi2);

        System.out.println("\n----- 자동 타입 변환, 강제 타입 변환, instanceof -----\n");

//        자동 타입 변환, 부모인 Vehicle2 인터페이스 타입의 변수에 자식인 Bus2 클래스 타입의 객체를 대입
        Vehicle2 vehicle21 = new Bus2();
        vehicle21.run();

//        데이터 타입이 다르므로 강제 타입 변환을 시도해야 함
//        강제 타입 변환의 조건 : 원본이 자식 클래스 타입의 객체일 때 해당 클래스 타입으로 변환 시 가능
//        원본 클래스 객체 타입이 맞는지 확인을 하기 위해서는 instanceof 연산자를 사용해야 함
        Bus2 bus21 = (Bus2) vehicle21;
        bus21.run();

        Vehicle2 vehicle22 = new Bus2();
        vehicle22.run();

        if (vehicle22 instanceof Taxi2) {
            Taxi2 taxi22 = (Taxi2) vehicle22;  // 실행error -> instanceof 로 확인 해주어야 함
            taxi22.run();
            System.out.println("정상적으로 Taxi2 클래스 타입으로 변경 했습니다.");
        }
        else {
            System.out.println("Taxi2 클래스 타입으로 변경할 수 없습니다.");
        }
    }
}
