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
 * Created by brenodm on 3/25/15.
 */
public class Training_Adapter extends BaseAdapter {
    private List<Training_GetterSetter> week;

    private LayoutInflater inflater;

    public Training_Adapter(Context context, List<Training_GetterSetter> new_week) {
        this.week = new_week;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(final Training_GetterSetter item) {
        this.week.add(item);

    }

    public int getCount() {
        return week.size();
    }

    public Object getItem(int position) {
        return week.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {

        Training_GetterSetter schedule = week.get(position);

        convertView = inflater.inflate(R.layout.listview_training_itens, null);

        ImageView icon = (ImageView) convertView.findViewById(R.id.week_icon);
        TextView name = (TextView) convertView.findViewById(R.id.actual_week);
        TextView group = (TextView) convertView.findViewById(R.id.muscle_group);


        icon.setImageResource(schedule.getIcon());
        name.setText(schedule.getSession());
        group.setText(schedule.getGroup());

        return convertView;
    }
}


