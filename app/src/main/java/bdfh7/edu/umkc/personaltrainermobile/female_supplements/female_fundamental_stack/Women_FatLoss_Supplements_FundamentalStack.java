package bdfh7.edu.umkc.personaltrainermobile.female_supplements.female_fundamental_stack;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
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
public class Women_FatLoss_Supplements_FundamentalStack extends Activity {

    private List<Supplements_GetterSetter> fundamental_stack = null;
    final Context context = this;
    private String description;
    private String title;

    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);

        setContentView(R.layout.listview_supplements);

        ListView list = (ListView) findViewById(R.id.supplements_list);


        fundamental_stack = new ArrayList<Supplements_GetterSetter>();
        fundamental_stack.add(new Supplements_GetterSetter("Lean Protein - For Her", "Protein Powder", R.drawable.med1));
        fundamental_stack.add(new Supplements_GetterSetter("Women's Daily Multivitamin", "Multivitamin", R.drawable.med1));
        fundamental_stack.add(new Supplements_GetterSetter("Krill Oil", "Cardiovascular Support", R.drawable.med1));
        fundamental_stack.add(new Supplements_GetterSetter("Women's Weightloss Support", "Thermogenic", R.drawable.med1));


        Supplements_Adapter adapter = new Supplements_Adapter(this, fundamental_stack);
        list.setOnItemClickListener(onItemClick_List);

        list.setAdapter(adapter);

    }

    OnItemClickListener onItemClick_List = new OnItemClickListener() {
        public void onItemClick(AdapterView arg0, View view, int position, long index) {
            //Pegar o item clicado
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
            title = "Krill Oil:";
            description = "Krill are small animals called crustaceans - other crustaceans you know " +
                    "are lobster and shrimp. Krill live in oceans around the world and eat algae. " +
                    "The krill diet produces a bright red pigment in the animal and that comes from " +
                    "Astaxanthin. Astaxanthin is important because it may support antioxidant benefits " +
                    "and it's a great source of Omega-3 essential fatty acids EPA and DHA. Krill oil " +
                    "is made from the species of krill called Euphosia superba.\n" +
                    "\n" +
                    "There are 3 things that make Krill oil a standout supplement:\n" +
                    "\n" +
                    "- Omega-3 fatty acids\n" +
                    "- Phospholipids\n" +
                    "- Astaxanthin";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (item == 3) {
            title = "Thermogenic - Fat Burners:";
            description = "Containing a wide variety of ingredients such as green tea extract, " +
                    "caffeine, yohimbe, branched chain amino acids and a variety of herbs, vitamins, " +
                    "and minerals - fat burners are potent fat fighting products designed to have " +
                    "your back when you need it.";
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }

    }


}
