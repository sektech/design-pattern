public class SingleTonClass {

    private static SingleTonClass instance;
    private SingleTonClass(){

    }
    public synchronized static SingleTonClass getInstance(){
        if(instance==null){
            instance=new SingleTonClass();
        }
        return instance;
    }
    public void display(){
        System.out.println("This is from singleTon");
    }
}
