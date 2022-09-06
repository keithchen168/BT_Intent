package vn.edu.csc.bt_intent;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OneActivity extends AppCompatActivity {

    Button btNext;
    TextView tvResult;

    ActivityResultLauncher<Intent> mLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if( result.getResultCode() == 200){
                        int data = result.getData().getIntExtra("result", 0);
                        tvResult.setText(String.valueOf(data));
                    }
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        tvResult = findViewById(R.id.tvResult);

        btNext = findViewById(R.id.btNext);
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(OneActivity.this,TwoActivity.class);
//                intent.putExtra("so_a", 10);
//                intent.putExtra("so_b", 20);
//                startActivity(intent);
                Intent intent = new Intent(OneActivity.this,TwoActivity.class);
                intent.putExtra("so_a", 10);
                intent.putExtra("so_b", 20);
                mLauncher.launch(intent);
//                startActivityForResult(intent,100);
            }
        });
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode == 100 && resultCode == 200){
//            int result = data.getIntExtra("result", 0);
//            tvResult.setText(String.valueOf(result));
//        }
//    }
}