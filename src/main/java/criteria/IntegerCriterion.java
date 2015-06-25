package criteria;

import com.google.common.base.Preconditions;
import predicate.Predicate;

/**
 * Created by billyvickery on 24/06/2015.
 */
public class IntegerCriterion implements Criterion {
    private final Predicate<Integer> predicate;
    private final String key;
    private final Integer lhs;

    public IntegerCriterion(final String key, final Integer value, final Predicate<Integer> predicate) {
        Preconditions.checkArgument(key != null);
        Preconditions.checkArgument(value != null);
        Preconditions.checkArgument(predicate != null);
        this.key = key;
        this.lhs = value;
        this.predicate = predicate;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public boolean evaluate(final String rhs) {
        Preconditions.checkArgument(rhs != null);
        return predicate.setLhs(this.lhs).setRhs(Integer.parseInt(rhs)).evaluate();
    }
}
