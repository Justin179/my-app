package com.algorithm.searching;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    static int linearSearch(List<Integer> elements, int x){
        for (int i = 0; i<elements.size(); i++){
            if(elements.get(i) == x){
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
          // linear search:
        List<Integer> elements = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(linearSearch(elements,3));

    }
}
