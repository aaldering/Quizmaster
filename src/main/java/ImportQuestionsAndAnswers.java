import cstools.SimpleIO;

public class ImportQuestionsAndAnswers {
    public static void importQandA(){
        System.out.println("What's the name and extension of the questions file? \n");
        System.out.println("Please make sure it is in the same folder as Quiz.java \n");
        String nameQuestionsFile = SimpleIO.readLine();
        String[] questionsFile = SimpleIO.readFile(nameQuestionsFile);
        System.out.println("You have imported " + questionsFile.length + " questions");

        System.out.println("What's the name and extension of the answer file? \n");
        System.out.println("Please make sure it is in the same folder as Quiz.java \n");
        String nameAnswerFile = SimpleIO.readLine();
        String[] answerFile = SimpleIO.readFile(nameAnswerFile);

    }
}
