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
 * Created by brenodm on 3/23/15.
 */
public class DietActivity_Adapter extends BaseAdapter {
    private List<DietActivity_GetterSetter> diet;

    private LayoutInflater inflater;

    public DietActivity_Adapter(Context context, List<DietActivity_GetterSetter> new_diet) {
        this.diet = new_diet;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(final DietActivity_GetterSetter item) {
        this.diet.add(item);
        notifyDataSetChanged();
    }

    public int getCount() {
        return diet.size();
    }

    public Object getItem(int position) {
        return diet.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {

        DietActivity_GetterSetter supplement = diet.get(position);

        convertView = inflater.inflate(R.layout.diet_itens, null);

        ImageView icon = (ImageView) convertView.findViewById(R.id.diet_icon);
        TextView name = (TextView) convertView.findViewById(R.id.diet_name);
        TextView description = (TextView) convertView.findViewById(R.id.diet_description);

        icon.setImageResource(supplement.getIcon());
        name.setText(supplement.getDiet_name());
        description.setText(supplement.getDiet_description());

        return convertView;
    }
}
