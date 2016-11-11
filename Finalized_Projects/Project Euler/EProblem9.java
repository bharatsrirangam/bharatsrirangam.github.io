/*
    Problem ID: 9
          Name: Bharat Srirangam
       Contact: bharatsrirangam@gatech.edu
*/


public class EProblem9 {
    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        boolean equivalent = false;
        while(!equivalent) {
            for(int x = 0; x<1000; x++) {
                for(int y = 0; y < x; y++) {
                    for(int z = 0; z < y; z++) {
                        if ((z*z + y*y) == x*x) {
                            if(x + y + z == 1000) {
                                return x*y*z;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
