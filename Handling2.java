class Handling2 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        finally {
            System.out.println("Program finished");
        }
    }
}