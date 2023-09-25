package study.gbhu.designPattern.creationalPatterns.factoryPattern;

import java.util.Random;

public class TankFactory implements Factory {
    @Override
    public Enemy create(int screewith) {
        Random random = new Random();
        return new Tank(random.nextInt(screewith), 0);
    }
}
