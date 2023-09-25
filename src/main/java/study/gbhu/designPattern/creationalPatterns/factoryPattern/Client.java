package study.gbhu.designPattern.creationalPatterns.factoryPattern;

public class Client {
    public static void main(String[] args) {
        int screenWidth=100;
        System.out.println("game start");
        Factory factory = new TankFactory();
        for (int i = 0; i < 5; i++) {
            factory.create(screenWidth).show();
        }
        factory = new AirPlaneFactory();
        for (int i = 0; i < 5; i++) {
            factory.create(screenWidth).show();
        }
        factory = new BoosFactory();
        for (int i = 0; i < 5; i++) {
            factory.create(screenWidth).show();
        }
    }
}
