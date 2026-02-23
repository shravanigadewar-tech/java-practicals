class task2 {
//logic1
    static int func1(String s1, String s2, int i) {
        if (i > s1.length() - s2.length())
            return 0;

        int count = 0;

        if (s1.substring(i, i + s2.length()).equals(s2))
            count = 1;

        return count + func1(s1, s2, i + 1);
    }

    static int iterative1(String s1, String s2) {
        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (s1.substring(i, i + s2.length()).equals(s2))
                count++;
        }

        return count;
    }

    //logic2
    static int iterative2(String s1, String s2) {
        int count = 0;
        int index = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index++;
        }

        return count;
    }

    static int recursive2(String s1, String s2, int index) {
        index = s1.indexOf(s2, index);

        if (index == -1)
            return 0;

        return 1 + recursive2(s1, s2, index + 1);
    }

    //logic3
    static int iterative3(String s1, String s2) {
        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (s1.startsWith(s2, i))
                count++;
        }

        return count;
    }

    static int recursive3(String s1, String s2, int index) {
        if (index > s1.length() - s2.length())
            return 0;

        if (s1.startsWith(s2, index))
            return 1 + recursive3(s1, s2, index + 1);

        return recursive3(s1, s2, index + 1);
    }

   
    public static void main(String[] args) {

        String s1 = "yummytummy";
        String s2 = "umm";

        int choice = 1; 

        switch (choice) {

            case 1:
                System.out.println("Iterative = " + iterative1(s1, s2));
                System.out.println("Recursive = " + func1(s1, s2, 0));
                break;

            case 2:
                System.out.println("Iterative = " + iterative2(s1, s2));
                System.out.println("Recursive = " + recursive2(s1, s2, 0));
                break;

            case 3:
                System.out.println("Iterative = " + iterative3(s1, s2));
                System.out.println("Recursive = " + recursive3(s1, s2, 0));
                break;

            default:
                System.out.println("Wrong Choice");
        }
    }
}