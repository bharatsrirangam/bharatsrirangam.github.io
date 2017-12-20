/*
    Problem ID: 14
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/

public class EProblem14 {

    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static long solution() {

        int number = 0;
        int max = 0;         
        for (int x = 1; x <= 1000000; x++) {
            int total = parse(x); 
            if (total >= max) {
                max = total;
                number = x;
            }
        }
        Printparse(number);
        return number;
    }

    private static int parse(int n) {
        int total = 1;
        while (n > 1) {
            if (n % 2 == 1) {
                n = (3*n) + 1;
            } else {
                n = n/2;
            }
            total++;
        }

        return total;
    }

    private static int Printparse(int n) {
        int total = 1;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n/2;
            } else {
                n = (3*n) + 1;
            }
            total++;
            System.out.println(n);
        }
        
        return total;
    }
}
