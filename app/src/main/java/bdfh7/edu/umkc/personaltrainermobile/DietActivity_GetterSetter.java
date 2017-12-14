package bdfh7.edu.umkc.personaltrainermobile;

/**
 * Created by brenodm on 3/23/15.
 */
public class DietActivity_GetterSetter {
    private String diet_name;
    private String diet_description;
    private int icon;

    public DietActivity_GetterSetter(String diet_name, String diet_description, int icon) {
        super();
        this.diet_name = diet_name;
        this.diet_description = diet_description;
        this.icon = icon;
    }

    public String getDiet_name() {
        return diet_name;
    }

    public void setDiet_name(String diet_name) {
        this.diet_name = diet_name;
    }

    public String getDiet_description() {
        return diet_description;
    }

    public void setDiet_description(String diet_description) {
        this.diet_description = diet_description;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}