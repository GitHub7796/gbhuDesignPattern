package study.gbhu.designPattern.structuralPattern.proxyPattern.staticProxy;

import study.gbhu.designPattern.structuralPattern.proxyPattern.Internet;

public class Modem implements Internet {

    public Modem(String passwd) throws Exception {
        if (!"123456".equals(passwd)) {
            throw new Exception("拨号失败");
        }
        System.out.println("拨号上网成功");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("正在访问" + url);
    }
}
