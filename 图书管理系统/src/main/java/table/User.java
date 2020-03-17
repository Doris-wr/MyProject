package table;

public class User {
    private int no;
    private String name;
    private long phone;

    public User(int no, String name, long phone) {
        this.no = no;
        this.name = name;
        this.phone = phone;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}

