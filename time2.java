class time2 {
//logic1
    static int recursive1(String s1, String s2, int i) {
        if (i > s1.length() - s2.length())
            return 0;

        int count = 0;

        if (s1.substring(i, i + s2.length()).equals(s2))
            count = 1;

        return count + recursive1(s1, s2, i + 1);
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
       String[] s1={"yummytummy","shravshrav"};
        String [] s2={"umm","shrav"};
       // String s1 = "yummytummy";
       // String s2 = "umm";

        int no_of_time=1_000_000;
           long f1_time=0;
       long f2_time=0;

        int choice = 3; 

        switch (choice) {

            case 1:
              for (int j=0;j<s1.length;j++){
                    f1_time = 0;
                 f2_time = 0;
                 for(int i=0;i<=no_of_time;i++){
                 long st=System.currentTimeMillis();
                 recursive1(s1[j],s2[j],0);
                 long et=System.currentTimeMillis();
                 f1_time+=(et-st);
                  }
                 for (int i=0;i<=no_of_time;i++){
                  long st=System.currentTimeMillis();
                   iterative1(s1[j],s2[j]);
                   long et=System.currentTimeMillis();
                  f2_time+=(et-st);
                  }
               System.out.println("iterative1 total time (ms): " + f1_time);
               System.out.println("recursive1 total time (ms): " + f2_time);
                  }
                break;

            case 2:
              for (int j=0;j<s1.length;j++){
                    f1_time = 0;
                    f2_time = 0;
                for(int i=0;i<=no_of_time;i++){
                 long st=System.currentTimeMillis();
                 recursive2(s1[j],s2[j],0);
                 long et=System.currentTimeMillis();
                 f1_time+=(et-st);
                  }
                 for (int i=0;i<=no_of_time;i++){
                  long st=System.currentTimeMillis();
                   iterative2(s1[j],s2[j]);
                   long et=System.currentTimeMillis();
                  f2_time+=(et-st);
                  }
                System.out.println("Iterative2 = " + f1_time);
                System.out.println("Recursive2 = " + f2_time);
                  }
                break;

            case 3:
            for (int j=0;j<s1.length;j++){
                    f1_time = 0;
                    f2_time = 0;
                 for(int i=0;i<=no_of_time;i++){
                 long st=System.currentTimeMillis();
                 recursive3(s1[j],s2[j],0);
                 long et=System.currentTimeMillis();
                 f1_time+=(et-st);
                  }
                 for (int i=0;i<=no_of_time;i++){
                  long st=System.currentTimeMillis();
                   iterative3(s1[j],s2[j]);
                   long et=System.currentTimeMillis();
                  f2_time+=(et-st);
                  }
                System.out.println("Iterative3 = " + f1_time);
                System.out.println("Recursive3 = " + f2_time);
                  }
                break;
              
            default:
                System.out.println("Wrong Choice");
        }
    }
}