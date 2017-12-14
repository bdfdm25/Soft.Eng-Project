package bdfh7.edu.umkc.personaltrainermobile.male_training.male_beginner_level;

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
 * Created by brenodm on 3/25/15.
 */
public class Men_FatLoss_Training_BeginnerLevel_Days extends Activity {

    private List<Training_GetterSetter> beginner_level = null;
    private String title;
    private String description;

    final Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_training);

        ListView list = (ListView) findViewById(R.id.training_list);


        beginner_level = new ArrayList<Training_GetterSetter>();
        beginner_level.add(new Training_GetterSetter("Day 1", "Back & Biceps", R.drawable.weeks_icon1));
        beginner_level.add(new Training_GetterSetter("Day 2", "Chest, Shoulders & Triceps", R.drawable.weeks_icon2));
        beginner_level.add(new Training_GetterSetter("Day 3", "Cardio", R.drawable.weeks_icon3));
        beginner_level.add(new Training_GetterSetter("Day 4", "Legs & Abs", R.drawable.weeks_icon4));
        beginner_level.add(new Training_GetterSetter("Day 5", "Back & Biceps", R.drawable.weeks_icon5));
        beginner_level.add(new Training_GetterSetter("Day 6", "Cardio", R.drawable.weeks_icon6));
        beginner_level.add(new Training_GetterSetter("Day 7", "Chest, Shoulders & Triceps", R.drawable.weeks_icon7));


        Training_Adapter newAdapter = new Training_Adapter(this, beginner_level);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(newAdapter);

    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {

            showToast("Today's Group: " + beginner_level.get(position).getGroup());
            exercises(position);
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void exercises(int item) {
        if (item == 0) {
            title = "Back & Biceps";
            description = "60-90 sec rest between the series and 1-2 Minutes between each exercise. \n\n" +
                    "- Bent Over Two-Dumbbell Row: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Underhand Pullups: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Standing Barbell Curl: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Dumbbell Alternate Bicep Curl: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);


            builder.show();
        } else if (item == 1) {
            title = "Chest, Shoulders & Triceps";
            description = "60-90 sec rest between the series and 1-2 Minutes between each exercise. \n\n" +
                    "- Bench Press: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Incline Flyes: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Seated Dumbbell Press: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Dumbbell Side Laterals: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Triceps Extension: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Bench Dips: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "Cardio";
            description = "\n26 to 30 minutes of cardio exercises.\n " +
                    "\nTry Elliptical Trainer or Exercise Bike.\n ";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Legs & Abs";
            description = "60-90 sec rest between the series and 1-2 Minutes between each exercise. \n\n" +
                    "- Squats: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Dumbbell Lunges: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Leg Curls: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Stiff-Legged Barbell Deadlift: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Seated Calf Raise: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Standing Calf Raises: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Crunches: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Lying Leg Raises: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 4) {
            title = "Back & Biceps";
            description = "60-90 sec rest between the series and 1-2 Minutes between each exercise. \n\n" +
                    "- Underhand Pullups: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Bent Over Two-Dumbbell Row: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Hyperextensions (Back Extensions): \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Concentration Curls: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Preacher Curls: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
            title = "Cardio";
            description = "\n26 to 30 minutes of cardio exercises.\n " +
                    "\nTry Elliptical Trainer or Exercise Bike.\n ";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 6) {
            title = "Chest, Shoulders & Triceps";
            description = "60-90 sec rest between the series and 1-2 Minutes between each exercise. \n\n" +
                    "- Incline Barbell Bench Press: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Pec Dec: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Side Lateral Raise: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Seated Dumbbell Press: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Triceps Pushdown: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Lying Barbell Triceps Extension: \n" +
                    "  -> 2 sets of 10-12 reps, 1 set to failure.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }
    }

}
