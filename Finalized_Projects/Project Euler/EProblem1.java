/*
    Problem ID: 1
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/


public class EProblem1 {
    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        int sum = 0;
        for(int x = 0; x < 1000; x++) {
            if(x % 3 == 0 || x % 5 == 0) {
                sum += x;
            }
        }
        return sum;
    }
}
