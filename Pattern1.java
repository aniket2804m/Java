public class Pattern1 {
    public static void main(String args[]) {

    // Star pattern 
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    // Print Inverted Star pattern
        int n = 5;
        for (int lines =1; lines<=n; lines++) {
            for (int stars =1; stars<= n-lines; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

    // Print Half-PYRAMID pattern
        int p = 4;
        for (int l = 1; l<= p; l++) {
            for (int num = 1; num <=l; num++) {
                System.out.print(num);
            }
            System.out.println();
        }

    // Print Character pattern
        int c = 4;
        char ch = 'A';

        for(int i = 1; i<=c; i++) {
            for(int j =1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
