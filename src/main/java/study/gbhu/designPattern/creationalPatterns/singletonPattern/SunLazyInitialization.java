package study.gbhu.designPattern.creationalPatterns.singletonPattern;

/**
 * 懒汉模式
 */
public class SunLazyInitialization {
    private volatile static SunLazyInitialization sun;

    private SunLazyInitialization() {
    }

    public static SunLazyInitialization getInstance() {
        if (sun == null) {
            synchronized (SunEagerInitialization.class) {
                if (sun == null) {
                    sun = new SunLazyInitialization();
                }
            }
        }
        return sun;
    }

}
