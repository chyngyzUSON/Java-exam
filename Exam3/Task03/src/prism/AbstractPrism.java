package prism;

public abstract class AbstractPrism {
    private double thickness; //толщина
    private double weight;

    public AbstractPrism(double thickness, double weight) {
        this.thickness = thickness;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Толщина: " + thickness + " см, вес: " + weight + " граммов";
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
