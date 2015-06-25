package predicate;

import com.google.common.base.Preconditions;

import java.util.Map;

/**
 * Created by billyvickery on 24/06/2015.
 */
public class LessThanPredicate <T extends Comparable> implements Predicate<T> {

    private T lhs;
    private T rhs;

    @Override
    public boolean evaluate() {
        Preconditions.checkState(lhs != null);
        Preconditions.checkState(rhs != null);
        return lhs.compareTo(rhs) < 0;
    }

    @Override
    public Predicate<T> setLhs(final T lhs) {
        this.lhs = lhs;
        return this;
    }

    @Override
    public Predicate<T> setRhs(final T rhs) {
        this.rhs = rhs;
        return this;
    }
}
