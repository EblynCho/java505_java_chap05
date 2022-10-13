public interface MyInterface {
    void method1();  // interface 는 기본이 public, 생략해도 자동으로 public 붙여줌

//    void method2();

//    해당 interface 를 구현하는 구현체가 여러 개가 존재할 경우에 구현체의 수정없이 기능을 추가하고자 하는 경우에 사용하는 것이 디폴트 메서드임
    default void method2() {
        System.out.println("MyInterface의 method2() 실행");
    }
}
