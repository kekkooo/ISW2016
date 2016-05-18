/**
 * Created by francescousai on 16/05/16.
 */
public class Mul extends Operator {
    public Mul( Expression left, Expression right ){
        super( left, right );
    }

    @Override
    public void Execute() {
        leftHandSide.Execute();
        rightHandSide.Execute();

        result = new Operand( leftHandSide.getValue() * rightHandSide.getValue() );
    }

    @Override
    public double getValue() {
        return result.getValue();
    }
}
