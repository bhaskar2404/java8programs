package java8pro.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,5,4,3,5,6,7,8,3,34,98,9);

        List<Integer> even=numbers.stream().filter(x->x%2==0).toList();
        System.out.println(even);


    }
}
