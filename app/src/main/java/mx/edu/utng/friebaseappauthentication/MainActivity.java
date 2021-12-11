package mx.edu.utng.friebaseappauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

    Button btnLogOut;
    Button btnCal;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogOut = findViewById(R.id.btnLogout);
        mAuth = FirebaseAuth.getInstance();
        btnCal = findViewById(R.id.btnCal);

        btnLogOut.setOnClickListener(view -> {
            mAuth.signOut();
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        });

        btnCal.setOnClickListener(view -> {
            mAuth.signOut();
            startActivity(new Intent(MainActivity.this, CalBanActivity.class));
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user == null){
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
    }
}