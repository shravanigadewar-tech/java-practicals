class Charat {
    public static void main(String[] args) {

        try {

            // Condition 1.1 : Minimum 2 arguments required
            if (args.length < 2) {
                System.out.println("Error: Two arguments required.");
                System.out.println("Usage: java Foreach 'char' 'string'");
                return;
            }

            // Condition 1.2 : More than 2 arguments
            if (args.length > 2) {
                System.out.println("Note: Extra arguments found. Skipping excess arguments...");
            }

            // First argument
            String first = args[0];

            // Condition 1.3 : First input more than one character
            if (first.length() > 1) {
                System.out.println("Error: First argument must be exactly one character.");
                return;
            }

            // Condition 1.1 : Empty first input
            if (first.length() == 0) {
                System.out.println("Error: First argument cannot be empty.");
                return;
            }

            char ch = first.charAt(0);
            String s = args[1];

            int count = 0;

            // Count occurrences
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ch) {
                    count++;
                }
            }

            System.out.println("Count = " + count);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing command line arguments.");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
    }
}
