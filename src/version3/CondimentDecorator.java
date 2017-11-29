package version3;

/**
 * A decorator IS A Beverage. But it needs a beverage component to "decorate".
 * Note that all work is delegated to the decorated object.
 * 
 * @author Head First Design Patterns
 */
public abstract class CondimentDecorator extends Beverage {
    private Beverage beverageToBeDecorated;

    public CondimentDecorator(Beverage beverageToBeDecorated) {
        this.beverageToBeDecorated = beverageToBeDecorated;
    }
    
    public double cost() {
        return beverageToBeDecorated.cost();
    }
    
    public String getDescription() {
        return beverageToBeDecorated.getDescription();
    }
}
