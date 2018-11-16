package net.cgweb.tracksquared.frontend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
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
                startActivity(new Intent(getApplicationContext(), JoinAndLeaveActivity.class).putExtra(JoinAndLeaveActivity.EXTRA_AUS_ODER_EINSTEIGEN_ID, JoinAndLeaveActivity.EINSTEIGEN));
            }
        });
        Button leaveButton = findViewById(R.id.buttonLeaving);
        leaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), JoinAndLeaveActivity.class).putExtra(JoinAndLeaveActivity.EXTRA_AUS_ODER_EINSTEIGEN_ID, JoinAndLeaveActivity.AUSSTEIGEN));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_settings_main_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings){
            Toast.makeText(getApplicationContext(),"Settings selected",Toast.LENGTH_LONG).show();
            //todo open settings activity
        }
        return super.onOptionsItemSelected(item);
    }
}