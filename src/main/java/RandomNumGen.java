import java.util.Random;

class RandomNumGen {

    public static int randomNumber (int lengthQuestionsFile){
        Random rand = new Random();

        int randInt = rand.nextInt(lengthQuestionsFile);
        System.out.println(randInt);

        return randInt;
    }
}


