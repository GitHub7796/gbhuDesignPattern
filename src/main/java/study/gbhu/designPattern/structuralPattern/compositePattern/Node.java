package study.gbhu.designPattern.structuralPattern.compositePattern;

public abstract class Node {
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    //抽象化 添加子类的方法
    protected abstract void add(Node child);

    protected void tree(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print(" ");//先输出空格
        }
        System.out.println(name);//再输出自己的名字
    }

    //无参的构造方法
    protected void tree() {
        this.tree(0);
    }
}
