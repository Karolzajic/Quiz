import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int score = 0;

        System.out.println("Welcome to Quiz!");

        Question firstQuestion = new Question();
        firstQuestion.question = "What is 2+2? One option question. Write the letter with right answear. For example: i ";
        firstQuestion.answearList = new ArrayList<>();
        firstQuestion.answearList.add("a) 3");
        firstQuestion.answearList.add("b) 4");
        firstQuestion.answearList.add("c) 6");
        firstQuestion.rightAnswer = "b";

        firstQuestion.displayQuestion();

        if(firstQuestion.checkAnswear()){
            score++;
        }


        Question secondQuestion = new Question();
        secondQuestion.question = "What is 6*3? One option question. Write the letter with right answear. For example: i";
        secondQuestion.answearList = new ArrayList<>();
        secondQuestion.answearList.add("a) 18");
        secondQuestion.answearList.add("b) 9");
        secondQuestion.answearList.add("c) 21");
        secondQuestion.rightAnswer = "a";

        secondQuestion.displayQuestion();

        if(secondQuestion.checkAnswear()){
            score++;
        }

        Question thirdMultipleQuestion = new Question();
        thirdMultipleQuestion.question = "Choose all programming languages. Multiple option question. White the letters/or letter with right ansewears/answear. For example: ij ";
        thirdMultipleQuestion.answearList = new ArrayList<>();
        thirdMultipleQuestion.answearList.add("a) Java");
        thirdMultipleQuestion.answearList.add("b) C++");
        thirdMultipleQuestion.answearList.add("c) Czech");
        thirdMultipleQuestion.rightAnswearMultipleChoice = new ArrayList<>();
        thirdMultipleQuestion.rightAnswearMultipleChoice.add("ab");
        thirdMultipleQuestion.rightAnswearMultipleChoice.add("ba");

        thirdMultipleQuestion.displayQuestion();

        if(thirdMultipleQuestion.checkMultipleAnswear()){
            score++;
        }


        System.out.println("Your score is: " + score);


    }
}