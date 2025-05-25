package design_patterns.singleton_pattern;

public class BreakUsingReflection {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}