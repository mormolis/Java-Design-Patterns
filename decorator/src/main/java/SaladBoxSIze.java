public class SaladBoxSIze implements SaladBox{

    Size size;

    public SaladBoxSIze(Size size) {
        this.size = size;

    }

    @Override
    public double getCost() {
        return size.getPrice();
    }

    @Override
    public String getDescription() {
        return  "saladbox size: " + size.getDescription();
    }


}
