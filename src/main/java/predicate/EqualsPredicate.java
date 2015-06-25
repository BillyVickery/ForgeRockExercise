package predicate;

import com.google.common.base.Preconditions;

/**
 * Created by billyvickery on 24/06/2015.
 */
public class EqualsPredicate<T extends Object> implements Predicate<T> {
    private Object lhs;
    private Object rhs;

    @Override
    public boolean evaluate() {
        Preconditions.checkState(lhs != null);
        Preconditions.checkState(rhs != null);
        return lhs.equals(rhs);
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
