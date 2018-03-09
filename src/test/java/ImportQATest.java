/*
 * Copyright (c) Bryan Aaldering 2018.
 */

import cstools.SimpleIO;
import org.junit.Test;
import static org.junit.Assert.*;
public class ImportQATest {

    @Test
    public void shouldImportQuestionsFile(){
        ImportQuestionsAndAnswers importQuestions = new ImportQuestionsAndAnswers();
        String questionsFile = "./questions.txt";
        importQuestions.setQuestionsFile(SimpleIO.readFile(questionsFile));
        assertNotNull(importQuestions);
    }

    @Test
    public void shouldImportAnswersFile(){
        ImportQuestionsAndAnswers importAnswers = new ImportQuestionsAndAnswers();
        String answersFile = "./answers.txt";
        importAnswers.setAnswersFile(SimpleIO.readFile(answersFile));
    }

    @Test
    public void shouldRecognizeQuestionsFileHas8Lines(){
        ImportQuestionsAndAnswers importQuestions = new ImportQuestionsAndAnswers();
        String questionsFile = "./questions.txt";
        importQuestions.setQuestionsFile(SimpleIO.readFile(questionsFile));
        assertEquals(8, importQuestions.getQuestionsFile().length);
    }
    @Test
    public void shouldRecognizeTheRightAnswerToTheCorrespondingQuestion() {
        ImportQuestionsAndAnswers importQA = new ImportQuestionsAndAnswers();
        String questionsFile = "./questions.txt";
        String answersFile = "./answers.txt";
        importQA.setQuestionsFile(SimpleIO.readFile(questionsFile));
        importQA.setAnswersFile(SimpleIO.readFile(answersFile));
        int q6 = 5;
        System.out.println(importQA.getQuestionsFile()[q6]);
        System.out.println(importQA.getAnswersFile()[q6]);
        assertEquals("true", importQA.getAnswersFile()[q6]);
    }
}
