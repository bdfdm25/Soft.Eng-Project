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
public class Exercises_Groups_Abd extends ActionBarActivity {

    private List<Exercises_GetterSetter> muscle = null;
    final Context context = this;
    private String title;
    private String description;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_exercises);

        ListView list = (ListView)findViewById(R.id.exercises_list);

        muscle = new ArrayList<Exercises_GetterSetter>();
        muscle.add(new Exercises_GetterSetter("Air Bike", R.drawable.barbell_bench));
        muscle.add(new Exercises_GetterSetter("Barbell Rollout", R.drawable.barbell_incline));
        muscle.add(new Exercises_GetterSetter("Cable Crunch", R.drawable.dumbbell_bench));
        muscle.add(new Exercises_GetterSetter("Decline Crunch", R.drawable.dumbell_incline));
        muscle.add(new Exercises_GetterSetter("Dumbbell Side", R.drawable.decline_bench));
        muscle.add(new Exercises_GetterSetter("Leg Raises", R.drawable.incline_dumbbell));

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
            title = "Air Bike";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 1) {
            title = "Barbell Rollout";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "Cable Crunch";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Decline Crunch";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 4) {
            title = "Dumbbell Side";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
            title = "Leg Raises";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }

    }


}

