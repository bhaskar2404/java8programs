package java8pro.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,5,4,3,5,6,7,8,3,34,98,9);

        List<Integer> even=numbers.stream().filter(x->x%2==0).toList();
        System.out.println(even);

        List<Integer> add=numbers.stream().filter(x->x%2!=0).toList();
        System.out.println(add);
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect);




        Stream<Integer> random=Stream.generate(()->(new Random()).nextInt(100));

        random.limit(500).forEach(System.out::println);
    }
}
