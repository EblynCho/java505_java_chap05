public class ImplEx {
    public static void main(String[] args) {
        System.out.println("\n----- 구현체 implC의 객체 impl은 모든 메서드 사용 가능 -----\n");
        ImplC impl = new ImplC();

        impl.methodA();
        impl.methodB();
        impl.methodC();

        System.out.println("\n----- InterfaceA의 변수에 대입 시 -----\n");
        InterfaceA ifA = impl;
        ifA.methodA();

        System.out.println("\n----- InterfaceB의 변수에 대입 시 -----\n");
        InterfaceB ifB = impl;
        ifB.methodB();

        System.out.println("\n----- InterfaceC의 변수에 대입 시 -----\n");
        InterfaceC ifC = impl;
        ifC.methodA();
        ifC.methodB();
        ifC.methodC();

    }
}
