import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class PizzaHut extends PizzaStore implements Rankable{

    public PizzaHut(int id, String address, int numberOfEmployees, String phoneNumber) {
        super(id, address, numberOfEmployees, phoneNumber);
    }

    @Override
    public void calculateRank() {
        int sum = 0;
        for (int i = 0; i < this.getListOfEmployees().size(); i++) {
            sum += this.getListOfEmployees().get(i).getRank();
        }
        this.setRank(sum / this.getListOfEmployees().size());
    }

    @Override
    public void calculateRangedRank(int range) {
        boolean flag = true;
        LocalDate today = LocalDate.now();
        ArrayList<Employee> list = this.getListOfEmployees();
        for (int i = 0; i < list.size(); i++) {
            if(ChronoUnit.DAYS.between(list.get(i).getRankDate(),today) > range){
                flag = false;
                break;
            }
        }
        if(flag){
            calculateRank();
        }else{
            System.out.println("some employees need to update their rank");
        }


    }
}
