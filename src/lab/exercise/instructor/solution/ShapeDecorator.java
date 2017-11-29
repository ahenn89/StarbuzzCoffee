package lab.exercise.instructor.solution;

/**
 *
 * @author jlombardo
 */
public abstract class ShapeDecorator implements Shape {
    private Shape shapeToBeDecorated;
    
    public ShapeDecorator(Shape shapeToBeDecorated) {
        this.shapeToBeDecorated = shapeToBeDecorated;
    }

   public void draw() {
       shapeToBeDecorated.draw();
   }
}
