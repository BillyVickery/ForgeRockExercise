package criteria;

/**
 * Created by billyvickery on 24/06/2015.
 */
public interface Criterion {
    String getKey();
    boolean evaluate(final String value);
}
