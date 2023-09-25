package study.gbhu.designPattern.structuralPattern.proxyPattern.dynamicProxy;

import study.gbhu.designPattern.structuralPattern.proxyPattern.Intranet;

//交换机
public class Switch implements Intranet {
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网" + path);
    }
}
