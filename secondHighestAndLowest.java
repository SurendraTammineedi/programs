package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class secondHighestAndLowest {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,1,1,1,3,3,3,4,5,6,7,8,38,38,40,40);

        //second highest
        int secH=list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("second highest: "+secH);

        //second lowest
        int secL=list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("second lowest: "+secL);
    }
}
