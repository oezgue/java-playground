package codeWars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for (int i = 1; i < args.length; i++){
            if (smallest > args[i]){
                smallest = args[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] nums = {1,-1};
        //System.out.println(findSmallestInt(nums));
        IntStream.of(nums).min().getAsInt();
        Arrays.sort(nums);
        System.out.println(nums[0]);


    }
}
