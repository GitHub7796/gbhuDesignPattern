package study.gbhu.designPattern.creationalPatterns.factoryPattern;

import java.util.Random;

public class BoosFactory implements Factory{
    @Override
    public Enemy create(int screewith) {
        Random random = new Random();
        return new Boos(random.nextInt(screewith), 0);
    }
}
