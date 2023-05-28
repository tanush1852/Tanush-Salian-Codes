/*Name:Tanush Salian
Comps B , Batch:B2
UID:2022300090



Create a class named ‘Shape’ which has a method ‘getArea’, ‘getPerimeter’ and ‘getSide’ and all of them return 0. Make three subclasses for three different shapes - ‘Circle’, ‘Triangle’ and ‘Pentagon’. These subclasses inherit the ‘Shape’ class and they also have ‘getArea’, ‘getPerimeter’ and ‘getSide’ methods. 
Write a program for the above scenario and display the solution.
Note: Solve using method overriding*/





import java.util.*;
class Shape
{
   public double getArea()
   {
     return 0;
   }
   public double getPerimeter()
   {
     return 0;
   }
   public int getSide()
   {
     return 0;
   }
}

class Circle extends Shape
{  double rad;
  
   public double getPerimeter()
   {
      return(2*3.142*rad);
   }
   
   public double getArea()
   {
      return(3.142*rad*rad);
    }
}

class Triangle extends Shape
{
  double side;
  public int getSide()
  {
    return 3;
  }
  
  public double getPerimeter()
  {
      return(3*side);
  }
  
  public double getArea()
  {
    return((Math.sqrt(3)*Math.pow(side,2))/4);
  }
}

class Pentagon extends Shape
{
    double side;
    
    public int getSide()
    {
      return 5;
     }
    public double getPerimeter()
    {
       return(5*side);
    }
    public double getArea()
    {
      return(1.7204*(Math.pow(side,2)));
      
    }
}

public class Prog6b
{
   public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     Circle cr=new Circle();
     System.out.println("Ent radius of circle ");
     double circrad=sc.nextDouble();
     cr.rad=circrad;
     double cirarea=cr.getArea();
     double cirperi=cr.getPerimeter();
     
     Triangle tr=new Triangle();
     System.out.println("ent dimension of triangle ");
     
     double sidetriangle=sc.nextDouble();
     tr.side=sidetriangle;
     double trarea=tr.getArea();
     double trperi=tr.getPerimeter();
     int t=tr.getSide();
     
     Pentagon pr =new Pentagon();
     System.out.println("ent dimension of pentagon");
     double pentside=sc.nextDouble();
     pr.side=pentside;
     double pentarea=pr.getArea();
     double pentperi=pr.getPerimeter();
     int p=pr.getSide();
     
     System.out.println("FOR TRIANGLE");
     System.out.println("Dimension is:"+sidetriangle+" Area is:"+trarea+"  and Perimeter is:"+trperi+" no.of sides:"+t);
     System.out.println("FOR CIRCLE");
     System.out.println("Dimension is:"+circrad+" Area is:"+cirarea+"  and Perimeter is:"+cirperi);
     System.out.println("FOR PENTAGON");
     System.out.println("Dimension is:"+pentside+" Area is:"+pentarea+"  and Perimeter is:"+pentperi+" no.of sides:"+p);
   }
}
