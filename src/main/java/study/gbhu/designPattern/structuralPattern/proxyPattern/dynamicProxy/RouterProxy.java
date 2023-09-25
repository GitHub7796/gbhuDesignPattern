package study.gbhu.designPattern.structuralPattern.proxyPattern.dynamicProxy;

import study.gbhu.designPattern.structuralPattern.proxyPattern.Internet;
import study.gbhu.designPattern.structuralPattern.proxyPattern.staticProxy.Modem;

public class RouterProxy implements Internet {
    private Internet modem;

    public RouterProxy() throws Exception {
        this.modem = new Modem("123456");
    }

    @Override
    public void httpAccess(String url) {
        modem.httpAccess(url);
    }
}
