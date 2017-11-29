package lab.exercise1;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        TipCalculator calc = new RestaurantTipCalculator();
        double tip = calc.getTip(100, 0.20);
        System.out.println("Tip on $100 is " + tip);
        
        calc = new PerPersonRestaurantTipCalculator(calc,4);
        tip = calc.getTip(100, 0.20);
        System.out.println("Per person share of tip of $100 is " + tip);
        
    }
}
