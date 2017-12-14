package bdfh7.edu.umkc.personaltrainermobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by brenodm on 3/4/15.
 */
public class Select_Gender extends ActionBarActivity {

    private ImageButton male;
    private ImageButton female;
    String option;
    String flag;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_gender);


        male = (ImageButton) findViewById(R.id.genderMale_button_sp);
        female = (ImageButton) findViewById(R.id.genderFemale_button_sp);

        option = this.getIntent().getStringExtra("MenuOption");

        if (option.equals("find_plan")) {
            Log.e("Option schedule ===>", option);
            male.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag = "male-schedule";
                    Intent myIntent = new Intent(v.getContext(), Select_Goal.class);
                    myIntent.putExtra("WichScreen", flag);
                    startActivity(myIntent);
                }
            });


            female.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag = "female-schedule";
                    Intent myIntent = new Intent(v.getContext(), Select_Goal.class);
                    myIntent.putExtra("WichScreen", flag);
                    startActivity(myIntent);
                }
            });
        } else if (option.equals("new_plan")) {
            Log.e("Option schedule ===>", option);
            male.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag = "male";
                    Intent myIntent = new Intent(v.getContext(), Insert_New_Training.class);
                    myIntent.putExtra("GenderFlag", flag);
                    startActivity(myIntent);
                }
            });


            female.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag = "female";
                    Intent myIntent = new Intent(v.getContext(), Insert_New_Training.class);
                    myIntent.putExtra("GenderFlag", flag);
                    startActivity(myIntent);
                }
            });
        } else if (option.equals("supplements")) {
            Log.e("Option supplements ===>", option);
            male.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag = "male-supplements";
                    Intent myIntent = new Intent(v.getContext(), Select_Goal.class);
                    myIntent.putExtra("WichScreen", flag);
                    startActivity(myIntent);
                }
            });


            female.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag = "female-supplements";
                    Intent myIntent = new Intent(v.getContext(), Select_Goal.class);
                    myIntent.putExtra("WichScreen", flag);
                    startActivity(myIntent);
                }
            });
        }
    }
}
