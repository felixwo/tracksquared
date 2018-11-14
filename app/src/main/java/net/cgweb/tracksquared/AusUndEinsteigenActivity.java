package net.cgweb.tracksquared;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AusUndEinsteigenActivity extends AppCompatActivity {

    public static final String EXTRA_AUS_ODER_EINSTEIGEN_ID = "ausOderEinsteigenID";
    public static final int AUSSTEIGEN = 0;
    public static final int EINSTEIGEN = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aus_und_einsteigen);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int ausOderEin = getIntent().getIntExtra(EXTRA_AUS_ODER_EINSTEIGEN_ID,-1);
        if(ausOderEin == AUSSTEIGEN){
            setTitle(R.string.leaving);
        }else if (ausOderEin == EINSTEIGEN){
            setTitle(R.string.joining);
        }else {
            Toast.makeText(getApplicationContext(),"error, false acces of the activity",Toast.LENGTH_LONG).show();
        }

        Button buttonLeave = findViewById(R.id.leaveTrainButton);
        buttonLeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Du bist ausgestiegen.",Toast.LENGTH_LONG).show();
            }
        });

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
