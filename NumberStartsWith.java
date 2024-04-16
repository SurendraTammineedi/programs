package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {


    public static void main(String[] args) {
        //starts with 2 either negative or positive numbers


        List<Integer> l1 = Arrays.asList(1,-233, 2, 3, 24,56,234,666,2450);
       List<Integer> startsWith2= l1.stream().map(e->String.valueOf(e))
                .filter(e->e.startsWith("2") || e.startsWith("-2"))
                .map(e->Integer.valueOf(e))
                .collect(Collectors.toList());
        System.out.println("starts with 2: "+startsWith2);
    }
}