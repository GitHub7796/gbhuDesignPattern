package study.gbhu.designPattern.creationalPatterns.builderPattern;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Building direct() {
        System.out.println("工程启动===");
        builder.buildeBasement();
        builder.buildeWall();
        builder.buildeRoof();
        System.out.println("工程结束===");
        return builder.getBuilding();
    }
}
