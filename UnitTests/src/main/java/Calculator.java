/**
 * Created by francescousai on 18/05/16.
 */
public class Calculator {

    Expression expr = null;

    public void SetExpression( Expression expression ){
        if( expr != null ){ throw new IllegalArgumentException( "expr cannot be null" ); }
        this.expr = expression;
    }

    public double evaluate(){
        expr.Execute();
        return expr.getValue();
    }
}
