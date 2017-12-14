package bdfh7.edu.umkc.personaltrainermobile.female_supplements;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import bdfh7.edu.umkc.personaltrainermobile.R;
import bdfh7.edu.umkc.personaltrainermobile.female_supplements.female_advanced_stack.Women_FatLoss_Supplements_AdvancedStack;
import bdfh7.edu.umkc.personaltrainermobile.female_supplements.female_advanced_stack.Women_MuscleGrowth_Supplements_AdvancedStack;
import bdfh7.edu.umkc.personaltrainermobile.female_supplements.female_fundamental_stack.Women_FatLoss_Supplements_FundamentalStack;
import bdfh7.edu.umkc.personaltrainermobile.female_supplements.female_fundamental_stack.Women_MuscleGrowth_Supplements_FundamentalStack;
import bdfh7.edu.umkc.personaltrainermobile.female_supplements.female_progressive_stack.Women_FatLoss_Supplements_ProgressiveStack;
import bdfh7.edu.umkc.personaltrainermobile.female_supplements.female_progressive_stack.Women_MuscleGrowth_Supplements_ProgressiveStack;

/**
 * Created by brenodm on 3/5/15.
 */
public class Women_Supplements_Stacks extends ActionBarActivity {


    private ImageButton fundamental;
    private ImageButton progressive;
    private ImageButton advanced;
    String goal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_supplement_stacks);

        fundamental = (ImageButton) findViewById(R.id.fundamental_button);
        progressive = (ImageButton) findViewById(R.id.progressive_button);
        advanced = (ImageButton) findViewById(R.id.advanced_button);


        goal = this.getIntent().getStringExtra("Warning");
        Log.e("Another Test", goal);


        if (goal.equals("fat")) {
            Log.e("Test", "FatLow Stack's");
            fundamental.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Women_FatLoss_Supplements_FundamentalStack.class);
                    startActivity(myIntent);
                }
            });

            progressive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Women_FatLoss_Supplements_ProgressiveStack.class);
                    startActivity(myIntent);
                }
            });

            advanced.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Women_FatLoss_Supplements_AdvancedStack.class);
                    startActivity(myIntent);
                }
            });
        } else if (goal.equals("muscle")) {
            Log.e("Test", "Muscle Stacks");
            fundamental.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Women_MuscleGrowth_Supplements_FundamentalStack.class);
                    startActivity(myIntent);
                }
            });

            progressive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Women_MuscleGrowth_Supplements_ProgressiveStack.class);
                    startActivity(myIntent);
                }
            });

            advanced.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), Women_MuscleGrowth_Supplements_AdvancedStack.class);
                    startActivity(myIntent);
                }
            });
        }
    }
}
