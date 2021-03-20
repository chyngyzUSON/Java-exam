import java.util.LinkedList;
import java.util.List;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return false;
        else if (obj instanceof Person)
            return ((Person) obj).getSurname().equals(this.getSurname()) &&
                    ((Person) obj).getName().equals(this.getName()) &&
                    ((Person) obj).getPatronymic().equals(this.getPatronymic());
        return true;
    }

    public List<Person> addPerson(String surname, String name, String patronymic) throws Exception {
        //List<Person> people = new LinkedList<>();
        if (surname.equals(this.getSurname()) && name.equals(this.getName()) && patronymic.equals(this.getPatronymic())) {
            throw new Exception("Такой объект уже существует");
        }
        else return null;


    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }


}
