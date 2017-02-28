package css.cis3334.favoritecontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1Call;
    Button button1Text;
    Button button2Call;
    Button button2Text;
    Button button3Call;
    Button button3Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void setupButtonClickEvents() {
        button1Call = (Button) findViewById(R.id.button1Call);
        button1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "6122368854"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        button1Text = (Button) findViewById(R.id.button1Text);
        button1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2186939286"));
                sendIntent.putExtra("sms_body", "Ciao");
                startActivity(sendIntent);
            }
        });


        button2Call = (Button) findViewById(R.id.button2Call);
        button2Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "7362699334"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        button2Text = (Button) findViewById(R.id.button2Text);
        button2Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:7362699334"));
                sendIntent.putExtra("sms_body", "Ciao");
                startActivity(sendIntent);
            }
        });

        button3Call = (Button) findViewById(R.id.button3Call);
        button3Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "5074754267"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


        button3Text = (Button) findViewById(R.id.button3Text);
        button3Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:5074754267"));
                sendIntent.putExtra("sms_body", "Ciao");
                startActivity(sendIntent);
            }
        });


    }
}


