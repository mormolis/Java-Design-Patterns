import java.util.ArrayList;
import java.util.List;

public class SuperDuperRockGroup implements Observable, MusicGroup {

    private List<String> records;
    private List<Observer> observers;

    private String bandName;
    private List<String> bandMembers;

    public SuperDuperRockGroup(String bandName, List<String> bandMembers){
        this.records = new ArrayList<>();
        this.observers = new ArrayList<>();

        this.bandName = bandName;
        this.bandMembers = bandMembers;
    }


    @Override
    public void releaseANewRecord(String recordName){
        System.out.println(this.getClass() + " is releasing " + recordName);
        records.add(recordName);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(observer -> observer.update());
    }

    public String getLatestRelease() {
        return records.get(records.size() - 1);
    }
}
