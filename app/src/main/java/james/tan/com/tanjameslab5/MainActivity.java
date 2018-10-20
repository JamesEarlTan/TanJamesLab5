package james.tan.com.tanjameslab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtn = (Button) findViewById(R.id.mBtn);
        Button actBtn = (Button) findViewById(R.id.actBtn);
        Object v;

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Uri gmmIntentUri = Uri.parse("geo:14.6096767,120.9874574");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
            }
        });


        actBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main2);
            }
        });
    }
}
