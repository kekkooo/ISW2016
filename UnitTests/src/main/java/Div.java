/**
 * Created by francescousai on 16/05/16.
 */
public class Div extends Operator {
    public Div( Expression left, Expression right ){
        super( left, right );
    }

    @Override
    public void Execute() {
        leftHandSide.Execute();
        rightHandSide.Execute();

        if(rightHandSide.getValue() == 0){ throw new UnsupportedOperationException("Division by zero not allowed" ); }

        result = new Operand( leftHandSide.getValue() / rightHandSide.getValue() );
    }

    @Override
    public double getValue() {
        return result.getValue();
    }
}
