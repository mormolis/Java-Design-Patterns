public class FanaticalGroupie implements Observer{
    private Observable rockGroup;

    public FanaticalGroupie(Observable observable){
        this.rockGroup = observable;
        subscribeTo();
    }


    @Override
    public void unsubscribe(){
        rockGroup.deleteObserver(this);
    }


    @Override
    public void update() {
        if (rockGroup instanceof MusicGroup){
            buyTheRecord(((MusicGroup) rockGroup).getLatestRelease());
        }
    }

    private void subscribeTo(){
        rockGroup.addObserver(this);
    }

    private void buyTheRecord(String record){
        System.out.println("A fanatical-groupie just bought " + record);
    }
}


