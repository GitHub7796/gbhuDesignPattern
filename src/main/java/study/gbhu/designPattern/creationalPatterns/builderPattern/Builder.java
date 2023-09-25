package study.gbhu.designPattern.creationalPatterns.builderPattern;

public interface Builder {
    public void buildeBasement();
    public void buildeWall();
    public void buildeRoof();
    public Building getBuilding();
}
