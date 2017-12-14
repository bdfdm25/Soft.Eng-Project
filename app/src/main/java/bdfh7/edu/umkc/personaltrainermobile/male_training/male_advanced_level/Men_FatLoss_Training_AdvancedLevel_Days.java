package bdfh7.edu.umkc.personaltrainermobile.male_training.male_advanced_level;

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
public class Men_FatLoss_Training_AdvancedLevel_Days extends Activity {

    private List<Training_GetterSetter> advanced_level = null;
    private String title;
    private String description;

    final Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_training);

        ListView list = (ListView) findViewById(R.id.training_list);


        advanced_level = new ArrayList<Training_GetterSetter>();
        advanced_level.add(new Training_GetterSetter("Day 1", "Legs", R.drawable.weeks_icon1));
        advanced_level.add(new Training_GetterSetter("Day 2", "Chest & Triceps", R.drawable.weeks_icon2));
        advanced_level.add(new Training_GetterSetter("Day 3", "Rest Day", R.drawable.weeks_icon3));
        advanced_level.add(new Training_GetterSetter("Day 4", "Back & Biceps", R.drawable.weeks_icon4));
        advanced_level.add(new Training_GetterSetter("Day 5", "Shoulders, Calves & Abs", R.drawable.weeks_icon5));
        advanced_level.add(new Training_GetterSetter("Day 6", "Rest Day", R.drawable.weeks_icon6));
        advanced_level.add(new Training_GetterSetter("Day 7", "Legs", R.drawable.weeks_icon7));


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
            title = "Legs";
            description = "20 minutes of cardio before starts the training. \n\n" +
                    "- Leg Press: \n" +
                    "  -> 3 sets to failure in 12-20 reps.\n\n" +
                    "- Hamstring Curl: \n" +
                    "  -> 3 sets to failure in 12-15 reps.\n\n" +
                    "- Lying Hamstring Curl: \n" +
                    "  -> 3 sets to failure in 12-15 reps.\n\n" +
                    "- Leg Extensions: \n" +
                    "  -> 2 sets to failure in 15-20 reps.\n\n" +
                    "- Hack Squat: \n" +
                    "  -> 3 sets to failure in 20-30 reps.\n\n" +
                    "20 minutes of cardio after finishes the training.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);


            builder.show();
        } else if (item == 1) {
            title = "Chest & Triceps";
            description = "20 minutes of cardio before starts the training. \n\n" +
                    "- Flat Dumbbell Press: \n" +
                    "  -> 3 sets to failure in 6-10 reps\n\n" +
                    "- Incline Flyes: \n" +
                    "  -> 2 sets to failure in 8-15 reps.\n\n" +
                    "- Straight-Arm Pullover: \n" +
                    "  -> 2 sets to failure in 10-12 reps.\n\n" +
                    "- Rope Extension: \n" +
                    "  -> 3 sets to failure in 10-12 reps.\n\n" +
                    "- Lying Cable Extensions: \n" +
                    "  -> 3 sets to failure in 10-12 reps.\n\n" +
                    "- Overhead Dumbbell Extension: \n" +
                    "  -> 3 sets to failure in 10-12 reps.\n\n" +
                    "20 minutes of cardio after finishes the training.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "Rest Day";
            description = "I'm sure you've read this advice before, but it bears repeating: " +
                    "It's important to drink plenty of water when you're trying to lose weight. " +
                    "In fact, you should drink two cups of cold water before every meal to " +
                    "maximize fat loss.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Back & Biceps";
            description = "20 minutes of cardio before starts the training. \n\n" +
                    "- Reverse-Grip Pulldowns: \n" +
                    "  -> 3 sets of 8-10 reps.\n\n" +
                    "- Bent Over Barbell Row: \n" +
                    "  -> 3 sets of 10-12 reps.\n\n" +
                    "- Hyperextensions (Back Extensions): \n" +
                    "  -> 2 sets of 10-12 reps.\n\n" +
                    "- Straight-Arm Pulldown: \n" +
                    "  -> 7 sets of 10-15 reps.\n" +
                    "(21s Technique: 7 reps of top half of ROM, 7 reps " +
                    "of bottom half ROM, and 7 reps full ROM)\n\n" +
                    "- Concentration Curls: \n" +
                    "  -> 3 sets of 12-15 reps, per arm.\n\n" +
                    "- Dumbbell Alternate Bicep Curl: \n" +
                    "  -> 3 sets of 12-15 reps, per arm.\n\n" +
                    "- Cable Curls: \n" +
                    "  -> 3 sets of 15-20 reps, per arm.\n\n" +
                    "20 minutes of cardio after finishes the training.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 4) {
            title = "Shoulders, Calves & Abs";
            description = "20 minutes of cardio before starts the training. \n\n" +
                    "- Seated Barbell Military Press: \n" +
                    "  -> 3 sets of 6-8 reps.\n\n" +
                    "- Side Lateral Raise: \n" +
                    "  -> 3 sets of 12-15 reps.\n\n" +
                    "- Upright Barbell Row: \n" +
                    "  -> 3 sets of 7 reps.\n\n" +
                    "- Lying Rear Delt Raise: \n" +
                    "  -> 7 sets of 12-15 reps.\n" +
                    "(21s Technique: 7 reps of top half of ROM, 7 reps " +
                    "of bottom half ROM, and 7 reps full ROM)\n\n" +
                    "- Weighted Sit-Up: \n" +
                    "  -> 3 sets of 15-20 reps.\n\n" +
                    "- Seated Calf Raise: \n" +
                    "  -> 3 sets of 20 reps.\n\n" +
                    "- Standing Calf Raises: \n" +
                    "  -> 3 sets of 18-20 reps, 1 foot at a time.\n\n" +
                    "20 minutes of cardio after finishes the training.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
            title = "Rest Day";
            description = "I'm sure you've read this advice before, but it bears repeating: " +
                    "It's important to drink plenty of water when you're trying to lose weight. " +
                    "In fact, you should drink two cups of cold water before every meal to " +
                    "maximize fat loss.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 6) {
            title = "Legs";
            description = "20 minutes of cardio before starts the training. \n\n" +
                    "- Leg Extensions: \n" +
                    "  -> 2 sets of 30 reps.\n\n" +
                    "- Hamstring Curls: \n" +
                    "  -> 2 sets of 20 reps.\n\n" +
                    "- Walking Lunges: \n" +
                    "  -> 3 sets of 40 steps.\n\n" +
                    "- Standing Leg Curl: \n" +
                    "  -> 3 sets of 15-20 reps.\n\n " +
                    "- Leg Press: \n" +
                    "  -> 3 sets of 50 reps\n\n" +
                    "- Leg Extensions: \n" +
                    "  -> 1 sets of 30 reps.\n\n" +
                    "- Hamstring Curls: \n" +
                    "  -> 1 sets of 20 reps.\n\n" +
                    "20 minutes of cardio after finishes the training.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }
    }
}
