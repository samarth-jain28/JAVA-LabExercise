public class Bicycle extends Vehicle{
    private String model;
    public Bicycle(String brand , String model){
        super(brand);
        this.model = model;
    }
    public void bicycleInfo(){
        System.out.println("Bicycle Info: ");
        super.display();
        System.out.println("Model: "+model);
    }
}