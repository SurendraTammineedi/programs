package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class OddEvenNumbers {

    public static void main(String[] args) {

        //square , filter and perform avg
        List<Integer> l1 = Arrays.asList(1,10,20,30,15);
            List<Integer> even=l1.stream().filter(i->(i%2==0)).collect(Collectors.toList());
        List<Integer> odd=l1.stream().filter(i->(i%2!=0)).collect(Collectors.toList());
        System.out.println("even values :"+even);
        System.out.println("odd values :"+odd);

    }
}
