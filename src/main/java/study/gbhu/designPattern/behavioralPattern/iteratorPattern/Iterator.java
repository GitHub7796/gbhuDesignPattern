package study.gbhu.designPattern.behavioralPattern.iteratorPattern;

public interface Iterator<E> {
    E next();//下一个元素

    boolean hasNext();//是否还有下一个元素
}
