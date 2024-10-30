package lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<String>();
        nameList.add("John");
        nameList.add("Jane");
        nameList.add("Bob");
        nameList.add("Mary");
        nameList.add("Jack");
        nameList.add("Jane");
        // лямбда выражение
        Predicate<String> isContainsJ = name -> name.contains("J") || name.contains("j");



        for (String names : nameList) {
            if (isContainsJ.test(names)) {
                System.out.println(names + " - пропускаю");


            }else{
                System.out.println(names + "  - не пропускаю");
            }


        }



    }
}
