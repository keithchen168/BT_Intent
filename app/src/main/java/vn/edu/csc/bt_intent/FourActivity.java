package vn.edu.csc.bt_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.parceler.Parcels;

public class FourActivity extends AppCompatActivity {
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        tvResult = findViewById(R.id.tvResult);

        Intent intent = getIntent();
//        Student student = (Student) intent.getSerializableExtra("student");
//        tvResult.setText(student.toString());
        User user = Parcels.unwrap(intent.getParcelableExtra("User"));
        tvResult.setText(user.toString());

    }
}