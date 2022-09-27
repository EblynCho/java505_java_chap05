import javax.naming.Name;

public class NamedCircle extends Circle {
    String name;

    public void show() {
        System.out.println(name + ", 반지름 = " + getRadius());
    }
    public NamedCircle(int radius, String name) {
        super(radius);
        this.name = name;
    }
    public static void main(String[] args) {
        NamedCircle w = new NamedCircle(5, "Waffle");
        w.show();
    }
}
