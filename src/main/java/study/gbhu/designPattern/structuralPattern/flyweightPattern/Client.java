package study.gbhu.designPattern.structuralPattern.flyweightPattern;

public class Client {
    public static void main(String[] args) {
        TileFactory factory = new TileFactory();

        factory.getDrawable("河流").draw(10, 10);
        factory.getDrawable("草地").draw(10, 20);
        factory.getDrawable("道路").draw(10, 30);
        factory.getDrawable("房屋").draw(10, 40);
        factory.getDrawable("河流").draw(10, 50);
        factory.getDrawable("草地").draw(10, 60);
        factory.getDrawable("道路").draw(10, 70);
        factory.getDrawable("房屋").draw(10, 80);
        factory.getDrawable("河流").draw(10, 90);
        factory.getDrawable("草地").draw(10, 100);
        factory.getDrawable("道路").draw(10, 110);
        factory.getDrawable("房屋").draw(10, 120);

    }
}
