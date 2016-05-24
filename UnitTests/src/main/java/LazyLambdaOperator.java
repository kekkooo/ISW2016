import java.util.Optional;
import java.util.function.DoubleBinaryOperator;

/**
 * Created by francescousai on 23/05/16.
 */
public class LazyLambdaOperator extends LambdaOperator {

    Optional<Operand> optResult;

    public LazyLambdaOperator(Expression left, Expression right,
                              DoubleBinaryOperator operation) {
        super(left, right, operation);
        optResult = Optional.empty();
    }

    @Override
    public void Execute() {

    }

    private void intExecute(){
        System.out.println( "executing " + this + " operation" );

        leftHandSide.Execute();
        rightHandSide.Execute();

        optResult = Optional.of(
            new Operand(
                this.actualOperator.applyAsDouble(  leftHandSide.getValue(),
                                                    rightHandSide.getValue()
                )
            )
        );
    }

    @Override
    public double getValue() {
        if( !optResult.isPresent() ){
            this.intExecute();
        }
        return optResult.get().getValue();
    }
}
