import java.util.Scanner;
class Matmult{
 public static void main(String args [ ])
 {
 Scanner scanner = new Scanner(System.in);
  System.out.print("Enter number of rows in first matrix : ");
 int r1 = scanner.nextInt();
 System.out.print("Enter number of columns in first matrix / rows in matrix2: ");
 int c1 = scanner.nextInt();  
  int r2=c1;       
  System.out.print("Enter number of columns in second matrix : ");
 int c2 = scanner.nextInt();
  int[][] matrix1 = new int[r1][c1];
  int[][] matrix2 = new int[r2][c2];
  System.out.println("Enter the first matrix in elements :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
  System.out.println("Enter the second matrix elements:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
  
        int[][] productMatrix  = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) { 
                    productMatrix[i][j] = productMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
 
        
 
                

             System.out.printf("\nFirst %dX%dmatrix is : \n",r1,c1);
                  for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c1; j++) {
                               System.out.print(matrix1[i][j] + " ");
                        }
                        System.out.println();
                  }
 
                  System.out.printf("\nSecond %d X %dmatrix is :\n",r2,c2);
                  for (int i = 0; i < r2; i++) {
                        for (int j = 0; j < c2; j++) {
                               System.out.print(matrix2[i][j] + " ");
                        }
                        System.out.println();
                  }
 
                  
        System.out.printf("\nProduct of matrix1 and matrix2 is below %dX%d matrix\n",r1,c2);
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++) 
         {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
       }
}
