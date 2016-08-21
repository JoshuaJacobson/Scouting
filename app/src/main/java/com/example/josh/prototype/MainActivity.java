package com.example.josh.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toTeleop(View v) {

        Button b = (Button)findViewById(R.id.button5);
        TextView t = (TextView)findViewById(R.id.textView);

        if (b.getText().equals("TO TELEOP")) {
            t.setText("Went to teleop.");
            b.setText("TO END GAME");
        }
        else if (b.getText().equals("TO END GAME")) {
            t.setText("Went to end game.");
            b.setText("NEW MATCH");
        }
    }

}
