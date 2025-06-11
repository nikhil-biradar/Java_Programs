package errors;

public class OutOfMemoryError {
    public static void main(String[] args) {
        int [] arr = new int [1000 * 1000 * 1000];
    }
}