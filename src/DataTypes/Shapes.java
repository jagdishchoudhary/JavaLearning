package DataTypes;
public class Shapes {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 14;
        System.out.println("Area of circle is : " + circle.Area());

        Rectangle rec = new Rectangle();
        rec.hight = 5;
        rec.lenght = 10;
        System.out.println("Area of rectangle: " + rec.Area());
        System.out.println(Rectangle.ABC);
    }
}
