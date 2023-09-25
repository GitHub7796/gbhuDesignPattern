package study.gbhu.designPattern.structuralPattern.decoratorPattern;

public class Client {
    public static void main(String[] args) {
        Showable madeupGirl = new Lipstick( new FoundationMakeup(new Girl()));
        madeupGirl.show();
    }
}
