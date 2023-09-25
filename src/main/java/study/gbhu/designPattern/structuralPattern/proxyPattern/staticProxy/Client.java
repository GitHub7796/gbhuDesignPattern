package study.gbhu.designPattern.structuralPattern.proxyPattern.staticProxy;

import study.gbhu.designPattern.structuralPattern.proxyPattern.Internet;

public class Client {
    public static void main(String[] args) throws Exception {
        Internet proxy = new RouterProxy();
        proxy.httpAccess("http://www.电影.com");
        proxy.httpAccess("http://www.游戏.com");
        proxy.httpAccess("http://www.学习.com");
    }
}
