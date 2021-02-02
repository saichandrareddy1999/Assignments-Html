package com.stackroute;
import java.util.*;

class Addition {
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

        System.out.println("without stream");
        for (Integer num : list)
            if (num % 2 == 0) {
                sum = sum + num;
            }
        System.out.println(sum);
    }

}
