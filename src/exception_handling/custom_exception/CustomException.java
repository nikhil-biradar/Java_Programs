package exception_handling.custom_exception;

public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            CustomException obj = new CustomException("This is a Custom Exception");
            throw obj;
        }catch (CustomException ce){
            System.out.println(ce.getMessage());
        }
    }
}