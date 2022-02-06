package AbstractFactoryPackage;

public class ElectricCarFactory implements AbstractFactory{
    @Override
    public Car getFactory(String car) {
        if(car == "Tesla")
            return new Tesla();
        else if(car == "Nano")
            return new Nano();
        else
            return null;
    }
}
