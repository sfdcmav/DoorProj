public class DogDoor {

    Boolean open;

    public DogDoor(){
        this.open = false;
    }

    public void open(){
        open = true;
    }

    public void close(){
        open = false;
    }

    public boolean isOpen(){
        return open;
    }
}