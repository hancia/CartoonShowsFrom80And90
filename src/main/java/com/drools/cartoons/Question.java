package com.drools.cartoons;

public class Question {
    private String question = "";
    private String answer = "";

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void showQuestion() {
        System.out.print(question);
    }

    public String getAnswer() { return answer; }

    public void getAnswerFromUser(){
        System.out.println(this.question);
        System.out.println("Awaiting user's response");

        Decision decision = Cartoons.goji.answerQuestion(this);
        System.out.println(decision.getValue());

        this.answer = decision.getValue();
    }

    public void setAnswer(String answer) { this.answer = answer; }

    public Question(String question){
        this.question = question;
    }

    public Question(){}

}