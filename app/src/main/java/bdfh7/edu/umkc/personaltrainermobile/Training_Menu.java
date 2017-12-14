package bdfh7.edu.umkc.personaltrainermobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by brenodm on 4/13/15.
 */
public class Training_Menu extends Activity {

    private ImageButton new_training;
    private ImageButton load_training;
    private ImageButton find_plan;

    public String training_menu_option;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training_menu);

        new_training = (ImageButton) findViewById(R.id.new_plan_button);
        load_training = (ImageButton) findViewById(R.id.load_plan_button);
        find_plan = (ImageButton) findViewById(R.id.find_plan_button);


        new_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                training_menu_option = "new_plan";
                Intent myIntent = new Intent(v.getContext(), Select_Gender.class);
                myIntent.putExtra("MenuOption", training_menu_option);
                startActivity(myIntent);
            }
        });

        load_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Load_Trainings.class);
                startActivity(myIntent);
            }
        });

        find_plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                training_menu_option = "find_plan";
                Intent myIntent = new Intent(v.getContext(), Select_Gender.class);
                myIntent.putExtra("MenuOption", training_menu_option);
                startActivity(myIntent);
            }
        });
    }
}
