package bdfh7.edu.umkc.personaltrainermobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import bdfh7.edu.umkc.personaltrainermobile.female_supplements.Women_Supplements_Stacks;
import bdfh7.edu.umkc.personaltrainermobile.female_training.Women_SelectFitnessLevel_TrainingSchedule;
import bdfh7.edu.umkc.personaltrainermobile.male_supplements.Men_Supplements_Stacks;
import bdfh7.edu.umkc.personaltrainermobile.male_training.Men_SelectFitnessLevel_TrainingSchedule;

/**
 * Created by brenodm on 3/4/15.
 */
public class Select_Goal extends ActionBarActivity {

    private ImageButton fat_low;
    private ImageButton muscle;
    public String goal;
    String wichScreen;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_goal);

        fat_low = (ImageButton) findViewById(R.id.fat_low_button);
        muscle = (ImageButton) findViewById(R.id.muscle_button);

        wichScreen = this.getIntent().getStringExtra("WichScreen");

        if (wichScreen.equals("male-supplements") || wichScreen.equals("female-supplements")) {

            if (wichScreen.equals("male-supplements")) {
                Log.e("male-supplements ==>", wichScreen);
                fat_low.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goal = "fat";
                        Intent myIntent = new Intent(v.getContext(), Men_Supplements_Stacks.class);
                        myIntent.putExtra("Warning", goal);
                        startActivity(myIntent);
                    }
                });

                muscle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("Test", "Worked-Muscle");
                        goal = "muscle";
                        Intent myIntent = new Intent(v.getContext(), Men_Supplements_Stacks.class);
                        myIntent.putExtra("Warning", goal);
                        startActivity(myIntent);
                    }
                });
            } else if (wichScreen.equals("female-supplements")) {
                Log.e("female-supplements ==>", wichScreen);
                fat_low.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("Test", "Worked-Fat");
                        goal = "fat";
                        Intent myIntent = new Intent(v.getContext(), Women_Supplements_Stacks.class);
                        myIntent.putExtra("Warning", goal);
                        startActivity(myIntent);
                    }
                });

                muscle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("Test", "Worked-Muscle");
                        goal = "muscle";
                        Intent myIntent = new Intent(v.getContext(), Women_Supplements_Stacks.class);
                        myIntent.putExtra("Warning", goal);
                        startActivity(myIntent);
                    }
                });
            }
        } else if (wichScreen.equals("male-schedule") || wichScreen.equals("female-schedule")) {

            if (wichScreen.equals("male-schedule")) {
                Log.e("male-schedule ==>", wichScreen);
                fat_low.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ;
                        goal = "fat";
                        Intent myIntent = new Intent(v.getContext(), Men_SelectFitnessLevel_TrainingSchedule.class);
                        myIntent.putExtra("Warning", goal);
                        startActivity(myIntent);
                    }
                });

                muscle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        goal = "muscle";
                        Intent myIntent = new Intent(v.getContext(), Men_SelectFitnessLevel_TrainingSchedule.class);
                        myIntent.putExtra("Warning", goal);
                        startActivity(myIntent);
                    }
                });
            } else if (wichScreen.equals("female-schedule")) {
                Log.e("male-schedule ==>", wichScreen);
                fat_low.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("Test", "Worked-Fat");
                        goal = "fat";
                        Intent myIntent = new Intent(v.getContext(), Women_SelectFitnessLevel_TrainingSchedule.class);
                        myIntent.putExtra("Warning", goal);
                        startActivity(myIntent);
                    }
                });

                muscle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("Test", "Worked-Muscle");
                        goal = "muscle";
                        Intent myIntent = new Intent(v.getContext(), Women_SelectFitnessLevel_TrainingSchedule.class);
                        myIntent.putExtra("Warning", goal);
                        startActivity(myIntent);
                    }
                });
            }
        }
    }
}
