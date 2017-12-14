package bdfh7.edu.umkc.personaltrainermobile;

/**
 * Created by brenodm on 3/25/15.
 */
public class Training_GetterSetter {
    private String session;
    private String group;
    private int icon;

    public Training_GetterSetter(String session, String group, int icon) {
        super();
        this.session = session;
        this.group = group;
        this.icon = icon;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}


