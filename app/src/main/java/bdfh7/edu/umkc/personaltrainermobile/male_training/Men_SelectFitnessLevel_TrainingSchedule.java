package bdfh7.edu.umkc.personaltrainermobile.male_training;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;

import bdfh7.edu.umkc.personaltrainermobile.R;
import bdfh7.edu.umkc.personaltrainermobile.male_training.male_advanced_level.Men_FatLoss_Training_AdvancedLevel_Weeks;
import bdfh7.edu.umkc.personaltrainermobile.male_training.male_advanced_level.Men_MuscleGrowth_Training_AdvancedLevel_Weeks;
import bdfh7.edu.umkc.personaltrainermobile.male_training.male_beginner_level.Men_FatLoss_Training_BeginnerLevel_Weeks;
import bdfh7.edu.umkc.personaltrainermobile.male_training.male_beginner_level.Men_MuscleGrowth_Training_BeginnerLevel_Weeks;
import bdfh7.edu.umkc.personaltrainermobile.male_training.male_intermediate_level.Men_FatLoss_Training_IntermediateLevel_Weeks;
import bdfh7.edu.umkc.personaltrainermobile.male_training.male_intermediate_level.Men_MuscleGrowth_Training_IntermediateLevel_Weeks;


public class Men_SelectFitnessLevel_TrainingSchedule extends ActionBarActivity {

    private ImageButton beginner;
    private ImageButton intermediate;
    private ImageButton advanced;
    String goal;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_level_training);

        beginner = (ImageButton) findViewById(R.id.beginner_training_button);
        intermediate = (ImageButton) findViewById(R.id.intermediate_training_button);
        advanced = (ImageButton) findViewById(R.id.advanced_training_button);

        goal = this.getIntent().getStringExtra("Warning");

        if (goal.equals("fat")) {
            beginner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Men_FatLoss_Training_BeginnerLevel_Weeks.class);
                    startActivity(myIntent);
                }
            });

            intermediate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Men_FatLoss_Training_IntermediateLevel_Weeks.class);
                    startActivity(myIntent);
                }
            });

            advanced.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Men_FatLoss_Training_AdvancedLevel_Weeks.class);
                    startActivity(myIntent);
                }
            });
        } else if (goal.equals("muscle")) {
            beginner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Men_MuscleGrowth_Training_BeginnerLevel_Weeks.class);
                    startActivity(myIntent);
                }
            });

            intermediate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Men_MuscleGrowth_Training_IntermediateLevel_Weeks.class);
                    startActivity(myIntent);
                }
            });

            advanced.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Men_MuscleGrowth_Training_AdvancedLevel_Weeks.class);
                    startActivity(myIntent);
                }
            });
        }
    }


}
