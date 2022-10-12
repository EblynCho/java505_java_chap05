public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Vehicle vehicle = new Vehicle();

//        각각의 객체로 실행
        vehicle.run();
        bus.run();
        taxi.run();

//        다형성을 이용하여 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입해서 사용
        vehicle = bus;
        vehicle.run();
        vehicle = taxi;
        vehicle.run();

//        다른 클래스의 멤버 메서드의 매개변수로 부모 클래스 타입의 변수를 사용 시 자식 클래스 타입의 객체를 매개변수로 넘겨서 사용할 수 있음
//        사용하는 방법은 동일한데 매개변수로 사용된 데이터에 따라서 다른 출력을 하고 있음
        driver.drive(bus);
        driver.drive(taxi);

    }
}
