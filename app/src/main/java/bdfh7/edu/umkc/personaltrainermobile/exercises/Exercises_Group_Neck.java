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
public class Exercises_Group_Neck extends ActionBarActivity {

    private List<Exercises_GetterSetter> muscle = null;
    final Context context = this;
    private String title;
    private String description;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_exercises);

        ListView list = (ListView)findViewById(R.id.exercises_list);

        muscle = new ArrayList<Exercises_GetterSetter>();
        muscle.add(new Exercises_GetterSetter("Barbell Bench Press", R.drawable.barbell_bench));
        muscle.add(new Exercises_GetterSetter("Barbell Incline Press", R.drawable.barbell_incline));
        muscle.add(new Exercises_GetterSetter("Dumbbell Bench Press", R.drawable.dumbbell_bench));
        muscle.add(new Exercises_GetterSetter("Dumbbell Incline Press", R.drawable.dumbell_incline));
        muscle.add(new Exercises_GetterSetter("Decline Barbell Bench Press", R.drawable.decline_bench));
        muscle.add(new Exercises_GetterSetter("Incline Dumbbell Fly", R.drawable.incline_dumbbell));
        muscle.add(new Exercises_GetterSetter("Cable Crossovers", R.drawable.cross_over));
        muscle.add(new Exercises_GetterSetter("Barbell Pullover", R.drawable.barbell_pullover));
        muscle.add(new Exercises_GetterSetter("Butterfly", R.drawable.butterfly));

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
            title = "Barbell Bench Press";
            description = "Without bouncing the weight off your chest, drive the barbell up over the" +
                    "middle of your chest until your arms are straight and your elbows are locked." +
                    "Pause briefly, then lower slowly back to the starting position.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 1) {
            title = "Barbell Incline Press";
            description = "Slowly lower the bar until you make contact with the upper chest area." +
                    "Pause briefly, then drive the weight straight up over your chest until " +
                    "your elbows are locked.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "Dumbbell Bench Press";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Dumbbell Incline Press";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 4) {
            title = "Decline Barbell Bench Press";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
            title = "Incline Dumbbell Fly";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 6) {
            title = "Cable Crossovers";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }
        else if (item == 7) {
            title = "Barbell Pullover";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }
        else if (item == 8) {
            title = "Butterfly";
            description = "Some text about this exercise";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }

    }

}
