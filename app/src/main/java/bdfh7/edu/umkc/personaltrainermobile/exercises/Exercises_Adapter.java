package bdfh7.edu.umkc.personaltrainermobile.exercises;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bdfh7.edu.umkc.personaltrainermobile.R;


/**
 * Created by brenodm on 4/29/15.
 */
public class Exercises_Adapter extends BaseAdapter {
    private List<Exercises_GetterSetter> group;

    private LayoutInflater inflater;

    public Exercises_Adapter(Context context, List<Exercises_GetterSetter> new_group) {
        this.group = new_group;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(final Exercises_GetterSetter item) {
        this.group.add(item);

    }

    public int getCount() {
        return group.size();
    }

    public Object getItem(int position) {
        return group.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {

        Exercises_GetterSetter exercise = group.get(position);

        convertView = inflater.inflate(R.layout.listview_exercises_itens, null);

        ImageView icon = (ImageView) convertView.findViewById(R.id.muscle_icon);
        TextView muscle_group = (TextView) convertView.findViewById(R.id.actual_group);


        icon.setImageResource(exercise.getIcon());
        muscle_group.setText(exercise.getMuscle_group());

        return convertView;
    }
}
