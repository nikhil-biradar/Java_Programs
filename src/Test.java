

/*
import java.util.Scanner;

public class Test {
    int a;
    int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a:");
        int a = sc.nextInt();

        System.out.println("Enter value of b:");
        int b = sc.nextInt();

        Add ad = new Add();
        ad.a = a;
        ad.b = b;

        Sub sb = new Sub();
        sb.a = a;
        sb.b = b;

        Div dv = new Div();
        dv.a = a;
        dv.b = b;

        ad.add();
        sb.sub();
        dv.div();
    }
}


class Add extends Test {
    void add() {
        System.out.println("Addition: " + (a + b));
    }
}

class Sub extends Test {
    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }
}

class Div extends Test {
    void div() {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
*/


/*public class Test {
    public static void main(String[] args) {
        Test1.main(null);
    }

    static class Test1 {
        int b = 20;
        static int a = 10;
        public static void main(String[] args) {
            int a = 20;
            System.out.println(new Test1().b);
            System.out.println(new Test1().a);
            System.out.println(Test1.a);
        }
    }
}*/


/*interface A {
    static void show(){
        System.out.println("Default method in Interface A");
    }
}

interface B {
    static void show(){
        System.out.println("Default method in Interface B");
    }
}

public class Test implements A, B{
    public static void main(String[] args) {
        A.show();
        B.show();
    }
}*/


/*
public class Test {
    public static void main(String[] args) {
        int i = test();
        System.out.println(i);
    }

    public static int test(){
        int i = 10, j;
        return j = i++ + --i + ++i + ++i ;
    }
}
*/


/*
public class Test {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1 = "Hello" + "World";
        System.out.println(s1);
    }
}
*/


/*
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int count = 0;
        for(int i=1; i<=num; i++){
            if(num % i == 0)
                count++;
        }
        if(count == 2){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
}
*/

/*public class MethodChaining {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java").intern();

        System.out.println(System.identityHashCode(s1)); //refers scp
        System.out.println(System.identityHashCode("Java")); //refers scp

        System.out.println(System.identityHashCode("Java")); //refers scp
        System.out.println(System.identityHashCode(s2)); // refers heap

//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s2));
    }
}*/

/*
public class MethodChaining {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "";
        String s3 = "";
        String s4 = "Nikhil";
        String s5 = "Nikhil";

//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
    }
}
*/

/*public class MethodChaining {
    public static void main(String... args) {

        Integer x = 127;
        Integer y = 127;

        System.out.println(x.equals(y));
        System.out.println(x == y);
    }
}*/

/*public class MethodChaining{
    public static void main(String[] args) {
        int arr[] = {2,'b',1,'a',2,6,'a',3,'b',2,9,3,2,9,9,9,8,9,9};
        int maxfreq = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    maxfreq = arr[i];
                }
            }
        }
        System.out.print("Most frequent element is : " + maxfreq);
    }
}*/


/*public class MethodChaining {
    public static void main(String[] args) {
        String st1 = "java";
        String st2 = st1 + "world";
        String st3 = "world";

        System.out.println(st2);
        System.out.println(st1 == st2);
        System.out.println(st1 == st3);
    }
}*/

/*public class MethodChaining {
    void add(){
        System.out.println("add method");
    }
    public static void main(String [] args){
        MethodChaining t = new MethodChaining();
        t.add();
    }
}*/


/*
public class MethodChaining {
    public static void main(String[] args) {
        CustomArrayList<Integer> list1 = new CustomArrayList<>();

        list1.add(2);
        list1.add("Nikhil");
        list1.add(20.2f);
        list1.add(20L);
        list1.add(true);
        list1.add(false);

        list1.display();
    }
}*/

/*
public class MethodChaining implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        MethodChaining test = new MethodChaining();
        Thread t1 = new Thread(test, "A");
        Thread t2 = new Thread(test, "Two");
        Thread t3 = new Thread(test, "Three");
        t1.start();
        t2.start();
        t3.start();

        System.out.println(Thread.currentThread());
    }
}
*/

/*
public class MethodChaining extends Thread {
    public static void main(String[] args) {
        MethodChaining t = new MethodChaining();
        MethodChaining t2 = new MethodChaining();

        t.start();
        t2.start();
        System.out.println(Thread.currentThread());

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}
*/

/*
public class MethodChaining {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        s1 = "text";

        System.out.println(s1);
        System.out.println(s1 == s2);
        System.out.println(s1 == s2);
    }
}*/

/*
public class MethodChaining extends Thread {
    public static void main(String[] args) throws InterruptedException {
        MethodChaining thread1 = new MethodChaining();
        thread1.setName("Ramesh");

        MethodChaining thread2 =  new MethodChaining();
        thread2.setName("Suresh");

        MethodChaining thread3 =  new MethodChaining();
        thread3.setName("Kamlesh");

        thread1.start();

        thread2.start();

        thread3.start();

    }

    @Override
    public void run() {
        synchronized (this) {
            for(int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + " and index is "+i);
            }
        }
    }
}*/


/*
//Exception in double data type
public class MethodChaining {
    public static void main(String[] args) {

        float d = 0/0.0f;
        System.out.println(d);
    }
}
*/

//Finally doesn't execute
/*
class MethodChaining {
    public static void main(String[] args) {
        try{
            System.out.println("Try Block");
            System.exit(0);
            System.gc();
        }finally{
            System.out.println("Catch Block");
        }
    }
}
*/


/*
public class MethodChaining {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "java";
        String s3 = "Java";
        String s4 = "Javaa";
        String s5 = "Javak";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));catch
        System.out.println(s4.compareTo(s5));
    }
}
*/

//Arithmetic Exception
/*
public class MethodChaining {
    public static void main(String[] args) {

        try
        {
            int c = 10/0;
            System.out.println(c);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("A number cannot be divided by zero");
        }
    }
}
*/


/*
//Palindrome Number using charAt() method
class MethodChaining {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        String str = sc.nextLine();
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
*/

/*
//Palindrome Number
class MethodChaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int temp = num, rev = 0;

        while(temp != 0){
            rev = temp % 10 + rev * 10;
            temp /= 10;
        }

        if(num == rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
*/

/*
// CompareTo case of String
public class MethodChaining {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "java";
        String s3 = "Javaa";
        String s4 = "Java";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s3)); //0

    }
}
*/

/*
//Static
class MethodChaining
{
    // static variable
     static int a =12;

    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }

    // static method(main !!)
    public static void main(String[] args)
    {
        System.out.println("Value of a : "+ a);
        System.out.println("from main");
        MethodChaining.m1();

        String s1 = "Nikhil";
        StringBuffer sb = new StringBuffer("Nikhil");
        StringBuffer sb1 = new StringBuffer("Nikhil");

        System.out.println(sb1 == sb);
    }
}
*/

/*
public class MethodChaining {
    public static void main(String[] args) {

        String s1 = "Nikhil";
        String s2 = "Nikhil";
        String s3 = s1.concat("Biradar");

        String s4 = "Nikhil" + " Biradar";

        System.out.println(s4);

        System.out.println(s1 == s4);

    }
}
*/



//Intern Method
/*
public class MethodChaining {
    public static void main(String[] args) {

        String s1 = "Sharma";
        String s2 = new String("Sharma");
        s2 = s2.intern();

        System.out.println(s1 == s2);
    }
}
*/

// subString Method
/*
public class MethodChaining {
    public static void main(String[] args) {

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2,3);
        System.out.println(c);
        String d = cde.substring(1, 2);
        System.out.println(d);
    }
}
*/

// String Creation and checking by using equality Operator
/*
public class MethodChaining {
    public static void main(String[] args) {

        String s1 = "Nikhil";
        System.out.println(s1);

        String s2 = new String("Nikhil");
        System.out.println(s2);

        char [] arr = {'N', 'i', 'k', 'h', 'i', 'l'};
        String s3 = new String(arr);
        System.out.println(s3);

        System.out.println(s1 == s2); //false
        System.out.println(s1 == s3); //false
        System.out.println(s2 == s3); //false
    }
}
*/


//Equal Operator of String class
/*
public class MethodChaining {
    public static void main(String[] args) {

        String s1 = " Nikhil";
        String s2 = " Nikhil";
        String s3 = " Nikhil";
        String s4 = " Nikhil";
        s1 = s1.concat("Biradar");

        System.out.println(s1 == s2 && s2 == s3 && s3 == s4);
    }
}
*/

//CompareToIgnoreCase of Strings
/*
import java.util.Scanner;

public class MethodChaining {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String s1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter String s2 : ");
        String s2 = sc.nextLine();

        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
*/


//Inheritance
/*
class MethodChaining {

    int a;
    int b;

    MethodChaining(){
        System.out.println(a + " " + b);
    }

    MethodChaining(int a, int b){
        System.out.println(a + " " +b);
    }

    public static void main(String[] args) {
        MethodChaining a = new MethodChaining(20, 30);
        MethodChaining b = new MethodChaining();
    }
}

class A extends MethodChaining {

    public static void main(String[] args) {
        MethodChaining a = new MethodChaining();

    }
}
*/

//BinarySearch Array Method
/*
import java.util.Arrays;
public class MethodChaining {
    public static void main(String[] args)
    {
        // Creating a sorted array of int and char types.
        int[ ] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index of element 11 is " + Arrays.binarySearch(list, 11));
        System.out.println("2. Index of element 12 is " + Arrays.binarySearch(list, 5));

        char[ ] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index of element 'a' is " + Arrays.binarySearch(chars, 'a'));
        System.out.println("4. Index of element 't' is " + Arrays.binarySearch(chars, 't'));

        // Creating unsorted array.
        int[ ] num = {25, 35, 10, 45, 20, 30};
        Arrays.sort(num); // Sorting array.
        System.out.println("5. Index of element 45 is " +Arrays.binarySearch(num, 45));
    }
}
*/

//toString Array Method
/*
public class MethodChaining {
    public static void main(String[] args) {
        // Array of strings
        String[] fruits = {"Cherry", "Apple", "Banana", "App"};

        // Using Arrays.toString() to convert the array to a string
        String result = Arrays.toString(fruits);

        // Printing the result
        System.out.println(result); // Output: [Apple, Banana, Cherry]
    }
}
*/


/*
//Constructor Chaining

class Test1 {
    public Test1() {
        this(12);
        System.out.println("No-arg Constructor Test1");
    }

    public Test1(int m) {
        this("JJ", 45);
        System.out.println("1-arg Constructor Test1");
    }

    public Test1(String m, int n) {
        System.out.println("2-arg Constructor Test1");
    }
}

public class MethodChaining extends Test1 {
    public MethodChaining() {
        this(23, "Aa");
        System.out.println("No-arg Constructor MethodChaining");
    }

    public MethodChaining(int a, String b) {
        this("aa", 12, true);
        System.out.println("2-arg Constructor MethodChaining");
    }

    public MethodChaining(String a , int b, boolean c) {
        System.out.println("3-arg Constructor MethodChaining");
    }

    public static void main(String[] args) {
        MethodChaining t = new MethodChaining();

    }
}
*/