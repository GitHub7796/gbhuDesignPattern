package study.gbhu.designPattern.behavioralPattern.observerPattern;

//海淘购买者
public class HandChopper extends Buyer{
    public HandChopper(String name) {
        super(name);
    }

    @Override
    public void inform(String product) {
        System.out.print(name);
        System.out.println("购买"+product);
    }
}
