import java.math.BigInteger;
/*
    Problem ID: 3
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/


public class EProblem3 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger(args[0]);
        System.out.println(solution(num));
    }

    private static BigInteger solution(BigInteger num) {
        long largestPrimeNumberPrime = 1;
        long intervalPrime = 2;

        BigInteger largestPrimeNumber = BigInteger.valueOf(largestPrimeNumberPrime);

        BigInteger interval = BigInteger.valueOf(intervalPrime);

        while (!num.equals(new BigInteger("1"))) {
            if (num.mod(interval).equals(new BigInteger("0"))) {
                largestPrimeNumber = interval;
                System.out.print( "\n"+interval + " ");
            }
            while (num.mod(interval).equals(new BigInteger("0"))) {
                num = num.divide(interval);
                System.out.print("|");
            }
            interval = interval.add(new BigInteger("1"));
        }
        System.out.println("\n======================");
        return largestPrimeNumber;
    }
}
