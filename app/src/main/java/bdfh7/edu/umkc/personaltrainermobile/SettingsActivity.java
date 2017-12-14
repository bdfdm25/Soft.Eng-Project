package bdfh7.edu.umkc.personaltrainermobile;

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

/**
 * Created by brenodm on 5/11/15.
 */
public class SettingsActivity extends Activity {

    private List<SettingsActivity_GetterSetter> settings_option = null;
    private String description;
    private String title;
    final Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_diet);

        ListView list = (ListView) findViewById(R.id.diet_screen);


        settings_option = new ArrayList<SettingsActivity_GetterSetter>();
        settings_option.add(new SettingsActivity_GetterSetter("About Developer",R.drawable.developer));
        settings_option.add(new SettingsActivity_GetterSetter("Read Me", R.drawable.readme));



        SettingsActivity_Adapter adapter = new SettingsActivity_Adapter(this, settings_option);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(adapter);

    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {
            showToast(" " + settings_option.get(position).getOption_title());
            info(position);
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void info(int item){
        if (item == 0) {
            title = "About Developer:";
            description = "\nDeveloper: Breno Dias Felicio\n" +
                          "\nStudent ID: 16196735\n" +
                          "\nContact: bdfh7@mail.umkc.edu";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 1) {
            title = "Read Me:";
            description = "When selecting Exercises in the main screen, you can navigate between the " +
                          "muscular groups and look for the exercises for each one.\n" +
                          "For example, if you clicked on the first option “Chest”, you will be redirected " +
                          "to a new screen with some exercises related to that group, and if you click on a " +
                          "specific exercise a popup will show up with the information about that exercise.\n" +
                          "More information you can find on the readme file.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }

    }

}
