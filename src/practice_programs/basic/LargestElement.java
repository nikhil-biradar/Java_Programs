package practice_programs.basic;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 76, 30, 42, 20};
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
