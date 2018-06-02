public class NotSuchAFanaticalGroupie implements Observer{

    private Observable rockGroup;

    public NotSuchAFanaticalGroupie(Observable observable){
        this.rockGroup = observable;
        subscribeTo();
    }


    public void subscribeTo(){
        rockGroup.addObserver(this);
    }

    @Override
    public void unsubscribe(){
        rockGroup.deleteObserver(this);
    }

    @Override
    public void update() {
        if (rockGroup instanceof MusicGroup){
            listenToTheRecord(((MusicGroup) rockGroup).getLatestRelease());
        }
    }

    private void listenToTheRecord(String record){
        System.out.println("A not-such-a-fanatical-groupie is listening to " + record);
    }
}
