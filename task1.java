
class task1 {
    static long rfact(long n) {
        if (n == 0 || n == 1)
            return 1;

        if (n < 0) {
            System.out.println("n should be greater than 0");
            return 0;
        }

        return n * rfact(n - 1);  
    }
    static long ifact(long n){

        if (n < 0) {
            System.out.println("n should be greater than 0");
            return 0;
        }

        long total = 1;

        for(long i = 1; i <= n; i++){
            total = total * i;
        }

        return total;
    }

    public static void main(String[] args) {

        long n = 4;

        long result = rfact(n);
        System.out.println("Recursive Factorial of " + n + " is: " + result);

        long result1 = ifact(n);
        System.out.println("Iterative Factorial of " + n + " is: " + result1);
    }
}