package vn.edu.csc.bt_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    TextView tvResult;
    int so_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvResult = findViewById(R.id.tvResult);

        Intent intent = getIntent();
        int so_a = intent.getIntExtra("so_a",0);
        int so_b = intent.getIntExtra("so_b",0);
        so_c = so_a + so_b;
        tvResult.setText(String.valueOf(so_c));
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent();
        intent.putExtra("result", so_c);
        setResult(200, intent);
        finish();
        return super.onSupportNavigateUp();
    }
}