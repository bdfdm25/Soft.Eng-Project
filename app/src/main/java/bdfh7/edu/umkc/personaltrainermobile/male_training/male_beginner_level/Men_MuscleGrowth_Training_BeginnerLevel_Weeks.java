package bdfh7.edu.umkc.personaltrainermobile.male_training.male_beginner_level;

import android.app.Activity;
import android.content.Intent;
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
 * Created by brenodm on 3/26/15.
 */
public class Men_MuscleGrowth_Training_BeginnerLevel_Weeks extends Activity {
    private List<Training_GetterSetter> beginner_level = null;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_training);

        ListView list = (ListView) findViewById(R.id.training_list);


        beginner_level = new ArrayList<Training_GetterSetter>();
        beginner_level.add(new Training_GetterSetter("Week 1", "Beginner", R.drawable.weeks_icon1));
        beginner_level.add(new Training_GetterSetter("Week 2", "Beginner", R.drawable.weeks_icon2));
        beginner_level.add(new Training_GetterSetter("Week 3", "Beginner", R.drawable.weeks_icon3));
        beginner_level.add(new Training_GetterSetter("Week 4", "Beginner", R.drawable.weeks_icon4));
        beginner_level.add(new Training_GetterSetter("Week 5", "Beginner", R.drawable.weeks_icon5));
        beginner_level.add(new Training_GetterSetter("Week 6", "Beginner", R.drawable.weeks_icon6));
        beginner_level.add(new Training_GetterSetter("Week 7", "Beginner", R.drawable.weeks_icon7));
        beginner_level.add(new Training_GetterSetter("Week 8", "Beginner", R.drawable.weeks_icon8));
        beginner_level.add(new Training_GetterSetter("Week 9", "Beginner", R.drawable.weeks_icon9));
        beginner_level.add(new Training_GetterSetter("Week 10", "Beginner", R.drawable.weeks_icon10));
        beginner_level.add(new Training_GetterSetter("Week 11", "Beginner", R.drawable.weeks_icon11));
        beginner_level.add(new Training_GetterSetter("Week 12", "Beginner", R.drawable.weeks_icon12));


        Training_Adapter newAdapter = new Training_Adapter(this, beginner_level);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(newAdapter);

    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {

            showToast("You start on :" + beginner_level.get(position).getSession());
            dayTraining(view);
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void dayTraining(View v) {

        Intent myIntent = new Intent(v.getContext(), Men_MuscleGrowth_Training_BeginnerLevel_Days.class);
        startActivity(myIntent);

    }
}
