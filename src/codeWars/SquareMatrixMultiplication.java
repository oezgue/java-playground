package codeWars;

public class SquareMatrixMultiplication {
    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[1].length];

        for ( int i = 0; i < a.length; i++){
            for (int j = 0; j <a[0].length; j++){
                c[i][j] = sumMatrix(a,b,i,j);
            }
        }
        return c;
    }

    public static int sumMatrix (int[][]a,int[][]b,int zeile, int spalte){
        int sum = 0;
        for ( int i = 0; i < a.length; i++){

                sum += a[zeile][i] * b[i][spalte];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = {{2,1},{4,4}};
        int[][] b = {{1,1},{1,1}};
        System.out.println(matrixMultiplication(a,b)[1][1]);
    }
}
