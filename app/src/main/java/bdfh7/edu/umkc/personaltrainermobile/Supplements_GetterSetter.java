package bdfh7.edu.umkc.personaltrainermobile;

/**
 * Created by brenodm on 3/24/15.
 */
public class Supplements_GetterSetter {
    private String supplement_name;
    private String supplement_kind;
    private int icon;

    public Supplements_GetterSetter(String supplement_name, String supplement_kind, int icon) {
        super();
        this.supplement_name = supplement_name;
        this.supplement_kind = supplement_kind;
        this.icon = icon;
    }

    public String getSupplement_name() {
        return supplement_name;
    }

    public void setSupplement_name(String supplement_name) {
        this.supplement_name = supplement_name;
    }

    public String getSupplement_kind() {
        return supplement_kind;
    }

    public void setSupplement_kind(String supplement_kind) {
        this.supplement_kind = supplement_kind;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}

