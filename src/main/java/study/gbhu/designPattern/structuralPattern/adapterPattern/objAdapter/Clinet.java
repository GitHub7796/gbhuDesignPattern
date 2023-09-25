package study.gbhu.designPattern.structuralPattern.adapterPattern.objAdapter;

import study.gbhu.designPattern.structuralPattern.adapterPattern.DualPin;
import study.gbhu.designPattern.structuralPattern.adapterPattern.TV;
import study.gbhu.designPattern.structuralPattern.adapterPattern.TriplePin;

public class Clinet {
    public static void main(String[] args) {
        DualPin dualPinDevice = new TV();
        TriplePin triplePinDevice = new Apater(dualPinDevice);
        triplePinDevice.electrify(1, 0, -1);
    }
}
