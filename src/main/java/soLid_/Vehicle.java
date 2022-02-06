package soLid_;

public abstract class Vehicle {
    public void start(){
        System.out.println("Engine started");
    }

    public void stop(){
        System.out.println("Engine stop");
    }

    public abstract void fuel();

}
