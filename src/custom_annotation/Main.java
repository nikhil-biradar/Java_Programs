package custom_annotation;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
        Demo d = new Demo();
        Class c = d.getClass();
        System.out.println(c.getName());

        Nikhil annotation = (Nikhil) c.getAnnotation(Nikhil.class);
        System.out.println(annotation);
        System.out.println(annotation.myValue());
        System.out.println(annotation.myName());
        System.out.println(annotation.myCity());
    }
}