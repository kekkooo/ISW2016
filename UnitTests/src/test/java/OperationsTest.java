import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.function.DoubleBinaryOperator;

/**
 * Created by francescousai on 16/05/16.
 */
public class OperationsTest {

    Operand one, minusOne, two, minustwo, three, four;

    // Before indica che il il metodo sottostante dovrà essere eseguito PRIMA di eseguire i metodi di test
    @Before
    public void InitializeOperands(){

        minusOne = new Operand( -1.0 );
        minustwo = new Operand( -2.0 );
        one      = new Operand( 1.0 );
        two      = new Operand( 2.0 );
        three    = new Operand( 3.0 );
        four     = new Operand( 4.0 );
    }

    @Test
    public void OnePlusMinusOneEqualsZeroTest(){
        Operator add     = new Add( one, minusOne );
        add.Execute();
        Assert.assertEquals( 0.0, add.getValue(), 0.1 );
    }

    @Test
    public void ThreePlusFourEqualsSevenTest(){
        Operator add  = new Add( three, four );
        add.Execute();
        Assert.assertEquals( 7.0, add.getValue(), 0.1 );
    }

    @Test
    public void ThreePlusFourEqualsMinusOneTest(){
        Operator add = new Sub( three, four );
        add.Execute();
        Assert.assertEquals( -1.0, add.getValue(), 0.1 );
    }

    @Test
    public void OneMinusMinusOneIsTwoTest(){
        Operator sub = new Sub( one, minusOne );
        sub.Execute();
        Assert.assertEquals( 2.0, sub.getValue(), 0.1 );
    }

    @Test
    public void ComplexExpressionTest(){
        Mul minusTwoTimesFour = new Mul( minustwo, four );
        Div fourDivByTwo      = new Div ( four, two );
        Add firstSum          = new Add( minusTwoTimesFour, fourDivByTwo );
        Mul threeTimesTwo     = new Mul( three, two );
        Mul threeTimesTwoTimesFour = new Mul( threeTimesTwo, four );
        Add sumAll            = new Add( firstSum, threeTimesTwoTimesFour );

        sumAll.Execute();
        Assert.assertEquals( 18.0, sumAll.getValue(), 0.1 );
    }

    @Test
    public void LambdaOnePLusOneEqualsTwoTest(){
        LambdaOperator add = new LambdaOperator( one, one, ( x, y ) -> x + y );
        add.Execute();
        Assert.assertEquals( 2.0, add.getValue(), 0.1 );
    }

    @Test
    public void LazyComplexExpressionTest(){

        /*
        DoubleBinaryOperator lambdaMul = (x,y) -> x * y;
        DoubleBinaryOperator lambdaAdd = (x,y) -> x + y;
        DoubleBinaryOperator lambdaDiv = (x,y) -> x / y;
        DoubleBinaryOperator lambdaSub = (x,y) -> x - y;

        LambdaOperator minusTwoTimesFour = new LambdaOperator( minustwo, four, lambdaMul );
        LambdaOperator fourDivByTwo      = new LambdaOperator ( four, two, lambdaDiv );
        LambdaOperator firstSum          = new LambdaOperator( minusTwoTimesFour, lambdaAdd,  );
        LambdaOperator threeTimesTwo     = new LambdaOperator( three, two, lambdaMul );
        LambdaOperator threeTimesTwoTimesFour = new LambdaOperator( threeTimesTwo, four, lambdaMul );
        LambdaOperator sumAll            = new LambdaOperator( firstSum, threeTimesTwoTimesFour, lambdaAdd );

        sumAll.Execute();
        Assert.assertEquals( 18.0, sumAll.getValue(), 0.1 );
        */
    }
}
