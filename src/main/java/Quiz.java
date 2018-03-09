import cstools.SimpleIO;

/**
 * Created on 2017-10-24 by Bryan Aaldering
 * Lets the user participate in a quiz, played in the console
 * Questions and matching answers must be provided in 2 separate text files, with each question/answer on a new line.
 *
 * @author Bryan Aaldering
 * @version 1.0
 *
 */
public class Quiz {

    public static void main(String args[]) {
        // create new player and say hi!
        Player player = new Player();
        ImportQuestionsAndAnswers importQuestionsAndAnswers = new ImportQuestionsAndAnswers();
        Quiz.greeter();

        //set players name
        player.setName(SimpleIO.readLine());

        //greet the player
        System.out.println("Hey " + player.getName() + " let's play a game!");

        //import questions and answers
        System.out.println("What's the name of the file with questions? \n It should be in this folder. \n");
        String nameQuestionsFile = SimpleIO.readLine();
        importQuestionsAndAnswers.setQuestionsFile(SimpleIO.readFile(nameQuestionsFile));
        System.out.println("You have imported " + importQuestionsAndAnswers.getQuestionsFile().length + " questions! \n");
        System.out.println("What's the name of the file with answers? \n It should be in this folder. \n");
        String nameAnswersFile = SimpleIO.readLine();
        importQuestionsAndAnswers.setAnswersFile(SimpleIO.readFile(nameAnswersFile));

        //ask the questions
        LetsPlay.play(importQuestionsAndAnswers.getQuestionsFile().length, importQuestionsAndAnswers.getQuestionsFile(), importQuestionsAndAnswers.getAnswersFile(), player.getName());
    }

    private static void greeter(){
        System.out.println("Hello! Please enter your name: \n");
    }

}
