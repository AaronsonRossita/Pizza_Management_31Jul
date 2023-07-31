public class Holiday implements Surpriseable {


    private String destination;

    public Holiday(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void activateSurprise() {
        System.out.println("You got a surprise holiday to " + destination + ". Congrats!!!");
    }

    @Override
    public String toString() {
        return "Holiday to " + destination;
    }
}
