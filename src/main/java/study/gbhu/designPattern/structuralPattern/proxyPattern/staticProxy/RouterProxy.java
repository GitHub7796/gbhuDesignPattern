package study.gbhu.designPattern.structuralPattern.proxyPattern.staticProxy;

import study.gbhu.designPattern.structuralPattern.proxyPattern.Internet;

import java.util.Arrays;
import java.util.List;

public class RouterProxy implements Internet {
    private Internet modem;//被代理对象
    private List<String> blackList = Arrays.asList("电影", "游戏");//访问黑名单

    public RouterProxy() throws Exception {
        this.modem = new Modem("123456");//实例化被代理对象
    }

    @Override
    public void httpAccess(String url) {
        for (String keyword : blackList) {
            if (url.contains(keyword)) {
                System.out.println("禁止访问" + url);
                return;
            }
        }
        modem.httpAccess(url);//请求转发至 猫 进行访问
    }
}
