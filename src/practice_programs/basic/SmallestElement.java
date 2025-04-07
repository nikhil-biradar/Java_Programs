package practice_programs.basic;

public class SmallestElement {
    public static void main(String[] args) {
        int [] arr = {23, 68, 34, 91, 64, 52, 64};
        int min = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}