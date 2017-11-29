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
public class RedShapeDecorator extends ShapeDecorator{
    private String color;
    
    public RedShapeDecorator(Shape shapeToBeDecorated, String color){
        super(shapeToBeDecorated);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws IllegalArgumentException{
        if(color == null || color.isEmpty()){
            throw new IllegalArgumentException("You must define a color in order to decorate a Shape. color cannot be empty or null.");
        }
        this.color = color;
    }
    
    @Override
    public String draw(){
        return super.draw() + "\nBorder Color: " + color;
    }
}
