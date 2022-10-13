public interface MyInterface2 extends MyInterface {
//    부모 인터페이스인 MyInterface에서 상속받은 멤버 메서드 중 디폴트 메서드인 method2()를 오버라이딩하여 추상 메서드로 변환
    @Override
    void method2();

    void method3();
}
