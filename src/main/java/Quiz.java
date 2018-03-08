import cstools.SimpleIO;

public class Quiz {

    public static void main(String args[]) {
        // create new player and say hi!
        Player player = new Player();
        Quiz.greeter();

        //set players name
        player.setName(SimpleIO.readLine());

        //greet him
        System.out.println("Hey " + player.getName() + " let's play a game!");

        //import questions and answers
        ImportQuestionsAndAnswers.importQandA();

    }

    public static void greeter(){
        System.out.println("Hello! Please enter your name: \n");
    }



}
