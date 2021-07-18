package com.algorithm.searching;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    static int binarySearch(List<Integer> elements, int x, int left, int right){
        if(left>right) return -1;

        int mid = (left+right)/2;
        if(elements.get(mid) == x){
            return mid;
        } else if(x < elements.get(mid)){
            return binarySearch(elements,x,left,mid-1);
        } else {
            return binarySearch(elements,x,mid+1,right);
        }


    }

    static int binarySearch(List<Integer> elements, int x){
        return binarySearch(elements,x,0,elements.size()-1);
    }

    public static void main(String[] args) {
        // linear search:
        List<Integer> elements = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println(binarySearch(elements,10));

    }
}
