package study.gbhu.designPattern.behavioralPattern.visitorPattern;

import java.time.LocalDate;

public class Fruit extends Product implements Acceptable{

    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Fruit(String name, LocalDate produceDate, float price, float weight) {
        super(name, produceDate, price);
        this.weight = weight;
    }



    @Override
    public void accpet(Visitor visitor) {
        visitor.visit(this);
    }
}
