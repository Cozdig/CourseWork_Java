public class Employee {

    private static int idGenerator = 1;

    private final int id;
    private final String fullName;
    private String place;
    private int money;


    public Employee(String fullName, String place, int money) {
        id = idGenerator++;
        this.fullName = fullName;
        this.place = place;
        this.money = money;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "id = " + id + ", " + "fullName = " + fullName + ", " + "place = " + place + ", " + "money = " + money;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Employee c2 = (Employee) other;
        return fullName.equals(c2.fullName) && place.equals(c2.place);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(fullName, place);
    }
}
