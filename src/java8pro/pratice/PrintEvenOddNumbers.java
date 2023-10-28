package java8pro.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,5,4,3,5,6,7,8,3,34,98,9);

        List<Integer> even=numbers.stream().filter(x->x%2==0).toList();
        System.out.println(even);

        List<Integer> add=numbers.stream().filter(x->x%2!=0).toList();
        System.out.println(add);
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect);

    }
}
