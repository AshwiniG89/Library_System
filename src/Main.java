import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice=0;

        while(choice!=3){

            System.out.println("Enter 1 : Module 1");
            System.out.println("Enter 2 : Module 2 ");
            choice=sc.nextInt();

            if(choice==1){
                Module_1 student1=new Module_1();
                //user guidance
                System.out.println("You are in Module 1");
                System.out.println();
                System.out.println("Enter student's name:");
                student1.name=sc.nextLine();student1.name=sc.nextLine();//why it worked now
                System.out.println("Enter Father's name:");
                student1.f_name=sc.nextLine();
                System.out.println("Enter the University id:");
                student1.uni_ID=sc.nextLine();
                System.out.println("Enter the UID:");
                student1.UID=sc.nextLine();
                System.out.println("Enter your semister:");
                student1.semister=sc.nextInt();

                student1.getdata(student1.name,student1.f_name,student1.uni_ID,student1.UID,student1.semister);
                student1.setdata();
            }
            else if(choice==2){
                System.out.println("You are in Module 2");
                System.out.println();
                Module_2 student2=new Module_2();

                student2.chemistry();
                student2.physics();
                student2.biology();
            }
            System.out.println();
        }
    }

}
