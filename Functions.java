import java.util.Scanner;

public class Functions {

    public static void PrintHW() {
        System.out.println("Hello world");
    }

    public static void calculatesum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum is : " + sum);
    }

    public static int multipy(int A, int B) {
        int product = A * B;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;

        for(int i= 1; i<=n;i++) {
            f = f*i;
        }

        return f;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r / fact_nmr);
        return binCoeff;
    }

    // uing parameter to print number:-
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    // Check if a number is Prime or not
    public static boolean isPrime(int p) {
        for(int i = 2; i<=p-1; i++) {
            if(p % i == 0) {
                return false;
            }
        } 
        return true;
    }

    // Check if anumber is Primes in Range :-
    public static void primeInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a, b);
        PrintHW();
        
        // Swap - value exchange 
        int c = 5;
        int d = 10;

        // swap
        int temp = c;
        c = d;
        d=temp;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int prod = multipy(5, 10);
        System.out.println("A * B = " + prod);

        System.out.println(factorial(4));

        System.out.println(binCoeff(7, 6));

        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 8));

        System.out.println(isPrime(12));

        primeInRange(20);
    }
}
