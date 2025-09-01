public class Arrays2 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0; i<numbers.length; i++) {
            int start =i;
            for(int j=i; j<numbers.length; j++) {
                int end =j;
                currSum =0;
                for(int k=start; k<=end; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void perfixSubArrays(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        // calculate prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i=0; i<number.length; i++) {
            int start =i;
            for(int j=1; j<number.length; j++) {
                int end =j;

                currSum = start == 0 ? prefix[end] : prefix[end] -prefix[start-1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
         System.out.println("max sum = " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySum(numbers);

        int number[] = {-1, -2, 6, -1, 3};
        perfixSubArrays(number);
    }
}
