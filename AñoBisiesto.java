import java.util.*;
public class AñoBisiesto
{
  public static void main(String[] args)
{
  Scanner kb=new Scanner(System.in);
  int año=0;
  boolean si=true;
  System.out.println("introduce el año: ");
  año=kb.nextInt();

  if((año%4)==0)
  {
    si=true;
  }
  else
  si=false;


  if(si)
  {
    System.out.print("Año bisiesto");
  }
  else
    System.out.print("Este no es bisiesto");
}
}
