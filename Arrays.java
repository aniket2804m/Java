import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Arrays {

    public static void update(int mark[]) {
        for(int i=0; i<mark.length; i++) {
            mark[i] = mark[i] + 1;
        }
    }

    // linear Search :-
    public static int linearSearch(int numbers[], int key) {

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
               return i;
            }
        }
        return -1;
    }

    // Find Largest number:-
    public static int getLargest(int number[]) {
        int Largest = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++) {
            if(Largest < number[i]) {
                Largest = number[i];
            }
        }
        return Largest;
    }

    // BinarySearch:-
    public static int BinarySearch(int numbers[], int key) {
        int start =0, end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end ) / 2;

            // comparision
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    // reverse an Array
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length-1;

        while (first < last) {
            int temp = numbers[first];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    // Pairs in an Array:-
    public static void printPairs(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i]; //2, 4, 6, 8, 10
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    // Print SubArrays:-
    public static void printSubarrays(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++){
               int end =j;
                  for(int k=start; k<=end; k++) {
                    System.out.print(numbers[k] + " ");
                  }
                  System.out.println();
            }
            System.out.println() ;
        } 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Creating an Arrays
        // int marks[] = new int[50];

        // int number[] = {1, 2, 3};

        // int morenumber[] = {4, 5, 6, };

        // String fruits[] = {"apple", "mango", "banana"};

        // Input:-
        int marks[] = new int[50];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("Chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        marks[2] = marks[2] + 1;
        System.out.println("math : " + marks[2]);

        // find Percentage
        int Percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + Percentage + "%");


        // Arrays as function Arguments:-
         int mark[] = {97, 78, 90};

         update(mark);

        //  print our mark
        for(int i=0; i<mark.length; i++) {
            System.out.print(mark[i] + " ");
        }
        System.out.println();


        // LS1
        int numbers[] = {2, 4, 6, 8, 10};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index :" + index);
        }

        int number[] = {1, 2, 6, 3, 5};
        
        System.out.println("largest value is : " + getLargest(number));

        
        System.out.println("index for key is : " + BinarySearch(numbers, key));

        // reverse(numbers); 
        // for(int i=0; i<numbers.length; i++) {
        //     System.out.print(numbers[i]+ " ");
        // }
        // System.out.println();

        printPairs(numbers);

        printSubarrays(numbers);
    }
}
