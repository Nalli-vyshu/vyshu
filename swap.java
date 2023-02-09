class swap
{
 public static void main(String args[])
{
  int num1=2000;
  int num2=3000;
   
  num1=num1+num2;
  num2=num1-num2;
num1=num1-num2;
   
  System.out.println(num1);
  System.out.println(num2);
}
}
