package io.cucumber.skeleton;

public class SInterest {
    private final double principal;
    private final double time;
    private final double rate;

    public SInterest(Double P, Double T, Double R) {
        this.principal = P;
        this.rate = R;
        this.time = T;

        this.validate();
    }

    private void validate() {
        if (this.principal <= 0 || this.time <= 0 || this.rate < 0) {
            throw new IllegalArgumentException("Principal, time, and rate must be positive values.");
        }
    }

    public double compute() {
        return (this.principal * this.time * this.rate) / 100;
    }
}
