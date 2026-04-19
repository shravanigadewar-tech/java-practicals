
class Indexof {
    public static void main(String[] args) {

        try {

            // 1.1 Minimum two arguments required
            if (args.length < 2) {
                System.out.println("Error: Two arguments required.");
                System.out.println("Usage: java Example 'char' 'string'");
                return;
            }

            // 1.2 More than two arguments
            if (args.length > 2) {
                System.out.println("Note: Extra arguments detected. Skipping excess arguments...");
            }

            String first = args[0];

            // 1.3 First argument more than one character
            if (first.length() > 1) {
                System.out.println("Error: First argument must be exactly one character.");
                return;
            }

            // Empty first argument
            if (first.length() == 0) {
                System.out.println("Error: First argument cannot be empty.");
                return;
            }

            char ch = first.charAt(0);
            String s = args[1];

            int count = 0;
            int index = 0;

            // Count occurrences using indexOf()
            while ((index = s.indexOf(ch, index)) != -1) {
                count++;
                index++;
            }

            System.out.println("Count = " + count);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing arguments.");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
    }
}