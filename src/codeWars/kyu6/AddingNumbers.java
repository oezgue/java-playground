package codeWars.kyu6;

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
//
//        Note: If a number is a multiple of both 3 and 5, only count it once.
//
//Courtesy of projecteuler.net (Problem 1)


import java.util.ArrayList;
import java.util.List;

public class AddingNumbers {
    public int solution(int number) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < number; i++){
            if (i%3 == 0 || i%5 == 0){
                list.add(i);
            }
        }

        return list.stream().mapToInt(i->i.intValue()).sum();
    }

    public static void main(String[] args) {
        AddingNumbers addie = new AddingNumbers();
        System.out.println(addie.solution(10));
    }
}
