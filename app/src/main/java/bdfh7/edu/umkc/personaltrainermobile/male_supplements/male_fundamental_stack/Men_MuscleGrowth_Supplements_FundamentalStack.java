package bdfh7.edu.umkc.personaltrainermobile.male_supplements.male_fundamental_stack;

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

import bdfh7.edu.umkc.personaltrainermobile.R;
import bdfh7.edu.umkc.personaltrainermobile.Supplements_Adapter;
import bdfh7.edu.umkc.personaltrainermobile.Supplements_GetterSetter;

/**
 * Created by brenodm on 3/24/15.
 */
public class Men_MuscleGrowth_Supplements_FundamentalStack extends Activity {

    private List<Supplements_GetterSetter> fundamental_stack = null;
    final Context context = this;
    private String description;
    private String title;

    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);

        setContentView(R.layout.listview_supplements);

        ListView list = (ListView) findViewById(R.id.supplements_list);


        fundamental_stack = new ArrayList<Supplements_GetterSetter>();
        fundamental_stack.add(new Supplements_GetterSetter("Whey Protein", "Protein Powder", R.drawable.med1));
        fundamental_stack.add(new Supplements_GetterSetter("Men's Daily Multivitamin", "Multivitamin", R.drawable.med1));
        fundamental_stack.add(new Supplements_GetterSetter("Omega-3", "Cardiovascular Support", R.drawable.med1));
        fundamental_stack.add(new Supplements_GetterSetter("Pre-Workout Supplements", "Pre-Workout", R.drawable.med1));


        Supplements_Adapter adapter = new Supplements_Adapter(this, fundamental_stack);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(adapter);

    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {

            showToast("You clicked on :" + fundamental_stack.get(position).getSupplement_name());
            supplementInfo(position);
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void supplementInfo(int item) {
        if (item == 0) {
            title = "Whey Protein:";
            description = "If there's one nutrient that's an absolute must in your diet, protein is it. " +
                    "Protein forms the building blocks for your muscle tissue, so without it your body " +
                    "would lack a critical component needed for muscle to even exist. Whey is one of the " +
                    "best absorbed forms of protein in the body, even higher than chicken or fish. " +
                    "Supplement with high quality whey protein to get the results you long for! " +
                    "The benefits of using a whey protein powder include:\n" +
                    "\n" +
                    "- Ease and convenience of not having to prepare whole foods\n" +
                    "- Great taste that will satisfy your craving for something sweet\n" +
                    "- Promoting strength gains and cardiovascular function\n" +
                    "- Immune system optimization";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 1) {
            title = "Multivitamin:";
            description = "Multivitamins are one of the best investments one can make in supplementing " +
                    "their exercise and diet. Essentially, multivitamins encourage efficiency in your " +
                    "body for all of its various functions.* Deficiency in any one vitamin can result " +
                    "in a multiplier effect, meaning that missing one vitamin can negatively affect " +
                    "multiple body functions. Multivitamins are great for almost anyone because they " +
                    "cover such a wide spectrum of nutrients and functions. Builders, cutters, athletes, " +
                    "and even the average joe can find use for a good multivitamin!";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "Omega-3:";
            description = "Since the body cannot produce omega-3 fatty acids on its own, you should " +
                    "be getting them from food sources or supplementation. Omega-3 fatty acids are " +
                    "found in foods such as wild salmon, mackerel, tuna fish, lamb, flax seeds, hemp, " +
                    "kiwi fruit and walnuts. By getting your omega-3 fatty acids through food or " +
                    "supplementation, you can support brain and cardiovascular health!";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Pre-Workout:";
            description = "If you're looking to make the most out of your workout session, you want " +
                    "to be focused, driven and energized when you hit the gym. Whenever you hit the " +
                    "gym fatigued or unmotivated - or both - it's harder to push out those reps. " +
                    "And if you're just going through the motions, you're only wasting time.\n" +
                    "\n" +
                    "Pre-workout Supplements are designed to help you maximize your time in the gym " +
                    "and attack those weight racks! Some of the benefits you may experience are:\n" +
                    "\n" +
                    "- Sharp mental alertness and focus\n" +
                    "- Skyrocketing energy levels\n" +
                    "- Circulating oxygen flow in the muscle tissue\n" +
                    "- Explosive muscular energy \n" +
                    "- Vein-popping vascular pumps";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }
    }
}
