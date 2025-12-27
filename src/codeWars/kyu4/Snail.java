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
        int snailRouteLength = array.length* array.length;
        int n = array.length;
        int x = 0;
        int y = 0;
        route.add(array[y][x]);
        x++;
        while (n > 0) {

            //rechts
            for (int i = 1 ; i < n-1; i++){
                route.add(array[y][x]);
                x++;
            }

            //runter
            for (int i = 1; i < n; i++){
                route.add(array[y][x]);
                y++;
            }


//            //links
            for (int i = 1; i < n; i++){
                route.add(array[y][x]);
                x--;
            }
            n--;
//            //hoch
            for (int i = 1; i < n; i++){
                route.add(array[y][x]);
                y--;
            }
            n--;

        }


        return route.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[][] array = {   {10,2,3,4,50},
                            {4,51,6,71,8},
                            {7,8,9,6,4},
                            {1,11,1,41,4},
                            {20,3,4,5,60}};
        System.out.println(Arrays.toString(snail(array)));
    }

}
