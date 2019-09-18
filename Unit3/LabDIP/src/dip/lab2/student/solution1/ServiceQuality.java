package dip.lab2.student.solution1;

public enum ServiceQuality {
    GOOD(0.20),
    FAIR(0.15),
    POOR(0.10);

    private double v;

    ServiceQuality(double v) {
        this.setV(v);
    }


    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
}
