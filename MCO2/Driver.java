package MCO2;

/**
 * This Driver Class contains the main method of the Java Program.
 * This Class creates the object based on the InputDisplay class which is used to invoke the DisplayPrompts() method in the Driver class.
 */
public class Driver {
    /**
     * This Main method which executes and creates all the necessary objects.
     *
     * @param args arguments supplied by the CLI
     */
    public static void main(String[] args){
        ReservationGUI GUI = new ReservationGUI();
        ReservationSystem reservation = new ReservationSystem();

        InputDisplay Input = new InputDisplay(GUI, reservation);
    }
}
