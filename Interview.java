/*Mr. Abhishek Bachan is an H.R. Manager of “ABCL Technologies” At the beginning of the new year he anticipated that the company will need 30 new additional persons to fill up different vacancies in software team. He gave an advertisement in the newspaper inviting applications for filling up different vacant posts. As many as 120applications were received. The same were scrutinized and they were given four tests. There are 4 sections and each section has 2 questions each.


        Create class Recruitment that prints if the person has passed(greater than 60%) or failed the test.

        Create sub class Testing that generates the marks percentage based on his answers in test. Class Testing has methods takeTest and generateResult().

        Design the following questions and conduct test and generate result whether candidate passed or failed. Create class Tester with main method.

        The objective of the first test was to find out how much interest the applicant takes in his work.

        Questions asked

        1.What is the vision of the company?

        2.How long will you stay in this role?


        The objective of the second test was to find out ‘specialization’ of the applicant in any particular area.

        Questions asked

        1.What is final method in Java?

        2.What is the latest version of Java?


        Third test aimed at making sure whether the applicant was capable of learning through training or not.

        Questions asked

        1.What did you learn about Java in last job?

        2.What do you wish to learn?


        The purpose of the fourth test was to find out how much capability a person has to mix-up with other persons, and whether he can influence other persons and get influenced by them.

        Questions asked

        1.What makes a team successful?

        2.Do you work faster in team or as individual?*/
import java.util.*;
class Recruitment{
   void recruit(double percent)
   {
       if(percent>60.0)
       {
           System.out.println("Percent is :"+percent+" candidate has passed");
       }
       else
       {
           System.out.println("Percent is:"+percent+" candidate has failed");
       }
   }


}

class Testing extends Recruitment{
    int arr[] =new int[8];
    int count=0;
    public void checking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your answer");
        String str = sc.nextLine();
        System.out.println("Your Answer:" + str);
        System.out.println("Enter marks out of 10");
        int marks = sc.nextInt();
        int n = 0;
        while (n == 0) {
            if (marks > 10 || marks < 0) {

                System.out.println("Wrong marks entered,enter marks again");
                marks = sc.nextInt();
            } else {
                arr[count]=marks;
                count++;
                break;
            }

        }
    }
    public void Taketest()
    {

        System.out.println("ROUND 1:To find the interest of applicant");
        System.out.println("Q1)What is the vision of the company?");
        checking();
        System.out.println("Q2)How long will you stay in this role?");
        checking();

        System.out.println("ROUND 2:Specialization of applicant");
        System.out.println("Q1)What is final method in Java?");
        checking();
        System.out.println("Q2)What is the latest version of Java?");
        checking();

        System.out.println("ROUND 3:Capability to learn through training");
        System.out.println("Q1)What did you learn about Java in your last class?");
        checking();
        System.out.println("Q2)What do you wish to learn?");
        checking();

        System.out.println("ROUND 4");
        System.out.println("Q1)What makes a team successful?");
        checking();
        System.out.println("Q2)Do you work faster in team or as an individual?");
        checking();
        generateResult();
    }

    public void generateResult()
    {  int sum=0,cou=0;


        for(int i=0;i<8;i++) {

            sum = sum + arr[i];

        }
        for(int i=1;i<=4;i++)
        {
            System.out.println("Marks for Interview Round:"+i);
            for(int j=1;j<=2;j++)
            {
                System.out.println("Q"+j+":"+arr[cou]+"/10");
                cou++;
            }
            System.out.println();
        }

        double percent=(sum*100.0)/80.0;
        super.recruit(percent);
 


    }
}

public class Tester {
    public static void main(String args[]) {
        System.out.println("WELCOME TO THE INTERVIEW ROUND OF ABCL TECHNOLOGIES");
        Testing t1 = new Testing();
        t1.Taketest();
    }
}
