
/**
 * Created by francescousai on 18/05/16.
 */
public class Main {

    static Operand one, minusOne, two, minustwo, three, four;

    private static void InitializeOperands(){

        minusOne = new Operand( -1.0 );
        minustwo = new Operand( -2.0 );
        one      = new Operand( 1.0 );
        two      = new Operand( 2.0 );
        three    = new Operand( 3.0 );
        four     = new Operand( 4.0 );
    }

    public static void main(String [ ] args){
        InitializeOperands();

        Mul minusTwoTimesFour = new Mul( minustwo, four );
        Div fourDivByTwo      = new Div ( four, two );
        Add firstSum          = new Add( minusTwoTimesFour, fourDivByTwo );
        Mul threeTimesTwo     = new Mul( three, two );
        Mul threeTimesTwoTimesFour = new Mul( threeTimesTwo, four );
        Add sumAll            = new Add( firstSum, threeTimesTwoTimesFour );

        Calculator calc = new Calculator();
        calc.SetExpression( sumAll );
        double result = calc.evaluate();
        System.out.println( "Il quiz che sta facendo impazzire il web, solo il 3% ci riesce." );
        System.out.print( "(-2 * 4) + (4 / 2) + (3 * 2 * 4) =" + result );

    }
}
