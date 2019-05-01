package MobilePhone;

public class Contacts {


    private String name;
    private int number;

    public Contacts getContacts(){
        return this;
    }

    public Contacts(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Contacts() {
        this(null,0);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}


