package study.gbhu.designPattern.structuralPattern.decoratorPattern;

public class FoundationMakeup extends Decorator{
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("粉底【");
        super.show();
        System.out.print("】");
    }
}
