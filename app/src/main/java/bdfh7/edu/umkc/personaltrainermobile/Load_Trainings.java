package bdfh7.edu.umkc.personaltrainermobile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by brenodm on 4/15/15.
 */
public class Load_Trainings extends Activity {

    private ListView trainingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_trainings);

        trainingList = (ListView) findViewById(R.id.trainingList);
    }

    protected void onResume() {
        super.onResume();

        DB_Helper dbHelper = new DB_Helper(this);
        List<New_Training_GetterSetter> listTrainings = dbHelper.selectTrainings();

        ArrayAdapter<New_Training_GetterSetter> newAdapter = new ArrayAdapter<New_Training_GetterSetter>(this, android.R.layout.simple_list_item_1, listTrainings);
        trainingList.setAdapter(newAdapter);

    }
}
