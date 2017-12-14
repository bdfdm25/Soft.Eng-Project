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
 * Created by brenodm on 5/11/15.
 */
public class SettingsActivity_Adapter extends BaseAdapter {
    private List<SettingsActivity_GetterSetter> option;

    private LayoutInflater inflater;

    public SettingsActivity_Adapter(Context context, List<SettingsActivity_GetterSetter> new_diet) {
        this.option = new_diet;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(final SettingsActivity_GetterSetter item) {
        this.option.add(item);
        notifyDataSetChanged();
    }

    public int getCount() {
        return option.size();
    }

    public Object getItem(int position) {
        return option.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {

        SettingsActivity_GetterSetter supplement = option.get(position);

        convertView = inflater.inflate(R.layout.listview_settings_itens, null);

        ImageView icon = (ImageView) convertView.findViewById(R.id.about_developer);
        TextView name = (TextView) convertView.findViewById(R.id.settings_option);

        icon.setImageResource(supplement.getIcon());
        name.setText(supplement.getOption_title());



        return convertView;
    }
}
