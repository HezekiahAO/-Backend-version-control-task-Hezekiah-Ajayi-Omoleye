package vehicles;

public abstract class Vehicles {
    private String make;
    private String model;

    public Vehicles(String make, String model) {
        this.make = make;    // I created uniqe instance for his guys
        this.model = model;
    }


    public String getMake() {  //
            return make;
        }


    public String SetMake(String make) {  //
            this.make = make;
            return make;
        }

        public String getModel() {
            return model;
        }

    public String SetModel(String model) {
            this.model = model;
            return model;
        }

    public abstract String describe();  // I created an abstract method for this class so that the subclasses can implement it

}