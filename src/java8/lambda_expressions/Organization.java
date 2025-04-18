package java8.lambda_expressions;

@FunctionalInterface
public interface Organization {
    String getSalary();
}

class Test1 {
    public static void main(String[] args) {
        Organization org = new Organization() {
            @Override
            public String getSalary() {
                return "100";
            }
        };
        System.out.println("Using Anonymous inner Class : " + org.getSalary());

        Organization org1 = () -> {
            return "200";
        };

        System.out.println("Using Lambda Expression : " + org1.getSalary());
    }
}