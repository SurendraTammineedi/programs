package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);

        //limit to first 5 (get)
        System.out.println(list.stream().limit(5).collect(Collectors.toList()));

        //sum of first 5
        System.out.println("sum of first 5:"+list.stream().limit(5).reduce((p,q)->p+q).get());

        //skip first 5
        System.out.println("skip first 5 and perform addition for remaining: "
        +list.stream().skip(5).reduce((p,q)->p+q).get());
    }
}
