package lab.exercise1;

/**
 *
 * @author jlombardo
 */
public class RestaurantTipCalculator implements TipCalculator {

    @Override
    public double getTip(double amount, double tipPercent) {
        return amount * tipPercent;
    }
    
}
