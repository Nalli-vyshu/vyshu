class varags
{ 
    public static void main(String args[])
    { 

       addition(2,4,6,7,1,4,3);

    }

    public static void addition(int ...a)
    { 
         int sum=0;
         for(int i:a)
         { 
           sum+=i;
         }

    
      System.out.println(sum);
    }
}