package factory;

public class BikeStore {

    public BikeStore(){};

    public Bike createBike(String type){
        Bike bike;

        if(type.equals("tricycle")){
            bike = new Tricycle();
        }
        else if(type.equals("strider")){
            bike = new Strider();
        }
        else if(type.equals("kids bike")){
            bike = new KidsBike();
        }
        else{
            bike = new Tricycle();
        }

        return bike;
    }

}