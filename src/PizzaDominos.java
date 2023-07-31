import java.time.LocalDate;
import java.util.ArrayList;

public class PizzaDominos extends PizzaStore implements Rankable{
    public PizzaDominos(int id, String address, int numberOfEmployees, String phoneNumber) {
        super(id, address, numberOfEmployees, phoneNumber);
    }

    @Override
    public void calculateRank() {
        int sum = 0;
        for (int i = 0; i < this.getListOfEmployees().size(); i++) {
            sum += this.getListOfEmployees().get(i).getRank();
        }
        this.setRank(sum);
    }

    @Override
    public void calculateRangedRank(int range) {
        boolean flag = true;
        LocalDate today = LocalDate.now();
        ArrayList<Employee> list = this.getListOfEmployees();
        for (int i = 0; i < list.size(); i++) {
            if(today.getDayOfMonth() - list.get(i).getRankDate().getDayOfMonth() > range){
                flag = false;
            }
        }
        if(flag){
            calculateRank();
        }else{
            System.out.println("some employees need to update their rank");
        }
    }
}
