/*Write a program to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 

Input to be taken from the user. Display the marks in highest order of student A and B.*/

import java.util.*;
abstract class Marks{

   abstract void getPercentage();
   
   
}

class A extends Marks{
 int a,b,c;
 A(int a,int b,int c)
 {
   this.a=a;
   this.b=b;
   this.c=c;
  }
  
 public void getPercentage(){
 
   double per=((a+b+c)/3.0);
   System.out.println("Percentage for student A is "+per+"%");
  }
}

class B extends Marks{
int a,b,c,d ;

B(int a,int b,int c,int d)
{
   this.a=a;
   this.b=b;
   this.c=c;
   this.d=d;
}

public void getPercentage(){

  double per=((a+b+c+d)/4.0);
  System.out.println("Percentage for student B is "+per+"%");
  }
}

public class Prog7a
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);      
     System.out.println("Ent marks obtained by student A (out of 100) in 3subjects");
     int a =sc.nextInt();//for physics
     int b=sc.nextInt();//for chem
     int c=sc.nextInt();//for maths
     
     
     System.out.println("Ent marks obtained by student B (out of 100) in 4 subjects");
     int a2 =sc.nextInt();
     int b2=sc.nextInt();
     int c1=sc.nextInt();
     int d=sc.nextInt();  
     
     A a1=new A(a,b,c);
     a1.getPercentage();
     
     B b1=new B(a2,b2,c1,d);
     b1.getPercentage();
     int max;
     int arr1[]=new int[3];
     arr1[0]=a; arr1[1]=b ;arr1[2]=c;
     System.out.println("Marks of Student A in highest order");
     for(int i=0;i<3;i++)
     {  max=0;
        for(int j=i+1;j<3;j++)
        {
           if(arr1[j]>arr1[i])
           {
              max=arr1[j];
              arr1[j]=arr1[i];
              arr1[i]=max;
           }
         }
         checkA(arr1[i]);
         System.out.println(arr1[i]);
     }    
     
     int max1;
     int arr2[]=new int[4];
     arr2[0]=a2; arr2[1]=b2 ;arr2[2]=c1;arr2[3]=d;
     System.out.println("Marks of Student B in highest order");
     for(int i=0;i<4;i++)
     {  max1=0;
        for(int j=i+1;j<4;j++)
        {
           if(arr2[j]>arr2[i])
           {
              max1=arr2[j];
              arr2[j]=arr2[i];
              arr2[i]=max1;
           }
         }
         
         System.out.println(arr2[i]);
     }    
      
           
               
     
       
   }
   public void checkA(int marks,int a ,int b,int c)
      { this.a
         if(marks==a)
         { 
            System.out.print("physics :");
         }
          if(marks==b)
         {
           System.out.print("chemistry:");
         }
         if (marks==c)
         {
           System.out.print("maths:");
         }
      }     
}     
       
