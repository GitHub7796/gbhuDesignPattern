package study.gbhu.designPattern.creationalPatterns.prototypePattern;

public class EnemyPlaneFactory {
    private static EnemyPlane enemyPlanePrototype = new EnemyPlane(200);

    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane clone = enemyPlanePrototype.clone();
        clone.setX(x);
        return clone;
    }
}
