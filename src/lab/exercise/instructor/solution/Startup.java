package lab.exercise.instructor.solution;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border...");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border...");
        rectangle.draw();

        Shape redCircle = new RedBorderShapeDecorator(new Circle());
        System.out.println("\nCircle with red border...");
        redCircle.draw();

        Shape redRectangle = new RedBorderShapeDecorator(new Rectangle());
        System.out.println("\nRectangle with red border...");
        redRectangle.draw();    
        
    }
}
