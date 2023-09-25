package study.gbhu.designPattern.creationalPatterns.factoryPattern;

import java.util.Random;

public class AirPlaneFactory implements Factory {

    @Override
    public Enemy create(int screewith) {
        Random random = new Random();
        return new AirPlane(random.nextInt(screewith), 0);
    }
}
