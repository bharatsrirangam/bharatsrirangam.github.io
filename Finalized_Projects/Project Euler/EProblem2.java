/*
    Problem ID: 2
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/


public class EProblem2 {
    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        int sum = 2;
        int finalNum = 0;
        int[] fibArray = {1, 2, 0};
        fibArray[0] = 1;
        fibArray[1] = 2;
        fibArray[2] = fibArray[1] + fibArray[0];
        for(int x = 2; fibArray[x%3] < 4000000; x++) {
            fibArray[x % 3] = fibArray[(x-1) % 3] + fibArray[(x-2) % 3];
            if (fibArray[x % 3] % 2 == 0) {
                sum += fibArray[x % 3];
            }
            finalNum = x % 3;
        }
        sum -= fibArray[finalNum];
        return sum;
    }
}
