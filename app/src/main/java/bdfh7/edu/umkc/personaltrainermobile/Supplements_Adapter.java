package bdfh7.edu.umkc.personaltrainermobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by brenodm on 3/24/15.
 */
public class Supplements_Adapter extends BaseAdapter {
    private List<Supplements_GetterSetter> supplements;

    private LayoutInflater inflater;

    public Supplements_Adapter(Context context, List<Supplements_GetterSetter> new_supplement) {
        this.supplements = new_supplement;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(final Supplements_GetterSetter item) {
        this.supplements.add(item);
        notifyDataSetChanged();
    }

    public int getCount() {
        return supplements.size();
    }

    public Object getItem(int position) {
        return supplements.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {

        Supplements_GetterSetter supplement = supplements.get(position);


        convertView = inflater.inflate(R.layout.listview_supplements_itens, null);

        ImageView icon = (ImageView) convertView.findViewById(R.id.supplement_icon);
        TextView name = (TextView) convertView.findViewById(R.id.supplement_name);
        TextView kind = (TextView) convertView.findViewById(R.id.supplement_kind);


        icon.setImageResource(supplement.getIcon());
        name.setText(supplement.getSupplement_name());
        kind.setText(supplement.getSupplement_kind());

        return convertView;
    }
}
