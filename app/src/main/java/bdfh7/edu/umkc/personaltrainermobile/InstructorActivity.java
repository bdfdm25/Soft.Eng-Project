package bdfh7.edu.umkc.personaltrainermobile;


import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class InstructorActivity extends ActionBarActivity {

    private Button instructor1;
    private Button instructor2;
    private Button instructor3;
    private Button instructor4;

    final Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructor);

        instructor1 = (Button) findViewById(R.id.instructor1_button);
        instructor2 = (Button) findViewById(R.id.instructor2_button);
        instructor3 = (Button) findViewById(R.id.instructor3_button);
        instructor4 = (Button) findViewById(R.id.instructor4_button);

        instructor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("OK!");
                builder.show();
            }
        });

        instructor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("OK!");
                builder.show();
            }
        });

        instructor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("OK!");
                builder.show();
            }
        });

        instructor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("OK!");
                builder.show();
            }
        });

    }
}