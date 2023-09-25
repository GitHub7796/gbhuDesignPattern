package study.gbhu.designPattern.creationalPatterns.builderPattern;

public class ApartmentBuilder implements Builder{
    private Building apartment;

    public ApartmentBuilder() {
        this.apartment = new Building();
    }

    @Override
    public void buildeBasement() {
        System.out.println("公寓建造 地基");
    }

    @Override
    public void buildeWall() {
        System.out.println("公寓建造 墙壁");
    }

    @Override
    public void buildeRoof() {
        System.out.println("公寓建造 屋顶");

    }
    @Override
    public Building getBuilding() {
        return apartment;
    }
}
