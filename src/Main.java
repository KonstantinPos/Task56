public class Main {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(fib(51));
        long t = time() - a;
        System.out.println("Прошло " + t / 1000 + " секунд");
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    static long time() {
        long q = System.currentTimeMillis();
        return q;
    }
}

