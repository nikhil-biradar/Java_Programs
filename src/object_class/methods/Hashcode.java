package object_class.methods;

public class Hashcode {
    int i;
    public Hashcode(Integer i) {
        this.i = i;
    }

    public static void main(String[] args) {

        Hashcode obj = new Hashcode(10);
        System.out.println(obj.hashCode());
        System.out.println(obj.toString().hashCode());


        Integer obj1 = new Integer(20);
        String s1 = new String("java");
        String s2 = new String("20");


        System.out.println(obj1.toString().hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}