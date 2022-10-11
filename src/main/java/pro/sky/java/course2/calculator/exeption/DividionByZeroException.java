package pro.sky.java.course2.calculator.exeption;

public class DividionByZeroException extends IllegalArgumentException{
    public DividionByZeroException() {
    }

    public DividionByZeroException(String s) {
        super(s);
    }

    public DividionByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DividionByZeroException(Throwable cause) {
        super(cause);
    }
}
