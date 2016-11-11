/*
    Problem ID: 6
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/


public class EProblem6 {
    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        int squaresums = 0;
        int sumsquare = 0;
        for(int x = 0; x <= 100; x++) {
            sumsquare += x;
            squaresums += x*x;
        }
        return sumsquare*sumsquare - squaresums;
    }
}
