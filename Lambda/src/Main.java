public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(2, 1);
            int c = calc.devide.apply(a, b); // Возникает ошибка при делении на ноль, поскольку b = 1 - 1, b = 0. Чтобы обработать ошибку используем try-catch.
            int d = calc.multiply.apply(a, b);
            int e = calc.pow.apply(a);
            int f = calc.abs.apply(c);
            boolean g = calc.isPositive.test(b);
            calc.println.accept(c);
            calc.println.accept(d);
            calc.println.accept(e);
            calc.println.accept(f);
            calc.printlnBoolean.accept(g);
    }
}