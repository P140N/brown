import java.util.ArrayList;

/**
 * Created by anton on 21.01.15.
 */
public class Brown {
    private ArrayList<GasMolecul> moleculs;
    private Partcle partcle;
    public void start(int number){
        moleculs = new ArrayList<GasMolecul>();
        for (int i = 0;i<number;i++){
            moleculs.add(new GasMolecul());
        }
        partcle = new Partcle();
    }
}
