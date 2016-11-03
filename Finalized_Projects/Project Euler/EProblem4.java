/*
    Problem ID: 4
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/


/*
    Special Note: Another way to accomplish method is to recognize that a palindrome of abccba can be written as 11(9091a + 910b + 100c). This confirms that any six digit number will be divisible by 11 if it is a palindrome. At this point, it is easier to find numbers that multiply together to get a palindrome.
*/

public class EProblem4 {

    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        int potentialNum = 0;
        for(int x = 100; x < 999; x++) {
            for(int y = 100; y <999; y++) {
                if(check(x*y)) {
                    if (x*y > potentialNum) {
                    potentialNum = x*y;
                    }
                }
            }
        }
        return potentialNum;
    }

    private static boolean check(int g) {
        String num = Integer.toString(g);
        int len = num.length()-1;
        for (int x = 0; x<num.length()/2; x++) {
            if(num.charAt(x) != num.charAt(len-x)){
                return false;
            }
        }
        return true;
    }
}
