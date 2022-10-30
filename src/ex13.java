public class ex13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Розмір масиву =" + l);
            int h = 10 / l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Ділення на нуль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Індекс не існує");
        }
    }
}
