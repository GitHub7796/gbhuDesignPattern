package study.gbhu.designPattern.creationalPatterns.builderPattern;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new HouseBuilder());
        System.out.println(director.direct());

        director = new Director(new ApartmentBuilder());
        System.out.println(director.direct());
    }
}

