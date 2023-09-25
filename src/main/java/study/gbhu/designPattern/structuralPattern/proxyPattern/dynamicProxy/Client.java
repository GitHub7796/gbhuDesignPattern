package study.gbhu.designPattern.structuralPattern.proxyPattern.dynamicProxy;

import study.gbhu.designPattern.structuralPattern.proxyPattern.Intranet;
import study.gbhu.designPattern.structuralPattern.proxyPattern.Internet;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        Internet internet = (Internet) Proxy.newProxyInstance(
                RouterProxy.class.getClassLoader(),
                RouterProxy.class.getInterfaces(),
                new BlackListFilter(new RouterProxy())
        );
        internet.httpAccess("http://www.电影.com");
        internet.httpAccess("http://www.游戏.com");
        internet.httpAccess("http://www.学习.com");

        Intranet intranet = (Intranet) Proxy.newProxyInstance(
                Switch.class.getClassLoader(),
                Switch.class.getInterfaces(),
                new BlackListFilter(new Switch())
        );
        intranet.fileAccess("\\\\192.6.8.x\\电影\\1.mp4");
        intranet.fileAccess("\\\\192.6.8.x\\游戏\\1.exe");
        intranet.fileAccess("\\\\192.6.8.x\\学习\\学习资料");


    }
}
