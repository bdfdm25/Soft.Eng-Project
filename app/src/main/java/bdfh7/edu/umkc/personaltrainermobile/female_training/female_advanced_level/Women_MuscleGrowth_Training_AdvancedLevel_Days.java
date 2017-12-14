package bdfh7.edu.umkc.personaltrainermobile.female_training.female_advanced_level;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bdfh7.edu.umkc.personaltrainermobile.R;
import bdfh7.edu.umkc.personaltrainermobile.Training_Adapter;
import bdfh7.edu.umkc.personaltrainermobile.Training_GetterSetter;

/**
 * Created by brenodm on 4/13/15.
 */
public class Women_MuscleGrowth_Training_AdvancedLevel_Days extends Activity {

    private List<Training_GetterSetter> advanced_level = null;
    private String title;
    private String description;

    final Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_training);

        ListView list = (ListView) findViewById(R.id.training_list);


        advanced_level = new ArrayList<Training_GetterSetter>();
        advanced_level.add(new Training_GetterSetter("Day 1", "", R.drawable.weeks_icon1));
        advanced_level.add(new Training_GetterSetter("Day 2", "", R.drawable.weeks_icon2));
        advanced_level.add(new Training_GetterSetter("Day 3", "", R.drawable.weeks_icon3));
        advanced_level.add(new Training_GetterSetter("Day 4", "", R.drawable.weeks_icon4));
        advanced_level.add(new Training_GetterSetter("Day 5", "", R.drawable.weeks_icon5));
        advanced_level.add(new Training_GetterSetter("Day 6", "", R.drawable.weeks_icon6));
        advanced_level.add(new Training_GetterSetter("Day 7", "", R.drawable.weeks_icon7));


        Training_Adapter newAdapter = new Training_Adapter(this, advanced_level);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(newAdapter);

    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {

            showToast("Today's Group: " + advanced_level.get(position).getGroup());
            exercises(position);
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void exercises(int item) {
        if (item == 0) {
            title = "";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);


            builder.show();
        } else if (item == 1) {
            title = "";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 4) {
            title = "";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
            title = "";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 6) {
            title = "";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }
    }
}
