public class Tomato implements SaladBox {

    private SaladBox saladBox;

    public Tomato(SaladBox saladBox){
        this.saladBox = saladBox;
    }

    @Override
    public double getCost() {
        return saladBox.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return saladBox.getDescription() + ", adding tomato";
    }
}
