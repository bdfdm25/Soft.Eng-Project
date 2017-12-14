package bdfh7.edu.umkc.personaltrainermobile;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brenodm on 3/5/15.
 */
public class DietActivity extends Activity {

    private List<DietActivity_GetterSetter> diet_description = null;


    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);

        setContentView(R.layout.activity_diet);

        ListView list = (ListView) findViewById(R.id.diet_screen);


        diet_description = new ArrayList<DietActivity_GetterSetter>();
        diet_description.add(new DietActivity_GetterSetter("Fat Loss Diet", "Definitive guide to weight loss.", R.drawable.new_diet2));
        diet_description.add(new DietActivity_GetterSetter("Low Carb Diet", "The Ultimate List of 40 Low-Carb Foods.", R.drawable.new_diet2));
        diet_description.add(new DietActivity_GetterSetter("Mass Gain Diet", "5 Nutrition Secrets For Gaining Lean Muscle Fast!", R.drawable.new_diet2));


        DietActivity_Adapter adapter = new DietActivity_Adapter(this, diet_description);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(adapter);

    }

    OnItemClickListener onItemClick_List = new OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {
            //Pegar o item clicado
            showToast("You clicked on :" + diet_description.get(position).getDiet_name());
            //newScreen(view , position);
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    /*private void newScreen(View v, int item) {
        if(item == 0){
            Intent myIntent = new Intent(v.getContext(), Fundamental_Stack_Info.class);
            myIntent.putExtra("Position",item);
            startActivity(myIntent);
        }

    }*/


}
