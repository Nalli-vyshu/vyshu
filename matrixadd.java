import java.util.Scanner;
    class matrixadd
 {
 public static void main(String args[])
    {
   int i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println(" enter num of rows");
  int rows=sc.nextInt();
 System.out.println("enter num of cols");
   int cols=sc.nextInt();
   int arr[][]=new int[rows][cols];
  System.out.println("enter array values");
  for(i=0;i<rows;i++)
   {
  for(j=0;j<cols;j++)
 {
 arr[i][j]=sc.nextInt();
    }
}
System.out.println("enter num of rows of second array");
int row=sc.nextInt();
System.out.println("enter num of cols of second array");
int col=sc.nextInt();
int brr[][]=new int[row][col];
System.out.println("enter array values of second array");
for(i=0;i<row;i++)
{
 for(j=0;j<col;j++)
{
 brr[i][j]=sc.nextInt();
      }
}
  System.out.println();
for(i=0;i<rows;i++)
   {
 for(j=0;j<cols;j++)
    {
      System.out.println(arr[i][j]+" " );
 }
    System.out.println();
 }
System.out.println();
for(i=0;i<row;i++)
  {
for(j=0;j<col;j++)
  {
  System.out.println(brr[i][j]+" " );
   }
System.out.println();
}
System.out.println();
for(i=0;i<rows;i++)
  {
for(j=0;j<cols;j++)
  {
    System.out.print(arr[i][j]+brr[i][j]+" ");
    }
      System.out.println();
     }
  }
 
}

  