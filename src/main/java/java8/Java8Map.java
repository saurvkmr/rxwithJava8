package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8Map {

    private static void squareANumber(List<Integer> numList) {
        long start = System.currentTimeMillis();
        //numList.parallelStream().map( s -> s*s).forEach(System.out::println);

        //numList.stream().map( element -> element * element).forEach(System.out::println);
        numList.stream().filter(e -> e%2 == 0).forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Time taken %d millisecond", (end-start)));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(2000);
        int i = 1;
        while(i <= 20) {
            list.add(i);
            i++;
        }
        //squareANumber(Arrays.asList(1,2,3,4,5,6,7,8,9));
        squareANumber(list);
    }
}
