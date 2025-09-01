public abstract class Pattern2 {

    // Print Hollow Rectangle Pattern:-
    public static void hollow_rectangle(int totRows, int totCols) {
        for(int i=1; i<=totRows; i++) {
            for(int j=1; j<=totCols; j++) {
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Inverted & Roted Half-pyramid:-
     public static void inverted_rotated_half_pyramid(int n) {
        // outer
        for(int i =1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted half pyramid wth Number:-
    public static void inverted_half_pyramid_withNumber(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // Flioyds Trangles Pattern:-
    public static void floyds_triangle(int n) {
        // outer
        int counter = 1;
        for(int i =1; i<=n; i++) {
            // inner- how many times will counter be printed
            for(int j=1; j<=i; j++) {
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0-1 tringle pattern:-
    public static void zero_one_triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1");
                  }
                else{
                    System.out.print("0");
                }
            }
             System.out.println();
    }
    }

    // Print Butterfly Pattern:-
    public static void butterfly(int n) {
        // 1 half
        for(int i=1; i<=n; i++) {
        // Stars - i
           for(int j=1; j<=i; j++) {
            System.out.print("*");
           }
        // Spaces - 2*(n-i)
        for(int j=1; j<=2*(n-i); j++) {
            System.out.print(" ");
        }

        // stars - i
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
        }
      

        // 2nd Half
        for(int i=n; i>=1; i--) {
            // Stars - i
           for(int j=1; j<=i; j++) {
            System.out.print("*");
           }
        // Spaces - 2*(n-i)
        for(int j=1; j<=2*(n-i); j++) {
            System.out.print(" ");
        }

        // stars - i
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
        }
    }

    // Print Solid Rhombus
    public static void solid_rhombous(int n) {
        for(int i=1; i<=n; i++) {
            // spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        hollow_rectangle(4, 10);

        inverted_rotated_half_pyramid(4);

        inverted_half_pyramid_withNumber(6);

        floyds_triangle(9);

        zero_one_triangle(6);

        butterfly(4);

        solid_rhombous(5);
    }
}
