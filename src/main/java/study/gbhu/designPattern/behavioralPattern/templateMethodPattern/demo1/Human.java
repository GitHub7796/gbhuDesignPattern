package study.gbhu.designPattern.behavioralPattern.templateMethodPattern.demo1;

public class Human extends Mammal{
    @Override
    public void move() {
        System.out.println("人类在路上开着车");
    }

    @Override
    public void eat() {
        System.out.println("人类去公司挣钱吃饭");
    }
}
