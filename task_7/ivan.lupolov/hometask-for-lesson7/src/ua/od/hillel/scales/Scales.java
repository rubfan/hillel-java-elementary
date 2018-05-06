package ua.od.hillel.scales;

public class Scales {

    private double maxWeight = 1000;
    private double currWeight = 0;
    private float allowableError = 0;

    public Scales() {
    }

    public Scales(int maxWeight, float allowableError) {
        this.maxWeight = maxWeight;
        this.allowableError = allowableError;
    }

    public void setToZero() {
        currWeight = 0;
    }

    public double getWeigh(ObjectToWeighing object) {
        if((currWeight += object.getWeight()) > maxWeight) {
            return -1;
        } else {
            return (Math.random() > 0.5) ? currWeight - (currWeight * allowableError) : currWeight + (currWeight * allowableError);
        }
    }

    public void addTare(Tare tare) {
        currWeight += tare.getWeight();
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public float getAllowableError() {
        return allowableError;
    }
}