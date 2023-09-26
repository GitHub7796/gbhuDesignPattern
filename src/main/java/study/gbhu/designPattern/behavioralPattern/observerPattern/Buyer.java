package study.gbhu.designPattern.behavioralPattern.observerPattern;

public abstract class Buyer {
    protected String name;

    public Buyer(String name) {
        this.name = name;
    }

    public abstract void inform(String product);
}
