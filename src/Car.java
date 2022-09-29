public class Car {
    private int pocetKol;
    private String vyrobce;
    private boolean jeNastartovane;
    private String barva;
    /* ee */
    private char kraj;

    public Car(){
        pocetKol = 4;
        vyrobce = "Toyota";
        jeNastartovane = false;
        barva = "black";
        kraj = 'O';
    }

    public Car(String barva){
        pocetKol = 4;
        vyrobce = "Toyota";
        jeNastartovane = false;
        this.barva = barva;
        kraj = 'O';
    }

    public void NastartovatAuto(){
        jeNastartovane = true;
    }
    public void carStarting(){
        if (jeNastartovane== true){
            System.out.println("Stop starting bro");
        }
        else {
            jeNastartovane = true;
            System.out.println("Car has started");
        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "pocetKol=" + pocetKol +
                ", vyrobce='" + vyrobce + '\'' +
                ", jeNastartovane=" + jeNastartovane +
                ", barva='" + barva + '\'' +
                ", kraj=" + kraj +
                '}';
    }
}
