package net.cgweb.tracksquared;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button joinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinButton = findViewById(R.id.buttonJoining);
        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joiningButtonClicked(v);
            }
        });
    }

    private void joiningButtonClicked(View view) {
        startActivity(new Intent(getApplicationContext(), AusUndEinsteigenActivity.class));
    }
}