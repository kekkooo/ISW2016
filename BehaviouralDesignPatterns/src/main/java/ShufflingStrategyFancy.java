/**
 * Created by francescousai on 19/05/16.
 */

public class ShufflingStrategyFancy extends ShufflingStrategy {

    int current = 1;

    @Override
    public int getNextIndex() {
        this.current = (current * 2) % numberOfItems;
        return current;
    }

    @Override
    public void setNumOfItems(int numOfItems) {
        if( numOfItems < 0 ){ throw new IllegalArgumentException( "number of items cannot be negative" ); }
        this.numberOfItems = numOfItems;
    }
}