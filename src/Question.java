import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    ArrayList<String> answearList;

    String rightAnswer;
    String question;
    ArrayList<String> rightAnswearMultipleChoice;


    public void displayQuestion() {
        System.out.println(this.question);


        for (String answear: answearList){

            System.out.println(answear);

        }

    }
    public boolean checkAnswear(){
        Scanner scanner = new Scanner(System.in);
        String userAnswear = scanner.next();
        if (userAnswear.equals(this.rightAnswer)){
            System.out.println("Congratulation! Right answear!");
            return true;
        }else {
            System.out.println("Wrong answear!");
            return false;
        }

    }
    public boolean checkMultipleAnswear(){
        Scanner scanner = new Scanner(System.in);
        String userAnswear = scanner.next();

        if (rightAnswearMultipleChoice.contains(userAnswear)){
            System.out.println("Congratulation! Right answear!");
            return true;
        }else {
            System.out.println("Wrong answear!");
            return false;
        }

    }
}
