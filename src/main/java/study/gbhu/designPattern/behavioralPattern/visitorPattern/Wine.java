package study.gbhu.designPattern.behavioralPattern.visitorPattern;

import java.time.LocalDate;

public class Wine extends Product implements Acceptable{

    public Wine(String name, LocalDate produceDate, float price) {
        super(name, produceDate, price);
    }

    @Override
    public void accpet(Visitor visitor) {
        visitor.visit(this);
    }
}
