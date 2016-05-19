/**
 * Created by francescousai on 19/05/16.
 */
public abstract class ShufflingStrategy {
    protected int numberOfItems;
    public abstract int getNextIndex();
    public abstract void setNumOfItems( int numOfItems);
}
