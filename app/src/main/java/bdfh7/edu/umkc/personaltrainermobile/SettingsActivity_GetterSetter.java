package bdfh7.edu.umkc.personaltrainermobile;

/**
 * Created by brenodm on 5/11/15.
 */
public class SettingsActivity_GetterSetter {
    private int icon;
    private String option_title;

    public SettingsActivity_GetterSetter(String option_title, int icon) {
        super();
        this.option_title = option_title;
        this.icon = icon;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getOption_title() {
        return option_title;
    }

    public void setOption_title(String option_title) {
        this.option_title = option_title;
    }
}
