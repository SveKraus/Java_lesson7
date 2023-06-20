public class Human implements Comparable<Human>{



    String name;
    String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
    public int compareTo(Human o) {
        if(this.name.equalsIgnoreCase(o.name)) {
            return this.surname.compareTo(o.surname);
        } else {
            return this.name.compareTo(o.name);
        }
    }
}
