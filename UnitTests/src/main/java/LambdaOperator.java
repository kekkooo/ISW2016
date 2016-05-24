import java.util.function.DoubleBinaryOperator;

/**
 * Created by francescousai on 23/05/16.
 */
public class LambdaOperator extends Operator {

    DoubleBinaryOperator actualOperator;

    public LambdaOperator(Expression left, Expression right,
                          DoubleBinaryOperator operation) {
        super(left, right);
        this.actualOperator = operation;
    }

    @Override
    public void Execute() {

        leftHandSide.Execute();
        rightHandSide.Execute();

        this.result = new Operand(
            actualOperator.applyAsDouble(  leftHandSide.getValue(),
                                           rightHandSide.getValue()));
    }

    @Override
    public double getValue() {
        return result.getValue();
    }
}
