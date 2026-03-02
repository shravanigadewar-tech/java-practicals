class PE {
public static void main (String args[]){

int[] arr= {10,12,14,16};

int no_of_time=1_000_000;

long f1_time=0;
long f2_time=0;
for (int j=0;j<arr.length;j++){

for(int i=0;i<=no_of_time;i++){
long st=System.currentTimeMillis();
 f1(arr[j]);
long et=System.currentTimeMillis();
f1_time+= (et - st);
}



for(int i=0;i<=no_of_time;i++){
long st=System.currentTimeMillis();
f2(arr[j]);
long et=System.currentTimeMillis();
f2_time+=(et-st);
}
System.out.println("f1 total time (ms): " + f1_time);
System.out.println("f2 total time (ms): " + f2_time);
}

//System.out.println("f1 total time (ms): " + f1_time);
//System.out.println("f2 total time (ms): " + f2_time);
}

static int f2(int n){

 if (n == 0 || n == 1)  // Base case
            return 1;

        return n * f2(n - 1);

}
 static int f1(int n) {

        int total = 1;

        for (int i = 1; i <= n; i++) {
            total *= i;
        }

        return total;
    }
}