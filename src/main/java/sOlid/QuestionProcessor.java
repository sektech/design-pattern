package sOlid;

public class QuestionProcessor implements InterviewQuestions{
    private InterviewQuestions Questions;

    public QuestionProcessor(InterviewQuestions questions) {
        Questions = questions;
    }

    @Override
    public void execute() {
        this.Questions.execute();
    }
}
