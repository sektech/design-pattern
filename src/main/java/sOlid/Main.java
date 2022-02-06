package sOlid;

public class Main {
    public static void main(String[] args) {
        InterviewQuestions questions = new QuestionProcessor(new AIQuestions());
        questions = new QuestionProcessor(new DataStructQuestions());
        questions.execute();
    }
}
