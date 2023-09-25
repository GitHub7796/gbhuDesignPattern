package study.gbhu.designPattern.structuralPattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Floder extends Node{
    //泛型是node，表示可以添加文件夹、也可以添加文件
    private List<Node> childrenNodes = new ArrayList<>();
    public Floder(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        childrenNodes.add(child);
    }

    @Override
    protected void tree(int space) {
        super.tree(space);//调用父类，先输出自己的名字
        space++;//增加缩进
        for (Node node : childrenNodes) {
            node.tree(space);//调用子节点的tree
        }
    }
}
