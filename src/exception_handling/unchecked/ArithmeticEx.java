package exception_handling.unchecked;

import java.util.ArrayList;
import java.util.List;

//Exception Occurs if divide by 0
public class ArithmeticEx {
    public static void main(String[] args) {

        List<T> list = new ArrayList<>();

        //Exception Occurs
        System.out.println("A");
        System.out.println("Two");
//        System.out.println(10/0); //Exception Occurs at this line


        //Exception Handled
        try{
            System.out.println(10/0);
        } catch (Throwable ae) {
            System.out.println("Number cannot be divided by zero");
        }

        System.out.println("Three");
        System.out.println("Four");
    }
}