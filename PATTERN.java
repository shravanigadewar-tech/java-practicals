class PATTERN {

    public static void main(String[] args) {

        int n = 9;

        if (n % 2 == 0) {
        System.out.println("Invalid size");
        return;
        }

        System.out.println("LOGIC 1:\n");
        logic1(n);

        System.out.println("\nLOGIC 2:\n");
        logic2(n);

        System.out.println("\nLOGIC 3:\n");
        logic3(n);
    }

    // ---------------- LOGIC 1 ----------------
    // Using repeat() directly
    static void logic1(int n) {

        String s = "*";
        String sp = " ";

        int mid = n / 2;

        for (int i = 0; i < n; i++) {

            int outer = Math.abs(mid - i);
            int inner = n - 2 * outer - 2;

            if (inner < 0) {
                System.out.println(sp.repeat(outer) + s);
            } else {
                System.out.println(sp.repeat(outer) + s + sp.repeat(inner) + s);
            }
        }
    }

    // ---------------- LOGIC 2 ----------------
    // Using substring()
    static void logic2(int n) {

        String s = "*";
        String sp = "          "; // space buffer

        int mid = n / 2;

        for (int i = 0; i < n; i++) {

            int outer = Math.abs(mid - i);
            int inner = n - 2 * outer - 2;

            if (inner < 0) {
                System.out.println(sp.substring(0, outer) + s);
            } else {
                System.out.println(
                        sp.substring(0, outer) + s +
                        sp.substring(0, inner) + s
                );
            }
        }
    }

    // ---------------- LOGIC 3 ----------------
    // Using replace()
    static void logic3(int n) {

        String s = "*";
        String sp = "X";

        int mid = n / 2;

        for (int i = 0; i < n; i++) {

            int outer = Math.abs(mid - i);
            int inner = n - 2 * outer - 2;

            String outSpace = sp.repeat(outer).replace("X", " ");

            if (inner < 0) {
                System.out.println(outSpace + s);
            } else {
                String inSpace = sp.repeat(inner).replace("X", " ");
                System.out.println(outSpace + s + inSpace + s);
            }
        }
    }
}