import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Optional;

/**
 * Created by francescousai on 16/05/16.
 */
public abstract class Operator extends Expression {
    protected Expression leftHandSide, rightHandSide;
    protected Operand result = null;

    public Operator( Expression left, Expression right ){

        if( left == null ){  throw  new IllegalArgumentException( "argument left is null" ); }
        if( right == null ){ throw  new IllegalArgumentException( "argument right is null" ); }
        leftHandSide = left;
        rightHandSide = right;
    }
}
