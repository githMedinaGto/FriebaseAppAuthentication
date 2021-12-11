package mx.edu.utng.friebaseappauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;

public class CalBanActivity extends AppCompatActivity {

    private EditText et1;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_ban);

        this.et1 = (EditText)findViewById(R.id.et1);
        this.tv1 = (TextView)findViewById(R.id.tv1);
        this.tv2 = (TextView)findViewById(R.id.tv2);
        this.tv3 = (TextView)findViewById(R.id.tv3);
        this.tv4 = (TextView)findViewById(R.id.tv4);
        this.tv5 = (TextView)findViewById(R.id.tv5);
        this.tv6 = (TextView)findViewById(R.id.tv6);
        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(view -> {
                //finish();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            startActivity(intent);
        });

    }

    public void calcula(View paramView)
    {
        Double localDouble1 = Double.valueOf(Double.parseDouble(this.et1.getText().toString()));
        if (localDouble1.doubleValue() > 200.0D)
        {
            String str6 = String.valueOf(Math.floor(Double.valueOf(0.005D * localDouble1.doubleValue()).doubleValue()));
            this.tv1.setText(str6);
        }
        Double localDouble2 = Double.valueOf(Double.parseDouble(this.tv1.getText().toString()));
        if (localDouble1.doubleValue() > 100.0D)
        {
            String str5 = String.valueOf(Math.floor(Double.valueOf(0.01D * (localDouble1.doubleValue() - 200.0D * localDouble2.doubleValue())).doubleValue()));
            this.tv2.setText(str5);
        }
        Double localDouble3 = Double.valueOf(Double.parseDouble(this.tv2.getText().toString()));
        if (localDouble1.doubleValue() > 50.0D)
        {
            String str4 = String.valueOf(Math.floor(0.02D * (localDouble1.doubleValue() - (100.0D * localDouble3.doubleValue() + 200.0D * localDouble2.doubleValue()))));
            this.tv3.setText(str4);
        }
        Double localDouble4 = Double.valueOf(Double.parseDouble(this.tv3.getText().toString()));
        if (localDouble1.doubleValue() > 20.0D)
        {
            String str3 = String.valueOf(Math.floor(0.05D * (localDouble1.doubleValue() - (100.0D * localDouble3.doubleValue() + 200.0D * localDouble2.doubleValue() + 50.0D * localDouble4.doubleValue()))));
            this.tv4.setText(str3);
        }
        Double localDouble5 = Double.valueOf(Double.parseDouble(this.tv4.getText().toString()));
        if (localDouble1.doubleValue() > 10.0D)
        {
            String str2 = String.valueOf(Math.floor(0.1D * (localDouble1.doubleValue() - (100.0D * localDouble3.doubleValue() + 200.0D * localDouble2.doubleValue() + 50.0D * localDouble4.doubleValue() + 20.0D * localDouble5.doubleValue()))));
            this.tv5.setText(str2);
        }
        Double localDouble6 = Double.valueOf(Double.parseDouble(this.tv5.getText().toString()));
        if (localDouble1.doubleValue() > 1.0D)
        {
            String str1 = String.valueOf(Math.floor(localDouble1.doubleValue() - (100.0D * localDouble3.doubleValue() + 200.0D * localDouble2.doubleValue() + 50.0D * localDouble4.doubleValue() + 20.0D * localDouble5.doubleValue() + 10.0D * localDouble6.doubleValue())));
            this.tv6.setText(str1);
        }
    }
}