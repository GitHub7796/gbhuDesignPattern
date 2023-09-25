package study.gbhu.designPattern.creationalPatterns.singletonPattern;

/**
 * 饿汉模式
 */
public class SunEagerInitialization {

    /**
     * static 类加载时就被初始化，与类同时期且早于内存堆中的对象实例化的，该实例在内存中永生，内存垃圾收集器(Garbage Collector, GC)也不会对其进行回收
     * final 确保不能被改变，是一颗恒星
     */
    private final static SunEagerInitialization sun = new SunEagerInitialization();

    //构造函数私有化，禁止外部调用
    private SunEagerInitialization() {
    }

    public static SunEagerInitialization getSun() {
        return sun;
    }
}
