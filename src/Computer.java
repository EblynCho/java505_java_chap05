public class Computer extends Calculator1 {
    @Override
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        System.out.println("수정된 내용임");
        return Math.PI * r * r;
    }

    @Override
    int sum() {
        System.out.println("오버라이딩하여 출력하기 : " + (20 + 10));
        return 20 + 10;
    }

//    @Override 없이 매개변수 부분이 달라지면 오류인식못함
//    오버라이딩이 아니라 오버로딩(Overloading)으로 인식해버림
    int sub(int num1, int num2) {
        System.out.println("오버라이딩하여 출력하기 : " + (10 - 3));
        return 10 - 3;
    }
}
