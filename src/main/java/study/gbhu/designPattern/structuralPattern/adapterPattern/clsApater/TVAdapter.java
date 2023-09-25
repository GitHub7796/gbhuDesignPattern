package study.gbhu.designPattern.structuralPattern.adapterPattern.clsApater;

import study.gbhu.designPattern.structuralPattern.adapterPattern.TV;
import study.gbhu.designPattern.structuralPattern.adapterPattern.TriplePin;

public class TVAdapter extends TV implements TriplePin{
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l,n);
    }
}
