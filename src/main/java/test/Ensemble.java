package test;

/**
 * Created by simjunbo on 2018-11-11.
 */
public enum Ensemble {
    SOLD, DUET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
