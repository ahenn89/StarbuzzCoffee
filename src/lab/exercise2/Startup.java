package lab.exercise2;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        System.out.println(circle.draw());

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        System.out.println(rectangle.draw());

        // do output for decorated shapes here...
        circle = new RedShapeDecorator(circle, "Red");
        System.out.println("\nCircle with Red Border: ");
        System.out.println(circle.draw());
        
        rectangle = new RedShapeDecorator(rectangle, "Red");
        System.out.println("\nRectangle with Red Border: ");
        System.out.println(rectangle.draw());
        
    }
}
