package practice_programs.basic;

public class SmallestElement {
    public static void main(String[] args) {
        int [] arr = {23, 68, 34, 91, 64, 52, 64};
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }
}