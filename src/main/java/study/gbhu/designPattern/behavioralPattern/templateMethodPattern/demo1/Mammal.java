package study.gbhu.designPattern.behavioralPattern.templateMethodPattern.demo1;

public abstract class Mammal {
    public abstract void move();

    public abstract void eat();

    public final void live() {
        move();
        eat();
    }
}
