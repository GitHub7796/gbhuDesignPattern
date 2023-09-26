package study.gbhu.designPattern.behavioralPattern.visitorPattern;

import java.time.LocalDate;

public class Candy extends Product implements Acceptable{
    public Candy(String name, LocalDate produceDate, float price) {
        super(name, produceDate, price);
    }

    @Override
    public void accpet(Visitor visitor) {
        visitor.visit(this);
    }
}
