package hit_java.buoi5.b2;

public class School {
    private String Name;
    private String Date;

    public School() {

    }

    public School(String name, String date) {
        Name = name;
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
