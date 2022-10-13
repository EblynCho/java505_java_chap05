public class DefaultMethodEx {
    public static void main(String[] args) {
        MyInterface m1 = new MyClassA();
        m1.method1();  // 추상 메서드 -> 오버라이딩
        m1.method2();  // 디폴트 메서드

        MyInterface m2 = new MyClassB();
        m2.method1();
        m2.method2();
    }
}
