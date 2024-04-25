package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.stream;

public class StreamsSum {

    public static void main(String[ ]args){
        List<Integer>  l1=Arrays.asList(1,2,3,4);
        Optional<Integer> sum=l1.stream().reduce((a, b)->(a+b));
        System.out.println("sum is: "+sum.get());

    }
}
