public class SmartPhone implements Jingle{
    private String model;

    public SmartPhone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void sound() {
        System.out.println("Телефон звенит");
    }

    @Override
    public String toString() {
        return "Кто-то звонит, вытаскиваем из кармана";
    }
}
