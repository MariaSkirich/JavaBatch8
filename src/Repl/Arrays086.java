package Repl;

public class Arrays086 {
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int rows, cols, sumRow;

        rows=a.length;
        cols=a[0].length;

        for (int i=0; i<rows; i++) {
            sumRow=0;
            for (int j=0; j<cols; j++){
                sumRow+=a[i][j];
            }
            System.out.println(sumRow);
        }



    }

}
