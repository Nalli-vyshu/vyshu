import java.util.*;
class stringtoken
{
  public static void main(String args[])
  { 
    StringTokenizer st=new StringTokenizer("vyshu is a greate women who is practise in java");
    while(st.hasMoreTokens())
    {
      System.out.println(st.nextToken());
    }
  }
}