package study.gbhu.designPattern.behavioralPattern.mementoPattern;

import study.gbhu.designPattern.behavioralPattern.strategyPattern.Strategy;

public class History {
    private String body;

    public History(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
