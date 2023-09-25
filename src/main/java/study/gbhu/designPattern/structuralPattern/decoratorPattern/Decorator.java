package study.gbhu.designPattern.structuralPattern.decoratorPattern;

public class Decorator implements Showable{
    protected Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();
    }
}
