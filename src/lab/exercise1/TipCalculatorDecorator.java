package lab.exercise1;

/**
 *
 * @author jlombardo
 */
public abstract class TipCalculatorDecorator implements TipCalculator {
    private TipCalculator calcToBeDecorated;
    
    public TipCalculatorDecorator(TipCalculator calcToBeDecorated) {
        this.calcToBeDecorated = calcToBeDecorated;
    }
    
    public double getTip(double amount, double tipPercent) {
        return calcToBeDecorated.getTip(amount, tipPercent);
    }
}
