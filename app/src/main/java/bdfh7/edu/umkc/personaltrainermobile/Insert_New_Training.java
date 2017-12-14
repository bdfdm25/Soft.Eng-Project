package bdfh7.edu.umkc.personaltrainermobile;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

/**
 * Created by brenodm on 4/13/15.
 */
public class Insert_New_Training extends Activity {


    private Button ok;
    private EditText name_field;
    private EditText height_field;
    private EditText weight_field;
    private EditText age_field;
    private String title;
    private String description;

    String gender;

    final Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_new_training);

        gender = this.getIntent().getStringExtra("GenderFlag");

        ok = (Button) findViewById(R.id.insertButton);
        name_field = (EditText) findViewById(R.id.nameField);
        height_field = (EditText) findViewById(R.id.heightField);
        weight_field = (EditText) findViewById(R.id.weightField);
        age_field = (EditText) findViewById(R.id.ageField);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double height;
                double weight;

                height = Double.parseDouble(height_field.getText().toString());
                weight = Double.parseDouble(weight_field.getText().toString());
                calcBMI(height, weight);
                addNewTraining();
                cleanFields();
            }
        });

    }

    public void addNewTraining() {

        New_Training_GetterSetter new_training = new New_Training_GetterSetter();

        new_training.setName(name_field.getText().toString());
        new_training.setHeight(Float.parseFloat(height_field.getText().toString()));
        new_training.setWeight(Float.parseFloat(weight_field.getText().toString()));
        new_training.setAge(Integer.parseInt(age_field.getText().toString()));
        new_training.setGender(gender);

        DB_Helper dbHelper = new DB_Helper(this);
        dbHelper.insertTraining(new_training);

        //AlertDialog.Builder builder = new AlertDialog.Builder(context);
        //builder.setMessage("OK!!");
        //builder.show();
    }


    public void cleanFields() {
        name_field.setText(" ");
        height_field.setText(" ");
        weight_field.setText(" ");
        age_field.setText(" ");
    }


    public double calcBMI(double height_field, double weight_field) {
        double bmi;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        bmi = weight_field / (height_field * height_field);
        DecimalFormat df = new DecimalFormat("#.##");

        if (bmi >= 17 && bmi <= 18.49) {
            title = "Underweight!";
            description = "Your Body mass index (BMI) is " + df.format(bmi) + ".\n"
                    + "\nThe best kind of training for you is the Muscle Growth Beginner Level.";

            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            title = "Normal Weight!";
            description = "Your Body mass index (BMI) is " + df.format(bmi) + ".\n"
                    + "\nThe best kind of training for you is the Muscle Growth Intermediate or Advanced Level.";

            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (bmi >= 25 && bmi <= 29.99) {
            title = "Overweight!";
            description = "Your Body mass index (BMI) is " + df.format(bmi) + ".\n"
                    + "\nThe best kind of training for you is the Fat Loss Intermediate Level.";

            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        } else if (bmi >= 30) {
            title = "Obese!";
            description = "Your Body mass index (BMI) is " + df.format(bmi) + ".\n"
                    + "\nThe best kind of training for you is the Fat Loss Beginner Level.";

            builder.setMessage(description);
            builder.setTitle(title);
            builder.show();
        }


        return bmi;
    }


}
