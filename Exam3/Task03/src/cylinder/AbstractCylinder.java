package cylinder;

public abstract class AbstractCylinder {
    private double length;
    private double weight;

    public AbstractCylinder(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Длина: " + length + " см, объем: " + weight + " литр";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
