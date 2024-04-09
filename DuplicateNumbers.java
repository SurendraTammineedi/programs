package streams;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {

    public static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,2,2,4,4,4,4,8,9,9,9);

        //1 approach

//        Set<Integer> dupNum=new HashSet<>();
//             Set<Integer> dup=list.stream().filter(e->!dupNum.add(e)).collect(Collectors.toSet());
//        System.out.println(dup);


        //2nd easy approach

       Set<Integer> dupElements= list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toSet());
        System.out.println("dup elements are: "+dupElements);
    }
}
