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
public class Men_MuscleGrowth_Training_AdvancedLevel_Days extends Activity {

    private List<Training_GetterSetter> advanced_level = null;
    private String title;
    private String description;

    final Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_training);

        ListView list = (ListView) findViewById(R.id.training_list);


        advanced_level = new ArrayList<Training_GetterSetter>();
        advanced_level.add(new Training_GetterSetter("Day 1", "Chest & Back", R.drawable.weeks_icon1));
        advanced_level.add(new Training_GetterSetter("Day 2", "Shoulders & Arms", R.drawable.weeks_icon2));
        advanced_level.add(new Training_GetterSetter("Day 3", "Legs", R.drawable.weeks_icon3));
        advanced_level.add(new Training_GetterSetter("Day 4", "Chest & Back", R.drawable.weeks_icon4));
        advanced_level.add(new Training_GetterSetter("Day 5", "Shoulders & Arms", R.drawable.weeks_icon5));
        advanced_level.add(new Training_GetterSetter("Day 6", "Legs", R.drawable.weeks_icon6));
        advanced_level.add(new Training_GetterSetter("Day 7", "Rest Day", R.drawable.weeks_icon7));


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
            title = "Chest & Back";
            description = "30 reps is a warm-up set and 45 sec rest between the series. \n\n" +
                    "- Flat Barbell Bench Press: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Barbell Incline Bench Press (Low Angle Incline): \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Dumbbell Flyes: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Dumbbell Pull-Over: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Chin-Up Chin-Up (Wide-grip): \n" +
                    "  -> 4 sets to failure.\n\n" +
                    "- Bent-Over Barbell Row: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Bent-Over Two-Dumbbell Row: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Hanging Leg Raise: \n" +
                    "  -> 5 sets of 25 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);


            builder.show();
        } else if (item == 1) {
            title = "Shoulders & Arms";
            description = "30 reps is a warm-up set and 45 sec rest between the series. \n\n" +
                    "- Clean and Press: \n" +
                    "  -> 5 sets of 5 reps.\n\n" +
                    "- Standing Dumbbell Press: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Front Dumbbell Raise: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Lateral Raise: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Upright Row: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Barbell Curl: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Incline Dumbbell Curl: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Concentration Curls: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Close-Grip Barbell Bench Press: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Barbell Skullcrushers: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Dumbbell One-Arm Triceps Extension: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Wrist Curls: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Reverse Wrist Curls: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Decline Sit-up: \n" +
                    "  -> 5 sets of 25 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "Legs";
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
                    "- Kneeling Cable Crunch: \n" +
                    "  -> 4 sets of 25 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Chest & Back";
            description = "30 reps is a warm-up set and 45 sec rest between the series. \n\n" +
                    "- Flat Barbell Bench Press: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Barbell Incline Bench Press (Low Angle Incline): \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Dumbbell Flyes: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Dumbbell Pull-Over: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Chin-Up Chin-Up (Wide-grip): \n" +
                    "  -> 4 sets to failure.\n\n" +
                    "- Bent-Over Barbell Row: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Bent-Over Two-Dumbbell Row: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Hanging Leg Raise: \n" +
                    "  -> 5 sets of 25 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 4) {
            title = "Shoulders & Arms";
            description = "30 reps is a warm-up set and 45 sec rest between the series. \n\n" +
                    "- Arnold Dumbbell Press: \n" +
                    "  -> 5 sets of 5 reps.\n\n" +
                    "- Push Press - Behind the Neck: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Front Dumbbell Raise: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Rear Delt Flye on Incline Bench: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Upright Row: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Barbell Curl: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Incline Dumbbell Curl: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Concentration Curls: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Close-Grip Barbell Bench Press: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Triceps Push-Down: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Dumbbell One-Arm Triceps Extension: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Wrist Curls: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Reverse Wrist Curls: \n" +
                    "  -> 5 sets of 30, 12, 10, 8, 6 reps.\n\n" +
                    "- Decline Sit-up: \n" +
                    "  -> 5 sets of 25 reps.\n";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
            title = "Legs";
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
                    "- Kneeling Cable Crunch: \n" +
                    "  -> 4 sets of 25 reps.\n";
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
