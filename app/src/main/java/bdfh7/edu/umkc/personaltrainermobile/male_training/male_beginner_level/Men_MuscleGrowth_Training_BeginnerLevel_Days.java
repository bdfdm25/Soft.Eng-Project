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
 * Created by brenodm on 3/26/15.
 */
public class Men_MuscleGrowth_Training_BeginnerLevel_Days extends Activity {

    private List<Training_GetterSetter> beginner_level = null;
    private String title;
    private String description;

    final Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_training);

        ListView list = (ListView) findViewById(R.id.training_list);


        beginner_level = new ArrayList<Training_GetterSetter>();
        beginner_level.add(new Training_GetterSetter("Day 1", "Chest, Triceps & Abs", R.drawable.weeks_icon1));
        beginner_level.add(new Training_GetterSetter("Day 2", "Back, Biceps & Calves", R.drawable.weeks_icon2));
        beginner_level.add(new Training_GetterSetter("Day 3", "Cardio Day", R.drawable.weeks_icon3));
        beginner_level.add(new Training_GetterSetter("Day 4", "Legs & Abs", R.drawable.weeks_icon4));
        beginner_level.add(new Training_GetterSetter("Day 5", "Shoulders, Traps & Calves", R.drawable.weeks_icon5));
        beginner_level.add(new Training_GetterSetter("Day 6", "Rest Day", R.drawable.weeks_icon6));
        beginner_level.add(new Training_GetterSetter("Day 7", "Rest Day", R.drawable.weeks_icon7));


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
            title = "Chest, Triceps & Abs";
            description = "5 min of cardio before starts the training and 45 sec rest between the series. \n\n" +
                    "- Incline Dumbbell Press:\n" +
                    "  -> 3 sets of 8-12 reps, 1 set to failure.\n\n" +
                    "- Incline Dumbbell Flyes: \n" +
                    "  -> 3 sets of 8-12 reps, 1 set to failure.\n\n" +
                    "- Dumbbell Bench Press: \n" +
                    "  -> 4 sets of 6-10 reps, 1 set to failure.\n\n" +
                    "- Skull Crushers:\n" +
                    "  -> 3 sets of 12-16 reps, 1 set to failure.\n\n" +
                    "- Triceps Extension: \n" +
                    "  -> 3 sets of 12-16 reps, 1 set to failure.\n\n" +
                    "- Overhead Dumbbell Triceps Extension:  \n" +
                    "  -> 3 sets of 12-16 reps, 1 set to failure.\n\n" +
                    "- Hanging Knee Raise:  \n" +
                    "  -> 1 set to failure.\n\n" +
                    "- Swiss Ball Crunch: \n" +
                    "  -> 1 set to failure.\n\n" +
                    "- Decline Reverse Crunch: \n" +
                    "  -> 1 set to failure.\n\n" +
                    "- Broom Stick Twist (Shown with Barbell): \n" +
                    "  -> 25 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);


            builder.show();
        } else if (item == 1) {
            title = "Back, Biceps & Calves";
            description = "5 min of cardio before starts the training and 45 sec rest between the series. \n\n" +
                    "- Wide-Grip Pullups:\n" +
                    "  -> 4 sets of 10 reps.\n\n" +
                    "- Bent T-Bar Row: \n" +
                    "  -> 3 sets of 10-15 reps, 1 set to failure.\n\n" +
                    "- Close-Grip Front Lat Pulldown: \n" +
                    "  -> 3 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- One-Arm Dumbbell Row:\n" +
                    "  -> 3 sets of 8-12 reps, 1 set to failure.\n\n" +
                    "- Straight-Arm Pulldown (With rope): \n" +
                    "  -> 5 sets of 15 reps.\n\n" +
                    "- EZ-Bar Curl:  \n" +
                    "  -> 3 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Incline Dumbbell Curl:  \n" +
                    "  -> 3 sets of 10-15 reps, 1 set to failure.\n\n" +
                    "- Standing Calf Raises: \n" +
                    "  -> 4 sets of 10 reps.\n\n" +
                    "- Donkey Calf Raises: \n" +
                    "  -> 4 sets of 10 reps.\n\n" +
                    "- Seated Calf Raise: \n" +
                    "  -> 4 sets of 10 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "Cardio Day";
            description = "";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Legs & Abs";
            description = "30 reps is a warm-up set and 45 sec rest between the series. \n\n" +
                    "- Barbell Squat: \n" +
                    "  -> 5 sets of 8-12 reps.\n\n" +
                    "- Stiff-Legged Barbell Deadlift: \n" +
                    "  -> 5 sets of 8-12 reps.\n\n" +
                    "- Barbell Lunge: \n" +
                    "  -> 5 sets of 8-12 reps.\n\n" +
                    "- Leg Extensions: \n" +
                    "  -> 5 sets of 8-12 reps.\n\n" +
                    "- Seated Leg Curl: \n" +
                    "  -> 5 sets of 8-12 reps.\n\n" +
                    "- Standing Calf Raises: \n" +
                    "  -> 5 sets of 8-12 reps.\n\n" +
                    "- Seated Calf Raise: \n" +
                    "  -> 5 sets of 8-12 reps.\n\n" +
                    "- Hanging Knee Raise:  \n" +
                    "  -> 1 set to failure.\n\n" +
                    "- Swiss Ball Crunch: \n" +
                    "  -> 1 set to failure.\n\n" +
                    "- Decline Reverse Crunch: \n" +
                    "  -> 1 set to failure.\n\n" +
                    "- Kneeling Cable Crunch: \n" +
                    "  -> 4 sets of 25 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 4) {
            title = "Shoulders, Traps & Calves";
            description = "5 min of cardio before starts the training and 45 sec rest between the series. \n\n" +
                    "- Dumbbell Shoulder Press:\n" +
                    "  -> 3 sets of 12-16 reps.\n\n" +
                    "- Side Lateral Raise: \n" +
                    "  -> 3 sets of 10-12 reps, 1 set to failure.\n\n" +
                    "- Reverse Pec Deck Flyes: \n" +
                    "  -> 5 sets of 10-14 reps.\n\n" +
                    "- Front Raise:\n" +
                    "  -> 3 sets of 10-14 reps.\n\n" +
                    "- Upright Barbell Row: \n" +
                    "  -> 3 sets of 10-14 reps.\n\n" +
                    "- Barbell Shrug:  \n" +
                    "  -> 4 sets of 8-12 reps.\n\n" +
                    "- Standing Calf Raises: \n" +
                    "  -> 4 sets of 10 reps.\n\n" +
                    "- Donkey Calf Raises: \n" +
                    "  -> 4 sets of 10 reps.\n\n" +
                    "- Seated Calf Raise: \n" +
                    "  -> 4 sets of 10 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
            title = "Cardio Day";
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
