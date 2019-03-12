package 集合.Map体系;

import java.util.HashMap;
import java.util.Map;

public class dome {

    public static void main(String[] args) {

        Map<String, String> mapOfStringToString = new HashMap<>();

        mapOfStringToString.put("a", "aa");

        mapOfStringToString.put("b", "bb");

        mapOfStringToString.put("c", "cc");

        System.out.println(mapOfStringToString.get("c"));

        for (Object o :
                mapOfStringToString.keySet()) {
            System.out.println(o.toString());
        }

    }

}
