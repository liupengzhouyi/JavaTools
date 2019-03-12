package 集合.List体系;

import java.util.ArrayList;
import java.util.List;

public class dome02 {

    public static void main(String[] args) {

        List<String> listOfString = new ArrayList<>();

        // JDK 7 中 引入

        listOfString.add("asd");

        listOfString.add("uyg");

        for (String string : listOfString
            ) {
            System.out.println(string);
        }



    }

}
