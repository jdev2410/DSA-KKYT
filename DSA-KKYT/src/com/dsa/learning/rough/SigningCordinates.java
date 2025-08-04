package com.dsa.learning.rough;

public class SigningCordinates {
    public double llx;
    public double lly;

    public SigningCordinates(double llx, double lly, double urx, double ury) {
        this.llx = llx;
        this.lly = lly;
        this.urx = urx;
        this.ury = ury;
    }

    public double urx;
    public double ury;

    public double getLlx() {
        return llx;
    }

    public void setLlx(double llx) {
        this.llx = llx;
    }

    public double getLly() {
        return lly;
    }

    public void setLly(double lly) {
        this.lly = lly;
    }

    public double getUrx() {
        return urx;
    }

    public void setUrx(double urx) {
        this.urx = urx;
    }

    public double getUry() {
        return ury;
    }

    public void setUry(double ury) {
        this.ury = ury;
    }

    @Override
    public String toString() {
        return "SigningCordinates{" +
                "llx=" + llx +
                ", lly=" + lly +
                ", urx=" + urx +
                ", ury=" + ury +
                '}';
    }
}

