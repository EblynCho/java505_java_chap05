public class PhoneEx {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

//        Phone 클래스는 추상 클래스 이므로 new 키워드를 통해 객체를 생성할 수 없음
//        Phone phone = new Phone("홍길동");
        Phone phone;  // 해당 클래스타입에 변수는 설정 가능
//        phone = new Phone("홍길동")  // new 키워드를 통해 객체 생성 불가능
    }
}
