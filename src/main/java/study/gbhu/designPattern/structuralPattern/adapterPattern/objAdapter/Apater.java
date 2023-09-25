package study.gbhu.designPattern.structuralPattern.adapterPattern.objAdapter;

import study.gbhu.designPattern.structuralPattern.adapterPattern.DualPin;
import study.gbhu.designPattern.structuralPattern.adapterPattern.TriplePin;

public class Apater implements TriplePin {
    private DualPin dualPinDevie;

    public Apater(DualPin dualPinDevie) {
        this.dualPinDevie = dualPinDevie;
    }

    @Override
    public void electrify(int l, int n, int e) {
        dualPinDevie.electrify(l, n);
    }
}
