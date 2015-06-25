package predicate;

/**
 * Created by billyvickery on 24/06/2015.
 */
public interface Predicate<T extends Object>  {
    boolean evaluate();
    Predicate<T> setLhs(final T lhs);
    Predicate<T> setRhs(final T rhs);
}
