package bdfh7.edu.umkc.personaltrainermobile.exercises;

/**
 * Created by brenodm on 4/29/15.
 */
public class Exercises_GetterSetter {
    private String muscle_group;
    private int icon;

    public Exercises_GetterSetter(String muscle_group, int icon) {
        super();
        this.muscle_group = muscle_group;
        this.icon = icon;
    }

    public String getMuscle_group() {
        return muscle_group;
    }

    public void setMuscle_group(String muscle_group) {
        this.muscle_group = muscle_group;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

}
