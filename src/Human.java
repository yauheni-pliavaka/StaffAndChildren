import java.util.ArrayList;

abstract class Human {
    String name;
    String surname;
    String patronymic;
    String birthday;
    boolean sex;

    ArrayList<Human> humanArrayList = new ArrayList<Human>();

    public Human(String name, String surname, String patronymic, String birthday, boolean sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.sex = sex;
    }

    void setRelation(Human human) {
        this.humanArrayList.add(human);
        human.humanArrayList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}

class Staff  extends Human{
    public Staff(String name, String surname, String patronymic, String birthday, boolean sex) {
        super(name, surname, patronymic, birthday, sex);
    }
}

class Child extends Human{
    public Child(String name, String surname, String patronymic, String birthday, boolean sex) {
        super(name, surname, patronymic, birthday, sex);
    }
}