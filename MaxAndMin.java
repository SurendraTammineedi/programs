package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1,1,2,8,9);
        int max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("max element is: "+max);
        int min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min is : "+min);



    }
}
