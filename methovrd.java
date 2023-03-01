class methovrd extends display
{
  public static void main(String args[])
  {
     methovrd mv=new methovrd();
     mv.printDetails();
     mv.annouce();
  }
  @Override
  public void printDetails()
  {
    super.printDetails();
    System.out.println("This is methodovrd class");

   }
   public void annouce()
  {
     System.out.println("Annoucement of data bindings");
  }

}
class display
{
  public void printDetails()
  {
    System.out.println("This is display class");

  }

}