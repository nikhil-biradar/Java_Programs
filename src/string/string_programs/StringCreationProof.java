package string.string_programs;

public class StringCreationProof {

    public static void main(String[] args) {
        String s1 = "Nikhil";
        String s2 = new String("Nikhil");

        System.out.println(System.identityHashCode(s1)); //refers scp
        System.out.println(System.identityHashCode("Nikhil")); //refers scp

        System.out.println(System.identityHashCode("Nikhil")); //refers scp
        System.out.println(System.identityHashCode(s2)); // refers heap
    }
}