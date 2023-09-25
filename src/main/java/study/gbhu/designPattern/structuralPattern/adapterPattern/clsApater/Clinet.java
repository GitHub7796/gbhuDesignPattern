package study.gbhu.designPattern.structuralPattern.adapterPattern.clsApater;

import study.gbhu.designPattern.structuralPattern.adapterPattern.TriplePin;

public class Clinet {
    public static void main(String[] args) {
        TriplePin tvAdapter = new TVAdapter();//电视机 专属三相适配器 插入 三相插孔
        tvAdapter.electrify(1, 0, -1);
    }
}
