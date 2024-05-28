public class Fibonacci {
    public static int fib(int n) {
        return (n <= 1) ? n : fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fib(n));
    }
}
