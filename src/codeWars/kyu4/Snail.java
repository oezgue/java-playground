package codeWars.kyu4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Snail Sort
//
//Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
//
//array = [[1,2,3],
//        [4,5,6],
//        [7,8,9]]
//snail(array) #=> [1,2,3,6,9,8,7,4,5]

public class Snail {

    public static int[] snail(int[][] array) {
        List<Integer> route = new ArrayList<>();
        int n = array.length;
        int x = -1;
        int y = 0;

        while (n > 0) {
            //rechts
            for (int i = 0 ; i < n; i++){
                x++;
                route.add(array[y][x]);
            }
            //runter
            for (int i = 1; i < n; i++){
                y++;
                route.add(array[y][x]);
            }
            //links
            for (int i = 1; i < n; i++){
                x--;
                route.add(array[y][x]);
            }
            n--;
            //hoch
            for (int i = 1; i < n; i++){
                y--;
                route.add(array[y][x]);
            }
            n--;

        }
        return route.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[][] array = {   {10,2,3,40},
                            {4,51,6,7},
                            {7,8,9,6},
                            {10,11,1,40}
                            };
        System.out.println(Arrays.toString(snail(array)));
    }

}
