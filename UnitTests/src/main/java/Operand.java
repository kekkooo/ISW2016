/**
 * Created by francescousai on 16/05/16.
 * Notice that Operand is immutable, meaning that it is not possible to modify its value after instantiation
 */
public class Operand extends Expression {

    private double value = 0.0;
    public Operand( double value ){
        this.value = value;
    }
    @Override
    public void Execute() {}

    @Override
    public double getValue() {
        return value;
    }
}
