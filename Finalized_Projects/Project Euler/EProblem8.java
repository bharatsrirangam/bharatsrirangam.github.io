/*
    Problem ID: 8
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/

public class EProblem8 {
    public static void main(String[] args) {
        System.out.println(solution(args[0]) + " " + args[0].length());
    }

    private static long solution(String num) {

        long value = 1;
        long max = 0; 
        value = parse(num.substring(0,13)); 
        
        for (int x = 0; x < 987; x++) {
            value = parse(num.substring(x,x+13)); 
            if (value > max) {
                max = value;
            }
        }
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
