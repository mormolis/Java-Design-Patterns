
import java.util.Arrays;

public class TestingObservable {


    public static  void main( String[] args){
        String[] bandMembers = {"John", "Jack", "Joe"};
        SuperDuperRockGroup superDuperRockGroup = new SuperDuperRockGroup("Ligers", Arrays.asList(bandMembers));

        Observer george = new NotSuchAFanaticalGroupie(superDuperRockGroup);
        Observer gemina = new FanaticalGroupie(superDuperRockGroup);

        superDuperRockGroup.releaseANewRecord("kakakia record");
        superDuperRockGroup.releaseANewRecord("Tsirlio reload");

        george.unsubscribe();
        gemina.unsubscribe();


        superDuperRockGroup.releaseANewRecord("kakakia record II");
        superDuperRockGroup.releaseANewRecord("Tsirlio reload II");

    }
}
