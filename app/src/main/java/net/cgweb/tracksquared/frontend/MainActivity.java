package net.cgweb.tracksquared.frontend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import net.cgweb.tracksquared.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button joinButton = findViewById(R.id.buttonJoining);
        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AusUndEinsteigenActivity.class).putExtra(AusUndEinsteigenActivity.EXTRA_AUS_ODER_EINSTEIGEN_ID,AusUndEinsteigenActivity.EINSTEIGEN));
            }
        });
        Button leaveButton = findViewById(R.id.buttonLeaving);
        leaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AusUndEinsteigenActivity.class).putExtra(AusUndEinsteigenActivity.EXTRA_AUS_ODER_EINSTEIGEN_ID,AusUndEinsteigenActivity.AUSSTEIGEN));
            }
        });
    }
}