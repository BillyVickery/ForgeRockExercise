package predicate;

import java.util.Map;

/**
 * Created by billyvickery on 24/06/2015.
 */
public class TrueOrFalsePredicate {
    public boolean trueOrFalse(String key, String value, Map<String, String> map){
        boolean trueOrFalse = false;

        if(map.get(key).equals(value)){
            trueOrFalse = true;
        }

        return trueOrFalse;
    }
}
