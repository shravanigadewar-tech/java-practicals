class PaperPattern {

    static void printPattern(int n) {

        String ch = "X";
        String sp = " ";

        if (n % 2 == 0) {
            System.out.println(
                "The entered value " + n + " is not odd. Please enter an odd size."
            );
            return;
        }

        for (int i = 0; i < n; i++) {

            int leftSpace = Math.min(i, n - i - 1);
            int middleSpace = n - 2 * leftSpace - 2;

            if (middleSpace < 0) {
                // middle row
                System.out.println(sp.repeat(leftSpace) + ch);
            } else {
                System.out.println(
                    sp.repeat(leftSpace) +
                    ch +
                    sp.repeat(middleSpace) +
                    ch
                );
            }
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}