package java8.lambda_expressions;

public interface Test {
    int getNumber() throws ArithmeticException;
}

class Demo {
    public static void main(String[] args) {
        Test den = () -> {
            System.out.println(10/0);
            return 0;
        };
        System.out.println(den.getNumber());
    }
}