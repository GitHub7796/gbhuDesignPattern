package study.gbhu.designPattern.structuralPattern.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class BlackListFilter implements InvocationHandler {
    private List<String> blackList = Arrays.asList("电影", "游戏");
    private Object origin;//被代理的对象

    public BlackListFilter(Object origin) {
        this.origin = origin;
        System.out.println("开启黑名单过滤");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String arg = args[0].toString();
        for (String keyword : blackList) {
            if (arg.contains(keyword)) {
                System.out.println("禁止访问" + arg);
                return null;
            }
        }
        System.out.println("校验通过");
        return method.invoke(origin, arg);
    }
}
