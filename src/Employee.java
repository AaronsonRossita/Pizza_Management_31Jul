import java.time.LocalDate;
import java.util.Date;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private double salary;
    private LocalDate startDate;
    private int rank;
    private LocalDate rankDate;
    private Surpriseable surprise;

    public Employee(int id, String firstName, String lastName, String address, double salary, int rank) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.startDate = LocalDate.now();
        if(rank >= 0 && rank <= 100) {
            this.rank = rank;
        }
        //this.rankDate = LocalDate.now();
        this.rankDate = LocalDate.of(2023,7,10);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getRank() {
        return rank;
    }

    public void setRank() {
        this.rank = (int)(Math.random()*100);
        this.rankDate = LocalDate.now();
    }

    public LocalDate getRankDate() {
        return rankDate;
    }

    public Surpriseable getSurprise() {
        return surprise;
    }

    public void setSurprise(Surpriseable surprise) {
        this.surprise = surprise;
    }

    @Override
    public String toString() {
        return this.firstName;
    }
}
