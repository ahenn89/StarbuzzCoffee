package lab.exercise.instructor.solution;

/**
 *
 * @author jlombardo
 */
public class RedBorderShapeDecorator extends ShapeDecorator {

   public RedBorderShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);	
   }

   @Override
   public void draw() {
      super.draw();	       
      addRedBorder();
   }

   private void addRedBorder(){
      System.out.println("Border Color: Red");
   }
}
