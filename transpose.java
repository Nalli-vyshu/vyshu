import java.util.Scanner;
class transpose
   {
public static void main(String args[])
   {
      int i,j;
    Scanner sc=new Scanner(System.in);
   System.out.println("enter num of rows");
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
       for(i=0;i<rows;i++)
   {
     
       for(j=0;j<cols;j++)
{
    System.out.print(arr[i][j]+" ");
  }
 System.out.println();
}
 System.out.println();
for(i=0;i<rows;i++)
{
  for(j=0;j<cols;j++)
          { 
  System.out.print(arr[j][i]+" ");
}
  System.out.println();
   }
 }


}
        

