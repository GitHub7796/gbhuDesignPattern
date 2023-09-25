package study.gbhu.designPattern.creationalPatterns.factoryPattern.simpleFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("game start");
        SimpleFactory factory = new SimpleFactory(100);
        factory.create("Airplane").show();
        factory.create("Tank").show();

    }
}
