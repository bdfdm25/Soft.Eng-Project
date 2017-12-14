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
 * Created by brenodm on 3/25/15.
 */
public class Men_FatLoss_Training_IntermediateLevel_Days extends Activity {
    private List<Training_GetterSetter> intermediate_level = null;
    private String title;
    private String description;

    final Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_training);

        ListView list = (ListView) findViewById(R.id.training_list);


        intermediate_level = new ArrayList<Training_GetterSetter>();
        intermediate_level.add(new Training_GetterSetter("Day 1", "Chest, Triceps & Abs", R.drawable.weeks_icon1));
        intermediate_level.add(new Training_GetterSetter("Day 2", "Shoulders, Legs & Calves", R.drawable.weeks_icon2));
        intermediate_level.add(new Training_GetterSetter("Day 3", "Back, Traps & Biceps", R.drawable.weeks_icon3));
        intermediate_level.add(new Training_GetterSetter("Day 4", "Chest, Triceps & Abs", R.drawable.weeks_icon4));
        intermediate_level.add(new Training_GetterSetter("Day 5", "Shoulders, Legs & Calves", R.drawable.weeks_icon5));
        intermediate_level.add(new Training_GetterSetter("Day 6", "Back, Traps & Biceps", R.drawable.weeks_icon6));
        intermediate_level.add(new Training_GetterSetter("Day 7", "Rest", R.drawable.weeks_icon7));


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
            title = "Chest, Triceps & Abs";
            description = "\nStep-up with Knee Raise. 2-3 minutes of cardio warm-up.\n\n" +
                    "- Barbell Bench Press - Medium Grip: \n" +
                    "  -> 4 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Incline Dumbbell Press: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Decline Smith Press: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Dips: \n" +
                    "  -> 4 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Close-Grip Barbell Bench Press: \n" +
                    "  -> 4 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Cable Crunch: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Smith Machine Hip Thrust: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);


            builder.show();
        } else if (item == 1) {
            title = "Shoulders, Legs & Calves";
            description = "\nStep-up with Knee Raise. 2-3 minutes of cardio warm-up.\n\n" +
                    "- Barbell Shoulder Press: \n" +
                    "  -> 4 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Standing Alternating Dumbbell Press: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Smith Machine One-Arm Upright Row: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Barbell Squat: \n" +
                    "  -> 4 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Barbell Deadlift: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Walking Lunge: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Standing Calf Raises: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Seated Calf Raise: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "Back, Traps & Biceps";
            description = "\nStep-up with Knee Raise. 2-3 minutes of cardio warm-up.\n\n" +
                    "- Bent Over Barbell Row: \n" +
                    "  -> 4 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Bent Over Dumbbell Row: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Seated Cable Rows: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Barbell Shrug: \n" +
                    "  -> 4 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Barbell Curl: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Barbell or EZ-Bar Preacher Curl: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Reverse Barbell Curl: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Seated Palm-Up Barbell Wrist Curl: \n" +
                    "  -> 3 sets of 9-11 reps. 1 minute of cardio wam-up.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Chest, Triceps & Abs";
            description = "\nStep-up with Knee Raise. 2-3 minutes of cardio warm-up.\n\n" +
                    "- Incline Dumbbell Flyes: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Dumbbell Flyes: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Cable Crossover: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Triceps Pushdown: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Standing Dumbbell Triceps Extension: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Cable Lying Triceps Extension: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Crunches: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- One-Arm High-Pulley Cable Side Bends: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 4) {
            title = "Shoulders, Legs & Calves";
            description = "\nStep-up with Knee Raise. 2-3 minutes of cardio warm-up.\n\n" +
                    "- Side Lateral Raise: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Standing Front Barbell Raise Over Head: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Seated Bent-Over Rear Delt Raise: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Leg Extensions: \n" +
                    "  -> 4 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Seated Leg Curl: \n" +
                    "  -> 4 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Seated Calf Raise: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Leg Press Calf Raise: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
            title = "Back, Traps & Biceps";
            description = "\nStep-up with Knee Raise. 2-3 minutes of cardio warm-up.\n\n" +
                    "- Wide-Grip Lat Pulldown: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Underhand Cable Pulldowns: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Straight-Arm Pulldown: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Smith Machine Behind the Back Shrug: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Incline Dumbbell Curl: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- High Cable Curls: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Rope Cable Curl: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n\n" +
                    "- Seated Dumbbell Palms-Down Wrist Curl: \n" +
                    "  -> 3 sets of 12-15 reps. 1 minute of cardio wam-up.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 6) {
            title = "Rest Day";
            description = "I'm sure you've read this advice before, but it bears repeating: " +
                    "It's important to drink plenty of water when you're trying to lose weight. " +
                    "In fact, you should drink two cups of cold water before every meal to " +
                    "maximize fat loss.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }
    }

}
