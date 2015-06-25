import criteria.IntegerCriterion;
import criteria.StringCriterion;
import filter.Filter;
import org.junit.Test;
import predicate.*;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by billyvickery on 23/06/2015.
 */
public class FilterTest {
        final Map<String, String> resource = new LinkedHashMap<String, String>() {{
            put("firstname", "Joe");
            put("surname", "Bloggs");
            put("role", "administrator");
            put("age", "35");
        }};
    @Test
    public void testFilterMatches(){
        final Filter filter = new Filter()
                .addCriterion(new StringCriterion("role", "administrator", new EqualsPredicate()))
                .addCriterion(new IntegerCriterion("age", 35, new EqualsPredicate<Integer>()));

        assertThat(filter.matches(resource), is(true));
    }
    @Test
    public void testFilterLessThanPredicate(){
        final Filter filter = new Filter()
                .addCriterion(new IntegerCriterion("age", 20, new LessThanPredicate<Integer>()));

        assertThat(filter.matches(resource), is(true));
    }
    @Test
    public void testFilterGreaterThanPredicate(){
        final Filter filter = new Filter()
                .addCriterion(new IntegerCriterion("age", 40, new GreaterThanPredicate<Integer>()));

        assertThat(filter.matches(resource), is(true));
    }
    @Test
    public void testAndPredicate(){
        final Filter filter = new Filter()
                .addCriterion(new StringCriterion("firstname", "Joe", new RegularExpressionPredicate()));

        assertThat(filter.matches(resource), is(true));

    }
    @Test
    public void printResource() {
        for (Map.Entry<String, String> kvPair: resource.entrySet()) {
            System.out.println(kvPair.getKey()+":"+kvPair.getValue());
        }
    }
}
