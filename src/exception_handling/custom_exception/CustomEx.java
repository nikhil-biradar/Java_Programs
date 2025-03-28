package exception_handling.custom_exception;

//Custom Exception with default Constructor
public class CustomEx extends Exception {

    public CustomEx(){
        super();
    }

    public static void main(String[] args) {

        try{
            CustomEx obj =  new CustomEx();
            throw obj;

        } catch (CustomEx e) {
            System.out.println("Custom Exception Occurs");
        }
    }
}