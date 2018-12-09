package com.sample;

public class Form{
    public String question;
    public String answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Form() {
    }

    public Form(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
}