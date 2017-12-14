package bdfh7.edu.umkc.personaltrainermobile.male_training.male_advanced_level;

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
public class Men_MuscleGrowth_Training_AdvancedLevel_Weeks extends Activity {

    private List<Training_GetterSetter> advanced_level = null;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_training);

        ListView list = (ListView) findViewById(R.id.training_list);


        advanced_level = new ArrayList<Training_GetterSetter>();
        advanced_level.add(new Training_GetterSetter("Week 1", "Advanced", R.drawable.weeks_icon1));
        advanced_level.add(new Training_GetterSetter("Week 2", "Advanced", R.drawable.weeks_icon2));
        advanced_level.add(new Training_GetterSetter("Week 3", "Advanced", R.drawable.weeks_icon3));
        advanced_level.add(new Training_GetterSetter("Week 4", "Advanced", R.drawable.weeks_icon4));
        advanced_level.add(new Training_GetterSetter("Week 5", "Advanced", R.drawable.weeks_icon5));
        advanced_level.add(new Training_GetterSetter("Week 6", "Advanced", R.drawable.weeks_icon6));
        advanced_level.add(new Training_GetterSetter("Week 7", "Advanced", R.drawable.weeks_icon7));
        advanced_level.add(new Training_GetterSetter("Week 8", "Advanced", R.drawable.weeks_icon8));
        advanced_level.add(new Training_GetterSetter("Week 9", "Advanced", R.drawable.weeks_icon9));
        advanced_level.add(new Training_GetterSetter("Week 10", "Advanced", R.drawable.weeks_icon10));
        advanced_level.add(new Training_GetterSetter("Week 11", "Advanced", R.drawable.weeks_icon11));
        advanced_level.add(new Training_GetterSetter("Week 12", "Advanced", R.drawable.weeks_icon12));


        Training_Adapter newAdapter = new Training_Adapter(this, advanced_level);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(newAdapter);

    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {

            showToast("You start on :" + advanced_level.get(position).getSession());
            dayTraining(view);
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void dayTraining(View v) {

        Intent myIntent = new Intent(v.getContext(), Men_MuscleGrowth_Training_AdvancedLevel_Days.class);
        startActivity(myIntent);

    }
}
