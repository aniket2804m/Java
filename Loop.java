import java.util.Scanner;

public class Loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int counter = 0;

        // while (counter < 100) {
        //     System.out.println("Hello World");
        //     counter++;   
        // }

        //     System.out.println("Printed HW 100x");

    // Print number from 1 to 10
         int count = 0;

         while (count <= 10) {
            System.out.println(count);
            count++;
         }

    // Print number from 1 to n
         int range = sc.nextInt();
         int counter = 1;

         while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
         }
         System.out.println();

    // Print sum of first n natural number
         int n = sc.nextInt();
         int sum = 0;

         int i = 0;

         while (i<= n) {
            sum += i;
            i++;
         }
         System.out.println(sum);

    // For loop
         for(i=1; i<=10; i++) {
            System.out.println("Aniket");
         }

    // Print Square Pattern
         for(int lines = 1; lines<= 4; lines++) {
            System.out.println("****");
         }

    // Print reverse of a number
    int p = 12345;

    while(p > 0) {
        int lastdigit = p % 10;
        System.out.print(lastdigit);
        p = p/10;
    }
    System.out.println();

    // Do while loop
        int c = 1;
        do {
            System.out.println("Aniket");
            c++;
        } while(c <= 10);

    // Break Statements:-
        for(int x =1; x<=5; x++) {
            if(x == 3) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("i am out of the loop");

    // break Keyword
        do {
            System.out.println("enter your number :");
            int y = sc.nextInt();

            if(y % 10 == 0) {
                break;
            }
            System.out.println(y);
        } while(true);

    // Continue Statement
        for(int s =1; s<=5; s++) {
            if(s == 3) {
                continue;
            }
            System.out.println(s);
        }

        
    }
}


