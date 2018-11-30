package com.drools.cartoons;

import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        this.answer = in.nextLine();
    }

    public void setAnswer(String answer) { this.answer = answer; }

    public Question(String question){
        this.question = question;
    }

    public Question(){}

}