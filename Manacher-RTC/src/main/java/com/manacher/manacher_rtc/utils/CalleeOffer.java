package com.manacher.manacher_rtc.utils;

public class CalleeOffer {

    private Offer answer;

    public CalleeOffer() {
    }

    public CalleeOffer(Offer answer) {
        this.answer = answer;
    }

    public Offer getAnswer() {
        return answer;
    }

    public void setAnswer(Offer answer) {
        this.answer = answer;
    }
}
