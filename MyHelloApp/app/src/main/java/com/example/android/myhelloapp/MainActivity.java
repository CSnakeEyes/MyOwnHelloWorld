 package com.example.android.myhelloapp;

 import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
 import android.widget.EditText;
 import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Change color of label text
        findViewById(R.id.text_color_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView myAppText = (TextView) findViewById(R.id.greeting_tv);
                myAppText.setTextColor(getResources().getColor(R.color.coolerColor));
            }
        });

        // Change background color
        findViewById(R.id.bg_color_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.darkBlue));

                // Set input text to white
                EditText input = (EditText) findViewById(R.id.text_et);
                input.setTextColor(getResources().getColor(R.color.white));
            }
        });

        //  Change the label text
        findViewById(R.id.text_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = (EditText) findViewById(R.id.text_et);
                String labelText = input.getText().toString();
                TextView myAppText = (TextView) findViewById(R.id.greeting_tv);

                if(labelText.equals("")){
                    myAppText.setText(R.string.secondGreeting);
                } else {
                    myAppText.setText(labelText);
                    input.setText("");
                }
            }
        });

        // Reset all parameters back to original
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Set background color to light blue (niceBlue)
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.niceBlue));

                // Set text color to normal blue
                TextView myApptext = (TextView) findViewById(R.id.greeting_tv);
                myApptext.setTextColor(getResources().getColor(R.color.coolColor));

                // Set label text to first greeting message ('Hello dear user')
                myApptext.setText(R.string.greetingText);

                // Set input text to black
                EditText input = (EditText) findViewById(R.id.text_et);
                input.setTextColor(getResources().getColor(R.color.black));
            }
        });
    }
}
