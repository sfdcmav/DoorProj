public class DogDoorSimulator {

   public static void main(String[] args) {
    DogDoor door = new DogDoor();
    Remote rem = new Remote(door);
    System.out.println("Fido barks to go outside" + door.isOpen());
    rem.pressButton();
    System.out.println("Fido is all done");

    try{

        Thread.currentThread();
        Thread.sleep(10000);
    } catch(InterruptedException e){}

    System.out.println("Fido stuck outside and barks");
    System.out.println("Gina hears and presses remote");
    rem.pressButton();
    System.out.println("Fids is back inside");

   
       


    }

   
    
    
}
