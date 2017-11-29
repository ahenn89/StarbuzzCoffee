package lab.exercise1;

/**
 *
 * @author jlombardo
 */
public class PerPersonRestaurantTipCalculator extends TipCalculatorDecorator {
    private int personQty;
    
    public PerPersonRestaurantTipCalculator(TipCalculator calcToBeDecorated, int personQty) {
        super(calcToBeDecorated);
        this.personQty = personQty;
    }
    
    @Override
    public double getTip(double amount, double tipPercent) {
        return super.getTip(amount, tipPercent) / personQty;
    }
}
