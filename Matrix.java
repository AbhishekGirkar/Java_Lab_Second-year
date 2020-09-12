import java.util.Scanner;
public class Matrix {
  public static void main(String[] args)
 {
    Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter The Number Of Matrix Rows");
         
        int r = scan.nextInt();
         
        System.out.println("Enter The Number Of Matrix Columns");
         
        int c = scan.nextInt();
         
        int[][] matrix = new int[r][c];
    
        get(scan, matrix, r, c);
        
        show(matrix, r, c);
  }
  public static void get(Scanner scan, int[][] matrix, int r, int c){
     System.out.println("Enter Matrix Data");
          
          for (int i = 0; i < r; i++)
          {
              for (int j = 0; j < c; j++)
              {
                  matrix[i][j] = scan.nextInt();
              }
          }
  }
  
  public static void show(int[][] matrix, int r, int c){
    System.out.println("Your Matrix is : ");
        
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
  }
}