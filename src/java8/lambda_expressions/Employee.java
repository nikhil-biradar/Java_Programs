package java8.lambda_expressions;

@FunctionalInterface
public interface Employee {
    String getName();
}

class Company {
    //before java 1.8 we need to override method
//    @Override
//    public String getName() {
//        return "Nikhil ";
//    }

    /// after java 1.8 using lambda expressions

    public static void main(String[] args) {
        Employee emp = () -> {
            try{
                System.out.println(10/0);
            }catch (ArithmeticException ae){
                System.out.println(ae.getMessage());
            }
            return "Nikhil";
        };
        System.out.println(emp.getName());
    }
}