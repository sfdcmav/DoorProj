import java.util.Timer;
import java.util.TimerTask;

public class DogDoorSimulator {

   public static void main(String[] args) {
    DogDoor door = new DogDoor();
    Remote rem = new Remote(door);
    System.out.println("Fido barks to go outside" + door.isOpen());
    rem.pressButton();
    System.out.println("Door opens and fido is gone" + door.isOpen());
    System.out.println("Within 5 sec fido is back at door to get back in ");
        System.out.println("Door still remains open to let fido in " + door.isOpen());

    final Timer timer = new Timer(); 
    timer.schedule(new TimerTask() {
        public void run(){
            door.close();
            System.out.println("Door closed automatically after 5 sec" + door.isOpen());    
            timer.cancel();
        }
    }, 5000);
   

           System.out.println("Fido is out , press to open door" + door.isOpen());
           rem.pressButton();
           System.out.println("Door opens and fido is in" + door.isOpen());
           timer.schedule(new TimerTask() {
            public void run(){
                door.close();
                System.out.println("Door closed automatically after 5 sec" + door.isOpen());    
                timer.cancel();
            }
        }, 5000);


    }

   
    
    
}
