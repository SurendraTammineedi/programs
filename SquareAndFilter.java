package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndFilter {
    public static void main(String[] args) {

        //square , filter and perform avg
        List<Integer> l1 = Arrays.asList(1,10,20,30,15);
       double avg=l1.stream().map(e->e*e).filter(i->i>100).mapToInt(e->e).average().getAsDouble();
        System.out.println("filtered list: "+avg);

    }
}