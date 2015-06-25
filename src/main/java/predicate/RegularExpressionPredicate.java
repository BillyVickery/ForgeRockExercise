package predicate;

import com.google.common.base.Preconditions;

/**
 * Created by billyvickery on 24/06/2015.
 */
public class RegularExpressionPredicate <T extends String> implements Predicate<T>{
    private T lhs;
    private T rhs;

    @Override
    public boolean evaluate() {
        Preconditions.checkState(lhs != null);
        Preconditions.checkState(rhs != null);
        return lhs.matches(rhs);
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
