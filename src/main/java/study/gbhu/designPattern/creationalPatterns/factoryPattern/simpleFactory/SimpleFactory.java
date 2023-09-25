package study.gbhu.designPattern.creationalPatterns.factoryPattern.simpleFactory;

import study.gbhu.designPattern.creationalPatterns.factoryPattern.AirPlane;
import study.gbhu.designPattern.creationalPatterns.factoryPattern.Enemy;
import study.gbhu.designPattern.creationalPatterns.factoryPattern.Tank;

import java.util.Random;

public class SimpleFactory {
    private int screeWidth;
    private Random random;

    public SimpleFactory(int screeWidth) {
        this.screeWidth = screeWidth;
        this.random = new Random();
    }

    public Enemy create(String type) {
        int x = random.nextInt(screeWidth);
        Enemy enemy = null;
        switch (type) {
            case "Airplane":
                enemy = new AirPlane(x, 0);
                break;
            case "Tank":
                enemy = new Tank(x, 0);
                break;
        }
        return enemy;
    }
}
