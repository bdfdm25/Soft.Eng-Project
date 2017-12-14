package bdfh7.edu.umkc.personaltrainermobile.male_training.male_intermediate_level;

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
 * Created by brenodm on 3/26/15.
 */
public class Men_MuscleGrowth_Training_IntermediateLevel_Days extends Activity {

    private List<Training_GetterSetter> intermediate_level = null;
    private String title;
    private String description;

    final Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_training);

        ListView list = (ListView) findViewById(R.id.training_list);


        intermediate_level = new ArrayList<Training_GetterSetter>();
        intermediate_level.add(new Training_GetterSetter("Day 1", "Chest, Triceps & Calves", R.drawable.weeks_icon1));
        intermediate_level.add(new Training_GetterSetter("Day 2", "Back, Biceps & Abs", R.drawable.weeks_icon2));
        intermediate_level.add(new Training_GetterSetter("Day 3", "Rest Day", R.drawable.weeks_icon3));
        intermediate_level.add(new Training_GetterSetter("Day 4", "Shoulders, Triceps & Calves", R.drawable.weeks_icon4));
        intermediate_level.add(new Training_GetterSetter("Day 5", "Legs & Abs", R.drawable.weeks_icon5));
        intermediate_level.add(new Training_GetterSetter("Day 6", "Rest Day", R.drawable.weeks_icon6));
        intermediate_level.add(new Training_GetterSetter("Day 7", "Rest Day", R.drawable.weeks_icon7));


        Training_Adapter newAdapter = new Training_Adapter(this, intermediate_level);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(newAdapter);

    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {

            showToast("Today's Group: " + intermediate_level.get(position).getGroup());
            exercises(position);
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void exercises(int item) {
        if (item == 0) {
            title = "Chest, Triceps & Calves";
            description = "Perform 1-2 warm-up sets of 12-15 reps on the first exercise for all body parts, " +
                    "except abs and calves. 45 sec rest between the series. \n\n" +
                    "- Barbell Bench Press - Medium Grip: \n" +
                    "  -> 4 sets of 12-15 reps.\n\n" +
                    "- Barbell Incline Bench Press - Medium Grip: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Incline Dumbbell Flyes: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Cable Crossover: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Triceps Pressdown: \n" +
                    "  -> 4 sets of 12-15 reps.\n\n" +
                    "- Lying Triceps Extension: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Cable Overhead Triceps Extension: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Standing Calf Raises: \n" +
                    "  -> 3 sets of 25-30 reps.\n\n" +
                    "- Seated Calf Raise: \n" +
                    "  -> 3 sets of 25-30 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);


            builder.show();
        } else if (item == 1) {
            title = "Back, Biceps & Abs";
            description = "Perform 1-2 warm-up sets of 12-15 reps on the first exercise for all body parts, " +
                    "except abs and calves. 45 sec rest between the series. \n\n" +
                    "- One-Arm Dumbbell Row: \n" +
                    "  -> 4 sets of 12-15 reps.\n\n" +
                    "- Wide-Grip Pulldown: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Standing Pulldown: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Straight-Arm Pulldown: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Barbell Curl: \n" +
                    "  -> 4 sets of 12-15 reps.\n\n" +
                    "- Incline Dumbbell Curl: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- One-Arm High Cable Curls: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Bent-Knee Hip Raise (on a bench): \n" +
                    "  -> 3 sets of 20-30 reps.\n\n" +
                    "- Crunches : \n" +
                    "  -> 3 sets of 20-30 reps.\n\n" +
                    "- Oblique Crunches: \n" +
                    "  -> 3 sets of 20-30 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "Rest Day";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Shoulders, Triceps & Calves";
            description = "Perform 1-2 warm-up sets of 12-15 reps on the first exercise for all body parts, " +
                    "except abs and calves. 45 sec rest between the series. \n\n" +
                    "- Dumbbell Shoulder Press: \n" +
                    "  -> 4 sets of 12-15 reps.\n\n" +
                    "- Side Lateral Raise: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- One-Arm Front Cable Raise: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- High Cable Rear Delt Flyes: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Dumbbell Shrug: \n" +
                    "  -> 4 sets of 12-15 reps.\n\n" +
                    "- Seated Calf Raise: \n" +
                    "  -> 4 sets of 25-30 reps.\n\n" +
                    "- Leg Press Calf Raise: \n" +
                    "  -> 4 sets of 25-30 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 4) {
            title = "Legs & Abs";
            description = "Perform 1-2 warm-up sets of 12-15 reps on the first exercise for all body parts, " +
                    "except abs and calves. 45 sec rest between the series. \n\n" +
                    "- Barbell Squat: \n" +
                    "  -> 4 sets of 12-15 reps.\n\n" +
                    "- One-Leg Leg Press: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Leg Extensions: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Romanian Deadlift: \n" +
                    "  -> 4 sets of 12-15 reps.\n\n" +
                    "- Lying Leg Curls: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Bent-Knee Hip Raise (on a bench): \n" +
                    "  -> 3 sets of 20-30 reps.\n\n" +
                    "- Crunches: \n" +
                    "  -> 3 sets of 20-30 reps.\n\n" +
                    "- Plank: \n" +
                    "  -> 3 sets of 1 min reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
            title = "Rest Day";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 6) {
            title = "Rest Day";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }
    }
}
