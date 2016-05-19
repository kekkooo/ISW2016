/**
 * Created by francescousai on 19/05/16.
 */
public class ShufflingStrategySkip3 extends ShufflingStrategy {

    int current = 0;

    @Override
    public int getNextIndex() {
        this.current = (current + 3) % numberOfItems;
        return current;
    }

    @Override
    public void setNumOfItems(int numOfItems) {
        if( numOfItems < 0 ){ throw new IllegalArgumentException( "number of items cannot be negative" ); }
        this.numberOfItems = numOfItems;
    }
}
