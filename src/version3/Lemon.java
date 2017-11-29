package version3;

/**
 *
 * @author jlombardo
 */
public class Lemon extends CondimentDecorator {

    public Lemon(Beverage beverageToBeDecorated) {
        super(beverageToBeDecorated);
    }

    @Override
    public String getDescription() {
        // combined descrition & add functionality
        reheat();
        return super.getDescription() + ", Lemon";
    }

    @Override 
    public double cost () {
        // combined cost
        return 0.1 + super.cost();
    }
    
    private void reheat() {
        System.out.println("beverage is being reheated");
    }

}
