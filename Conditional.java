import java.util.Scanner;

public class Conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // If-else conditionals
        int age = 22;
        if(age >= 18) {
            System.out.println("audult: Drive, vote");
        }
        else {
            System.out.println("not adult");
        }

        // Print the largest of 2 numbers:-\
        int A = 1;
        int B = 5;

        if(A >= B ) {
            System.out.println("Print A is largest of 2");
        } else {
            System.out.println("B is largest of 2");
        }

        // Print if a number is odd or even:-
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        // else if Statements:-

        int ages = 22;

        if(ages >= 18) {
            System.out.println("adult");
        }
        else if (ages >= 13 && ages <18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("child");
        }

        // Income Tax Calculator:-
        int income = sc.nextInt();
        int tax;

        if(income < 500000) {
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        }
        else {
            tax =(int) (income * 0.3);
        }

        System.out.println("your tax is : " + tax);

    
    // Print the Largest of 3 numbers:-
        int a = 1, b = 3, c = 6;

        if( (a>=b) && (a>=c)) {
            System.out.println("Largest is a");
        }
        else if(b >= c) {
            System.out.println("Largest is b");
        }
        else {
            System.out.println("Largest is c");
        }

    // Ternary Operators
        int num = 4;

        String type = ((num%2) == 0) ? "even" : "odd";
        System.out.println(type);

    // Check if a sutudent will pass or fail:-
        int marks = 32;

        String RC = marks >= 33 ? "Pass" : "Fail";
        System.out.println(RC);

    // Switch Case Statements
        int numb = 2;
        switch(numb) {
            case 1 : System.out.println("samosa");
                        break;
            case 2 : System.out.println("burger");
                        break;
            case 3 : System.out.println("mango shake");
                        break;
            default : System.out.println("we realie we are  dreaming");
        }

    // Make Calculator:-
        System.out.println("enter e :");
        int e = sc.nextInt();
        System.out.println("enter f :");
        int f = sc.nextInt();
        System.out.println("enter operator :");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println(e + f);
                break;
            case '-': System.out.println(e-f);
                break;
            case '*': System.out.println(e * f);
                break;
            case '/': System.out.println(e/f);
                break;
            case '%': System.out.println(e%f);
                break;
            default:
                break;
        }
    }
}
