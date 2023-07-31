
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"a","aa","aaa",100,100);
        Employee e2 = new Employee(2,"b","bb","bbb",150,90);
        Employee e3 = new Employee(3,"c","cc","ccc",200,100); // 100
        Employee e4 = new Employee(1,"d","dd","ddd",300,100);
        Employee e5 = new Employee(2,"e","ee","eee",200,70);
        Employee e6 = new Employee(3,"f","ff","fff",100,60); // 73


        PizzaHut pizzaHut = new PizzaHut(1,"TLV",5,"1234"); // 450
        PizzaDominos pizzaDominos = new PizzaDominos(1,"TLV",5,"5678"); // 600

        pizzaHut.employeeHiring(e1);
        pizzaHut.employeeHiring(e2);
        pizzaHut.employeeHiring(e3);

        pizzaDominos.employeeHiring(e4);
        pizzaDominos.employeeHiring(e5);
        pizzaDominos.employeeHiring(e6);

        Holiday h1 = new Holiday("Rome");
        Holiday h2 = new Holiday("Zanzibar");

        System.out.println(e1.getSurprise());
        pizzaHut.updateSurprise(e1,h1);
        System.out.println(e1.getSurprise());
        e1.getSurprise().activateSurprise();

        pizzaHut.takeBackSurprise(e1);
        System.out.println(e1.getSurprise());






    }

}