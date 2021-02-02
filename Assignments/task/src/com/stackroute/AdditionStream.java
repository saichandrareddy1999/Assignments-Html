package com.stackroute;
import java.util.*;
import java.util.stream.IntStream;

class AdditionStream {
    public static void main(String[] args) {
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("with stream");
        int Even= IntStream.of(1,5,6,7,8,9,10).filter(n->n%2==0).sum();
        System.out.println(Even);
    }

}
