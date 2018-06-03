public class Peanuts implements SaladBox {
    private SaladBox saladBox;

    public Peanuts(SaladBox saladBox){
        this.saladBox = saladBox;
    }

    @Override
    public double getCost() {
        return saladBox.getCost() + 0.30;
    }

    @Override
    public String getDescription() {
        return saladBox.getDescription() + ", adding peanuts";
    }
}
