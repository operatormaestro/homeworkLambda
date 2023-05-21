import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Calculator {
    @SuppressWarnings("Convert2MethodRef")
    static Supplier instance = () -> new Calculator();
    @SuppressWarnings("Convert2MethodRef")
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) ->  {
        try {
            return (x / y);
        } catch (ArithmeticException e){
            System.out.println("Error. You can`t be divided by zero!");
            System.exit(0); // Выхожу из программы, потому как при делении на ноль возникает неопределенность, при этом лямбда-выражение должно вернуть число, а в классе Integer нет NaN.
        } return 0;
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
    Consumer<Boolean> printlnBoolean = System.out::println;
}
