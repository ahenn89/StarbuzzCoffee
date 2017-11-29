In this lab exercise you will practice using the Decorator Pattern
to extend the capabilities of a Shape by Decorating it with
the ability to make its border red. If you get stuck, review the tip 
calculator example. The techniques are very similar.
------------------------------------------------------------------
1. Create a ShapeDecorator that inherits from Shape. Make sure this class is
   abstract and saves the component it is decorating as a property. Then
   implement the inherited method using that property to delegate the functionality.
2. Now create a RedShapeDecorator that inherits from ShapeDecorator.
   Make sure this class 
   This is where you extend the functionality -- in this case by changing
   the way it draws itself, so that it includes a red border. You can just
   use System.out.println() to represent this.
4. Now create one undecorated circle and rectangle and draw them.
5. Finally create one decorated circle and rectangle and draw them.
6. Your output should look something like this:

Circle with normal border
Shape: Circle

Rectangle with normal border
Shape: Rectangle

Circle with red border
Shape: Circle
Border Color: Red

Rectangle with red border
Shape: Rectangle
Border Color: Red