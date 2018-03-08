import cstools.SimpleIO;

public class Quiz {

    public static void main(String args[]) {
        // create new player and say hi!
        Player player = new Player();
        ImportQuestionsAndAnswers importQuestionsAndAnswers = new ImportQuestionsAndAnswers();
        Quiz.greeter();

        //set players name
        player.setName(SimpleIO.readLine());

        //greet him
        System.out.println("Hey " + player.getName() + " let's play a game!");

        //import questions and answers
        System.out.println("What's the name of the file with questions? \n It should be in this folder. \n");
        String nameQuestionsFile = SimpleIO.readLine();
        importQuestionsAndAnswers.setQuestionsFile(SimpleIO.readFile(nameQuestionsFile));
        System.out.println("You have imported " + importQuestionsAndAnswers.getQuestionsFile().length + " questions! \n");
        System.out.println("What's the name of the file with answers? \n It should be in this folder. \n");
        String nameAnswersFile = SimpleIO.readLine();
        importQuestionsAndAnswers.setAnswersFile(SimpleIO.readFile(nameAnswersFile));

        String[] questions = importQuestionsAndAnswers.getQuestionsFile();
        String[] answers = importQuestionsAndAnswers.getAnswersFile();

        //ask the questions
        LetsPlay.play(questions.length, questions, answers);

    }

    public static void greeter(){
        System.out.println("Hello! Please enter your name: \n");
    }

}
