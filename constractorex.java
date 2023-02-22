  class constractorex
    { 
      public static void main(String args[])
        { 
         printmedia pm=new printmedia();
          pm.newspaper(); 

       }
     }
       class printmedia
        {
         printmedia()
       {  

        System.out.println("Im a constructor in printmedia");
        }    
         public void newspaper()
     {
       System.out.println("Im a news paper");
    }
 

}