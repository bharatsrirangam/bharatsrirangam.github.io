/*
    Problem ID: 7
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/


public class EProblem7 {
    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        int counter = 0;
        int number = 2;
        boolean composite = false;
        while(counter != 10001) {
            composite = false;
            for(int x = 2; x < number; x++) {
                if(number%x == 0) {
                    composite =true;
                    x = number;
                }
            }
            if (composite == false) {
                counter++;
            }
            number++;
        }
        return number-1;
    }
}
