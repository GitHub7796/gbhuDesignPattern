package study.gbhu.designPattern.structuralPattern.facadePattern;

import study.gbhu.designPattern.creationalPatterns.factoryPattern.Factory;

public class Clinet {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.order();
    }
}
