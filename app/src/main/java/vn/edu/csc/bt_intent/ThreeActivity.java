package vn.edu.csc.bt_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.parceler.Parcels;

public class ThreeActivity extends AppCompatActivity {

    Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        btNext = findViewById(R.id.btNext);
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Student student = new Student("ABC", "CDE");
//                Intent intent = new Intent(ThreeActivity.this, FourActivity.class);
//                intent.putExtra("student", student);
//                startActivity(intent);
            User user = new User("abc", "acb@gmail.com");
            Intent intent= new Intent(ThreeActivity.this, FourActivity.class);
            intent.putExtra("User", Parcels.wrap(user));
            startActivity(intent);

            }
        });
    }
}