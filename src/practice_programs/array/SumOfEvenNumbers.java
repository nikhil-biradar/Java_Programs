package practice_programs.array;

import java.util.Arrays;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int array [] = {2, 3, 6, 8, 5, 9};
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0)
                sum += array[i];
        }
        System.out.println("Sum of even numbers in array is : " + sum);

        // stream

        int array2 [] = {2, 3, 6, 8, 5, 9};
        int sum2 = Arrays.stream(array2).filter(n -> n % 2 == 0).sum();
    }
}
