package bdfh7.edu.umkc.personaltrainermobile.exercises;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bdfh7.edu.umkc.personaltrainermobile.R;

/**
 * Created by brenodm on 5/3/15.
 */
public class Exercises_Group_Biceps extends ActionBarActivity {

    private List<Exercises_GetterSetter> muscle = null;
    final Context context = this;
    private String title;
    private String description;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_exercises);

        ListView list = (ListView)findViewById(R.id.exercises_list);

        muscle = new ArrayList<Exercises_GetterSetter>();
        muscle.add(new Exercises_GetterSetter("Seated Alternate Dumbbell Curl", R.drawable.barbell_bench));
        muscle.add(new Exercises_GetterSetter("Barbell Curls", R.drawable.barbell_incline));
        muscle.add(new Exercises_GetterSetter("Preacher Curls", R.drawable.preacher_curl2));
        muscle.add(new Exercises_GetterSetter("Concentration Curls", R.drawable.concetrated_curl2));
        muscle.add(new Exercises_GetterSetter("Dumbbell Biceps Curls", R.drawable.dumbbell_biceps_curl));
        muscle.add(new Exercises_GetterSetter("Cable Curls", R.drawable.incline_dumbbell));
        muscle.add(new Exercises_GetterSetter("Hammer Curls", R.drawable.hammer_curl2));
        muscle.add(new Exercises_GetterSetter("Seated Inclined Biceps Curls", R.drawable.inclined_curls2));
        muscle.add(new Exercises_GetterSetter("Close Grip Chin Ups", R.drawable.grip_chin_ups));

        Exercises_Adapter adapter = new Exercises_Adapter(this, muscle);
        list.setOnItemClickListener(onItemClick_List);
        list.setAdapter(adapter);




    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener(){
        public void onItemClick(AdapterView arg0, View view, int position, long index) {

            showToast("Exercise :" + muscle.get(position).getMuscle_group());
            how_to_do(position);
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void how_to_do(int item){
        if (item == 0) {
            title = "Seated Alternate Dumbbell Curl";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 1) {
            title = "Barbell Curls";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "Preacher Curls";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Concentration Curls";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 4) {
            title = "Dumbbell Biceps Curls";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
            title = "Cable Curls";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 6) {
            title = "Hammer Curls";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 7) {
            title = "Seated Inclined Biceps Curls";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 8) {
            title = "Close Grip Chin Ups";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }

    }

}

