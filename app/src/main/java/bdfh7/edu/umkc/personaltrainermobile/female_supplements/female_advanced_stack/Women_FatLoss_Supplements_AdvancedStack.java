package bdfh7.edu.umkc.personaltrainermobile.female_supplements.female_advanced_stack;

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
 * Created by brenodm on 3/5/15.
 */
public class Women_FatLoss_Supplements_AdvancedStack extends ActionBarActivity {

    private List<Supplements_GetterSetter> advanced_stack = null;
    final Context context = this;
    private String description;
    private String title;

    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);

        setContentView(R.layout.listview_supplements);

        ListView list = (ListView) findViewById(R.id.supplements_list);


        advanced_stack = new ArrayList<Supplements_GetterSetter>();
        advanced_stack.add(new Supplements_GetterSetter("Whey Protein", "Protein Powder", R.drawable.med1));
        advanced_stack.add(new Supplements_GetterSetter("Micellar Casein Protein", "Time Release Protein", R.drawable.med1));
        advanced_stack.add(new Supplements_GetterSetter("BCAA", "Brainched Chain Amino Acid", R.drawable.med1));
        advanced_stack.add(new Supplements_GetterSetter("Omega-3", "Cardiovascular Support", R.drawable.med1));
        advanced_stack.add(new Supplements_GetterSetter("Weight Loss Aid Capsule", "Thermogenic", R.drawable.med1));
        advanced_stack.add(new Supplements_GetterSetter("Women's Daily Multivitamin", "Multivitamin", R.drawable.med1));
        advanced_stack.add(new Supplements_GetterSetter("L-Carnitine 500mg", "Fat Loss", R.drawable.med1));

        Supplements_Adapter adapter = new Supplements_Adapter(this, advanced_stack);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(adapter);

    }

    AdapterView.OnItemClickListener onItemClick_List = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {
            //Pegar o item clicado
            showToast("You clicked on : " + advanced_stack.get(position).getSupplement_name());
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
        } else if (item == 4) {
            title = "Thermogenic - Fat Burners:";
            description = "Containing a wide variety of ingredients such as green tea extract, " +
                    "caffeine, yohimbe, branched chain amino acids and a variety of herbs, vitamins, " +
                    "and minerals - fat burners are potent fat fighting products designed to have " +
                    "your back when you need it.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 5) {
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
        } else if (item == 6) {
            title = "L-Carnitine:";
            description = "L-Carnitine is a natural compound that is found in avocadoes, dairy products, " +
                    "beef and lamb. Of course, if you are on a restricted diet and trying to burn off " +
                    "some extra fat, you may not be eating those foods in large amounts.\n" +
                    "\n" +
                    "That's where supplementation can help. Taking an L-Carnitine supplement will " +
                    "support your overall goal of losing fat, and it may improve your workout performance " +
                    "to help you get better results.\n" +
                    "\n" +
                    "L-Carnitine works by potentially helping to convert fatty acids into fuel your " +
                    "body can use for energy, while at the same time promoting growth and development.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }
    }
}