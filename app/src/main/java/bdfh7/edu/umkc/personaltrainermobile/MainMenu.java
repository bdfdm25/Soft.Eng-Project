package bdfh7.edu.umkc.personaltrainermobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import bdfh7.edu.umkc.personaltrainermobile.exercises.ExercisesActivity;


public class MainMenu extends ActionBarActivity {

    private ImageButton exercises;
    private ImageButton schedule;
    private ImageButton diet;
    private ImageButton settings;
    private ImageButton instructor;
    private ImageButton supplements;
    public String option;

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exercises = (ImageButton) findViewById(R.id.exercises_button);
        schedule = (ImageButton) findViewById(R.id.schedule_button);
        diet = (ImageButton) findViewById(R.id.diet_button);
        settings = (ImageButton) findViewById(R.id.settings_button);
        instructor = (ImageButton) findViewById(R.id.instructor_button);
        supplements = (ImageButton) findViewById(R.id.supplement_button);

        exercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), ExercisesActivity.class);
                startActivity(myIntent);
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Training_Menu.class);
                startActivity(myIntent);
            }
        });

        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), DietActivity.class);
                startActivity(myIntent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), SettingsActivity.class);
                startActivity(myIntent);
            }
        });

        instructor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), InstructorActivity.class);
                startActivity(myIntent);
            }
        });

        supplements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option = "supplements";
                Intent myIntent = new Intent(v.getContext(), Select_Gender.class);
                myIntent.putExtra("MenuOption", option);
                startActivity(myIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
