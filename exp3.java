public class exp3 {
    public static void main(String[] args) {
        int start = 10, end = 950;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 18 == 0) {  // LCM of 6 and 9 is 18
                sum += i;
            }
        }

        System.out.println("Sum of all numbers between " + start + " and " + end + 
                           " that are divisible by both 6 and 9 is: " + sum);
    }
    
}
