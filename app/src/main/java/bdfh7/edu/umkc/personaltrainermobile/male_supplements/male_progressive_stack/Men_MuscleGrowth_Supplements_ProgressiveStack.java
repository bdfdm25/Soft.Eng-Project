package bdfh7.edu.umkc.personaltrainermobile.male_supplements.male_progressive_stack;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
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
public class Men_MuscleGrowth_Supplements_ProgressiveStack extends ActionBarActivity {

    private List<Supplements_GetterSetter> progressive_stack = null;
    final Context context = this;
    private String description;
    private String title;

    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);

        setContentView(R.layout.listview_supplements);

        ListView list = (ListView) findViewById(R.id.supplements_list);


        progressive_stack = new ArrayList<Supplements_GetterSetter>();
        progressive_stack.add(new Supplements_GetterSetter("Whey Protein", "Protein Powder", R.drawable.med1));
        progressive_stack.add(new Supplements_GetterSetter("Micellar Casein Protein", "Time Release Protein", R.drawable.med1));
        progressive_stack.add(new Supplements_GetterSetter("BCAA", "Brainched Chain Amino Acid", R.drawable.med1));
        progressive_stack.add(new Supplements_GetterSetter("Pre-Workout Supplements", "Pre-Workout", R.drawable.med1));
        progressive_stack.add(new Supplements_GetterSetter("Omega-3", "Cardiovascular Support", R.drawable.med1));
        progressive_stack.add(new Supplements_GetterSetter("Creatine", "Creatine Monohydrate Powder", R.drawable.med1));
        progressive_stack.add(new Supplements_GetterSetter("Men's Daily Multivitamin", "Multivitamin", R.drawable.med1));

        Supplements_Adapter adapter = new Supplements_Adapter(this, progressive_stack);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(adapter);

    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {

            showToast("You clicked on : " + progressive_stack.get(position).getSupplement_name());
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
            title = "Casein:";
            description = "Casein's time-released formula allows the amino acids and protein to " +
                    "absorb in your stomach slowly, providing hours of repair and maintenance. You " +
                    "can use micellar casein to support long-term muscle building and help keep your m" +
                    "uscles happy as you go about your day. While whey isolate protein is ideal for " +
                    "your post-workout shake, micellar casein protein is the top choice for repair " +
                    "around the clock when you aren't training.\n" +
                    "\n" +
                    "Some of the areas micellar casein can help support are:\n" +
                    "\n" +
                    "- Fighting catabolism\n" +
                    "- Long-term protein absorption and muscle repair\n" +
                    "- Lean muscle development";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 2) {
            title = "BCAA:";
            description = "BCAA supplements are great for anyone who works out in the gym almost " +
                    "every day and wants to preserve lean muscle while preventing catabolism.\n" +
                    "\n" +
                    "Protein is what supplies the building blocks necessary to repair and build muscle " +
                    "tissue after your workout is complete. These proteins will then be broken down " +
                    "and disassembled into amino acids. There are nine essential amino acids that " +
                    "the body cannot manufacture itself and consumed through food or supplement form. " +
                    "Of those nine, L-Leucine, L-IsoLeucine, and L-Valine play a critical role in muscle " +
                    "development because they are metabolized in the muscle rather than the liver.\n" +
                    "\n" +
                    "Because BCAAs are metabolized in the muscle, they can be used for building new " +
                    "proteins or for energy. Using these products on a regular basis can help provide " +
                    "your body with vital muscle building elements from a high-quality source.";
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
        } else if (item == 4) {
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
        } else if (item == 5) {
            title = "Creatine:";
            description = "The biggest enemy to a good workout is fatigue. As much as you try to fight it, " +
                    "eventually your muscles grow tired and your strength plummets. It could mean the end to " +
                    "your workout, so fight back! When you supplement with creatine, fatigue may be reduced " +
                    "to help you get the most out of your workouts!* Some of the main benefits creatine " +
                    "may promote are:\n" +
                    "\n" +
                    "- Improved muscular strength and output levels\n" +
                    "- Reduced sensation of muscular fatigue\n" +
                    "- Improved recovery rates so you can push harder in every workout\n" +
                    "- Increased muscular endurance capacity\n" +
                    "- Hydrated muscles for a larger and fuller appearance";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }


    }
}
