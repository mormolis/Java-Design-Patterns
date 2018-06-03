public enum Size {

     SMALL("small", 3.0),
     MEDIUM("medium", 4.0),
     LARGE("Large", 5.0);

    private String description;
    private double price;
     Size(String description, double price){
         this.description = description;
         this.price = price;
     }

     public double getPrice(){
         return price;
     }

     public String getDescription(){
         return description;
     }

}
