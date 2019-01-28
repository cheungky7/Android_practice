package com.example.kycheung.implicit_intents;

import android.content.Intent;
import android.net.Uri;
<<<<<<< HEAD
import android.support.v4.app.ShareCompat;
=======
>>>>>>> 362c4a7306890bc07b323bd8a479b753f0c20eac
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mWebsiteEditText;
<<<<<<< HEAD
    private EditText mLocationEditText;
    private EditText mShareTextEditText;
=======
>>>>>>> 362c4a7306890bc07b323bd8a479b753f0c20eac
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        mWebsiteEditText = findViewById(R.id.website_edittext);
        mLocationEditText = findViewById(R.id.location_edittext);
        mShareTextEditText = findViewById(R.id.share_edittext);
    }

    public void openWebsite(View view) {

=======
    }

    public void openWebsite(View view) {
        mWebsiteEditText = findViewById(R.id.website_edittext);
>>>>>>> 362c4a7306890bc07b323bd8a479b753f0c20eac
        String url = mWebsiteEditText.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
<<<<<<< HEAD

    public void openLocation(View view) {
        String loc = mLocationEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void shareText(View view) {
        String txt = mShareTextEditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with: ")
                .setText(txt)
                .startChooser();

    }
=======
>>>>>>> 362c4a7306890bc07b323bd8a479b753f0c20eac
}
