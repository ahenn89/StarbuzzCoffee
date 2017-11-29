package version1;

/**
 *
 * @author Head First Design Patterns
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.setDescription("Dark Roast");
    }

    @Override
    public double cost() {
        return 1.09;
    }

}
