public class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }

//    Point 클래스 상속 받지 않으면
//    private int x;
//    private int y;
//
//    public void set (int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public void showPoint() {
//        System.out.println("(" + x + "," + y + ")");
//    }
}
