package 集合.Set体系;

import java.util.HashSet;
import java.util.Set;

public class dome01 {

    public static void main(String[] args) {

        Set<String> setOfString = new HashSet<String>();

        setOfString.add("asd");

        setOfString.add("qwe");

        setOfString.add("asd");

        for (String string : setOfString
             ) {
            System.out.println(string);
        }

        System.out.println(setOfString.size());

    }

}
