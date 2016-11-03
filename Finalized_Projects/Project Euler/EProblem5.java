/*
    Problem ID: 5
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/


public class EProblem5 {
    public static void main(String[] args) {
        System.out.println(solution(Integer.valueOf(args[0])));
    }

    private static int solution(int num) {
        int product =1;
        int[] array = new int[num];
        for(int x = 0; x <num; x++) {
            array[x] = 1;
        }
        int multiplier = 0;
        for(int x = 2; x < num+1; x++) {
            multiplier = x;
            for(int y = x-1; y > 0 ; y--) {
                if(multiplier%array[y] == 0) {
                    multiplier = multiplier/array[y];
                }
            }
            array[x-1] = multiplier;
        }

        for(int a:array) {
            product *= a;
        }
        return product;
    }

}
