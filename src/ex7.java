public class ex7 {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new NullPointerException("Помилка");
        } catch (NullPointerException e) {
            System.out.println("1" );
            throw new ArithmeticException("Помилка");
        } catch (ArithmeticException e) {
            System.out.println("2" );
        }
        System.out.println("3");
    }
}
