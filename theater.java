class theater
 {
    public static void main(String args[])
{ 

    movies bs=new movies();
         bs.addmovie("Bhahuballi","Rajamouli",500);
         bs.getmovie();

         movies bin=new movies();
         bin.addmovie("Darling","Karunakar",600);
         bin.getmovie();

    }
}
       class movies
{
    private int mticket;
    private String mname,mdirector;
 


    
//adding one movie to movies
 public void addmovie(String moviename,String moviedirector,int movieticket)
  {
    mname=moviename;
    mdirector=moviedirector;
    mticket=movieticket;

  }

     //print movie details
public void getmovie()
{
System.out.println("The movie "+mname+" is directed by "+mdirector+" and it's ticket price is "+mticket);

   }
}