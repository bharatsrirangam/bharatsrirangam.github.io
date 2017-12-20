/*
    Problem ID: 10
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/

public class EProblem10 {
    public static void main(String[] args) {
        System.out.println(solution(args[0]) + " " + args[0].length());
    }

    private static long solution(String num) {

        int value = 1;
        long max = 0; 
        value = Integer.parseLong(num); 
        
        for (int x = 0; x < value; x++) {
            max += x;
        }

        for 
        return max;
    }

    private static long parse(String num) {
        long total = 1;
        for(int x = 0; x < num.length(); x++) {
            total = total * Character.getNumericValue(num.charAt(x));
        }
        return total;
    }
}
