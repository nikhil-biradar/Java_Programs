package practice_programs.basic;

public class LargestElement {
    public static void main(String[] args) {
        int arr [] = {10, 25, 76, 30, 42, 20};
        int max = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
