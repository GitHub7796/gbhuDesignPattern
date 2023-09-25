package study.gbhu.designPattern.creationalPatterns.builderPattern;

public class HouseBuilder implements Builder{
    private Building house;

    public HouseBuilder() {
        this.house = new Building();
    }

    @Override
    public void buildeBasement() {
        System.out.println("普通房屋建造 地基");
    }

    @Override
    public void buildeWall() {
        System.out.println("普通房屋建造 墙壁");
    }

    @Override
    public void buildeRoof() {
        System.out.println("普通房屋建造 屋顶");

    }

    @Override
    public Building getBuilding() {
        return house;
    }
}
