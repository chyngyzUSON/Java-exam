package sphere;

public abstract class AbstractSphere {
    private double diameter;
    private double weight;

    public AbstractSphere(double diameter, double weight) {
        this.diameter = diameter;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Диаметр: " + diameter + " см, вес: " + weight + " граммов";
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
