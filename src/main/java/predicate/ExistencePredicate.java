package predicate;

import java.util.Map;

/**
 * Created by billyvickery on 24/06/2015.
 */
public class ExistencePredicate {
    public boolean checkExistence(String key, Map<String, String> map){
        boolean value = false;

        if(!map.isEmpty()){
            if(map.containsKey(key)){
                value = true;
            }
        }
        return value;
    }
}
