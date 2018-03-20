import cstools.SimpleIO;

import java.util.ArrayList;

public class LetsPlay {
    public static void play(int questionsLenght, String[] questions, String[] answers, String name){
        System.out.println("How many questions do you want? \n");
        int numberOfQuestionsWanted = Integer.parseInt(SimpleIO.readLine());

        if(numberOfQuestionsWanted > questionsLenght){
            System.out.println("You cannot ask for more questions then the number of questions in the questions-file. Please choose a number below or equal to " + questionsLenght);
            play(questionsLenght, questions, answers, name);
        }

        System.out.println("I will now show you " + numberOfQuestionsWanted + " statements. \n You need to answer true or false." );

        int countCorrectNumberQuestions = 0;

        int questionsAsked = 0;
        ArrayList<Integer> listQuestionsAsked = new ArrayList<>();

        while (questionsAsked < numberOfQuestionsWanted){
            //use class RandomNumGen to randomly select questions
            int randomNumber = RandomNumGen.randomNumber(questionsLenght);
            if(listQuestionsAsked.contains(randomNumber)) {
                continue;
            } else {listQuestionsAsked.add(randomNumber);
            }

            System.out.println(questions[randomNumber]);
            System.out.println("\n Please enter true of false");
            String userAnswer = SimpleIO.readLine();

            userAnswer = userAnswer.toLowerCase();

            if(userAnswer.equals(answers[randomNumber])) {
                countCorrectNumberQuestions++;
                System.out.println("Correct answer!");
            } else {System.out.println("Wrong answer... :( The correct answer is "+ answers[questionsAsked]);}
            questionsAsked++;
        }

        System.out.println("Hey "+ name + "! You've scored "+ countCorrectNumberQuestions+ " out of "+numberOfQuestionsWanted+ "!\n");
        if(countCorrectNumberQuestions > numberOfQuestionsWanted*0.5){
            System.out.println("You have passed!\n");
        } else {System.out.println("You needed more than 50% to pass, and so just like Gandalf said 'You shall not pass!'\n");}
    }
}
