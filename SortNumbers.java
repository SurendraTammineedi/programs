package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,6,1,2);

       List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());

        List<Integer> sortedDescList=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("sortedList : "+sortedList);
        System.out.println("Sort in desc: "+sortedDescList);
    }
}
