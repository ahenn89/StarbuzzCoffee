/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise2;

/**
 *
 * @author Ashlee
 */
public class ShapeDecorator implements Shape{

    private Shape shapeToBeDecorated;
    
    public ShapeDecorator(Shape shapeToBeDecorated){
        setShapeToBeDecorated(shapeToBeDecorated);
    }


    public Shape getShapeToBeDecorated() {
        return shapeToBeDecorated;
    }

    public void setShapeToBeDecorated(Shape shapeToBeDecorated) throws IllegalArgumentException{
        if(shapeToBeDecorated == null){
            throw new IllegalArgumentException ("A shape must be provided before it can be decorated. shapeToBeDecorated cannot be null.");
        }
        this.shapeToBeDecorated = shapeToBeDecorated;
    }

    @Override
    public String draw() {
        return shapeToBeDecorated.draw();
    }
    
}
