public class Car extends Vehicle{
    private String model ;
    public Car (String brand , String model){
        super(brand);
        this.model=model;
    }
    public void carInfo(){
        System.out.println("Car Info: ");
        super.display();
        System.out.println("Model: "+model);
    }
}