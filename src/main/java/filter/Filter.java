package filter;

import criteria.Criterion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by billyvickery on 24/06/2015.
 */
public class Filter {
    private final List<Criterion> criteria = new ArrayList<>();

    public boolean matches(final Map<String, String> resource) {

        boolean matches = true;
        for (String key : resource.keySet()) {
            for (Criterion criterion : criteria) {
                if (criterion.getKey().equals(key)) {
                    if (! criterion.evaluate(resource.get(key))) {
                        matches = false;
                    }
                }
            }
        }
        return matches;
    }
    public Filter addCriterion(final Criterion criterion) {
        criteria.add(criterion);
        return this;
    }
}
