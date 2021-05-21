

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int i, j,r,c;
        Scanner s = new Scanner(System.in);
        System.out.println("enter row ");
         r=s.nextInt();
         System.out.println("enter collumn");
         c=s.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int su[][] = new int[r][c];

        System.out.println("enter first matrix");
        for (i = 0; i<r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }

            System.out.println();
        }

        System.out.println("enter 2nd matrix");
        for (i = 0; i<r; i++) {
            for (j = 0; j<c; j++) {

                b[i][j] = s.nextInt();
            }
System.out.println();
        }
        System.out.println("the resulting matrix is");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                su[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(su[i][j]+" " );
            }
            System.out.println();
        }

    }
}
