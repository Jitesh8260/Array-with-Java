import java.util.Scanner;

public class swapmatrix {

    public static void main(String []args) {
            int i,j;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of rows");
            int m=sc.nextInt();
             System.out.println("Enter no of rows");
            int n=sc.nextInt();
            int myArray[][]=new int[m][n];
            System.out.println("Enter the elements of array");
            for(i=0;i<m;i++){
                for(j=0;j<n;j++)
                myArray[i][j]=sc.nextInt();
            }
            System.out.println("Matrix is:");
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                System.out.println(myArray[i][j]+"  ");
                System.out.println("\n");
                }
            }
            for(i=0;;){
                for(j=0;j<n;j++){
                
                }
            }
            System.out.println("Matrix after swapping Elements of first and last Across Row");

            }

    
}
