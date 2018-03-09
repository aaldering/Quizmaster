import lombok.*;
/**
 * Created on 2018-03-08 by Bryan Aaldering
 * This object is used to store the questions and answers. Lombok generates a getter and setter for the String name
 * @author Bryan Aaldering
 * @version 1.0
 *
 */
@Getter
@Setter
class ImportQuestionsAndAnswers {
    private String[] questionsFile;
    private String[] answersFile;
}
