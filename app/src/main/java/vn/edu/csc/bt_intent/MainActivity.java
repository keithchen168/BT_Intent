package vn.edu.csc.bt_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btDial, btSMS, btEmail, btURL, btMarket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btDial = findViewById(R.id.btDial);
        btDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:9090909"));
                startActivity(intent);
            }
        });

        btSMS = findViewById(R.id.btSMS);
        btSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("smsto:90909090"));
                intent.putExtra("sms_body","ABCBCBCB");
                startActivity(intent);
            }
        });

        btEmail = findViewById(R.id.btEmail);
        btEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"abc@mgmail.com","abc1@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "MAIL ABC");
                intent.putExtra(Intent.EXTRA_TEXT, "content...");
                startActivity(intent);
            }
        });

        btURL = findViewById(R.id.btURL);
        btURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://csc.edu.vn"));
                startActivity(intent);
            }
        });

        btMarket = findViewById(R.id.btMarket);
        btMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=com.facebook.katana"));
                startActivity(intent);
            }
        });
    }
}