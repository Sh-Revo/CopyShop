package TechSpec;

public class CPU {
    private int sizeOfCore;
    private double frequency;

    public CPU(int sizeOfCore, double frequency) {
        this.sizeOfCore = sizeOfCore;
        this.frequency = frequency;
    }

    public int getSizeOfCore() {
        return sizeOfCore;
    }

    public double getFrequency() {
        return frequency;
    }

}
