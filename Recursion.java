
import java.util.Scanner;

class Recursion {

    static String str = "*";
    static String spc = " ";

    static void evenUpper(int n, int i) {
        if (i < 1) return;

        System.out.println(spc.repeat(i - 1) + str.repeat(n - i) + str.repeat(n - i - 1));
        evenUpper(n, i - 2);
    }

    static void evenLower(int n, int i) {
        if (i >= n) return;

        System.out.println(spc.repeat(i - 1) + str.repeat(n - i) + str.repeat(n - i - 1));
        evenLower(n, i + 2);
    }

    static void oddUpper(int n, int i) {
        if (i < 0) return;

        System.out.println(spc.repeat(i) + str.repeat(n - i) + str.repeat(n - i - 1));
        oddUpper(n, i - 2);
    }

    static void oddLower(int n, int i) {
        if (i >= n) return;

        System.out.println(spc.repeat(i) + str.repeat(n - i) + str.repeat(n - i - 1));
        oddLower(n, i + 2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            evenUpper(n, n - 1);
            evenLower(n, 1);
        } else {
            oddUpper(n, n - 1);
            oddLower(n, 2);
        }
    }
}
