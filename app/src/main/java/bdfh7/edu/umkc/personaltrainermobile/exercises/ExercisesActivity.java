package bdfh7.edu.umkc.personaltrainermobile.exercises;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bdfh7.edu.umkc.personaltrainermobile.R;

public class ExercisesActivity extends ActionBarActivity {

    private List<Exercises_GetterSetter> muscle_group = null;
    final Context context = this;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_exercises);

        ListView list = (ListView)findViewById(R.id.exercises_list);

        muscle_group = new ArrayList<Exercises_GetterSetter>();
        muscle_group.add(new Exercises_GetterSetter("Chest", R.drawable.chest_icon));
        muscle_group.add(new Exercises_GetterSetter("Back", R.drawable.back_icon));
        muscle_group.add(new Exercises_GetterSetter("Shoulders", R.drawable.shoulder_icon));
        muscle_group.add(new Exercises_GetterSetter("Biceps", R.drawable.biceps_icon));
        muscle_group.add(new Exercises_GetterSetter("Neck", R.drawable.neck_icon));
        muscle_group.add(new Exercises_GetterSetter("Legs", R.drawable.leg_icon));
        muscle_group.add(new Exercises_GetterSetter("Abdominal", R.drawable.abd_icon));

        Exercises_Adapter adapter = new Exercises_Adapter(this, muscle_group);
        list.setOnItemClickListener(onItemClick_List);
        list.setAdapter(adapter);




    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener(){
        public void onItemClick(AdapterView arg0, View view, int position, long index) {

            showToast("Muscle Group :" + muscle_group.get(position).getMuscle_group());
            muscle_exercise(view, position);
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void muscle_exercise(View v, int item){

        if(item == 0){
            Intent myIntent = new Intent(v.getContext(), Exercises_Groups_Chest.class);
            startActivity(myIntent);
        } else if(item == 1){
            Intent myIntent = new Intent(v.getContext(), Exercises_Groups_Back.class);
            startActivity(myIntent);
        } else if(item == 2){
            Intent myIntent = new Intent(v.getContext(), Exercises_Groups_Shoulders.class);
            startActivity(myIntent);
        } else if(item == 3){
            Intent myIntent = new Intent(v.getContext(), Exercises_Group_Biceps.class);
            startActivity(myIntent);
        } else if(item == 4){
            Intent myIntent = new Intent(v.getContext(), Exercises_Groups_Chest.class);
            startActivity(myIntent);
        } else if(item == 5){
            Intent myIntent = new Intent(v.getContext(), Exercises_Groups_Legs.class);
            startActivity(myIntent);
        } else if(item == 6){
            Intent myIntent = new Intent(v.getContext(), Exercises_Groups_Abd.class);
            startActivity(myIntent);
        }




    }

}
