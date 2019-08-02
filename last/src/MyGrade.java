import java.util.*;

public class MyGrade {

    public static void main(String args[]){
        int grade = 0;
        System.out.println("What was my grade : ");
        Scanner scanner = new Scanner(System.in);   //taking in the input string
        try{
            grade=scanner.nextInt();
            if(grade<= 80)
            System.out.println("Please check again");
            else if(grade > 81 && grade <= 90)
                System.out.println("Good job");
            else
                System.out.println("WOW "+grade+" is awesome");
        }
        catch(InputMismatchException e){
           System.out.println("Error in the input, please enter a number");
        }
    }    

}

