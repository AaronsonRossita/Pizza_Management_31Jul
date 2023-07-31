import java.util.ArrayList;

public abstract class PizzaStore {

    private int id;
    private String address;
    private int numberOfEmployees;
    private ArrayList<Employee> listOfEmployees; // not in constructor
    private String phoneNumber;
    private int rank; // not in constructor

    public PizzaStore(int id, String address, int numberOfEmployees, String phoneNumber) {
        this.id = id;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.listOfEmployees = new ArrayList<Employee>();
        this.phoneNumber = phoneNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double calculateEmployeeExpenses(){
        double sum = 0;
        for(Employee e : this.listOfEmployees){
            sum += e.getSalary();
        }
        return sum;
    }

    public void employeeResigning(Employee e){
        if(this.listOfEmployees.contains(e)){
            listOfEmployees.remove(e);
        }
    }

    public void employeeHiring(Employee e){
        if(this.listOfEmployees.size() < this.numberOfEmployees){
            this.listOfEmployees.add(e);
        }else{
            System.out.println("Sorry, not hiring");
        }
    }

    public void updateSurprise(Employee e, Surpriseable s){
        e.setSurprise(s);
    }

    public void takeBackSurprise(Employee e){
        e.setSurprise(null);
    }


}

