package 集合.List体系;

import java.util.ArrayList;
import java.util.List;

public class dome01 {

    public static void main(String[] args) {

        //显式语法

        List<String> listOfString = new ArrayList<String>();

        listOfString.add("aa");

        listOfString.add("bb");

        for (String string : listOfString
             ) {
            System.out.println(string);
        }

    }

}
