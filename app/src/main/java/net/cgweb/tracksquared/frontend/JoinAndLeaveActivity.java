package net.cgweb.tracksquared.frontend;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import net.cgweb.tracksquared.R;
import net.cgweb.tracksquared.database.station.Station;
import net.cgweb.tracksquared.database.train.Train;
import net.cgweb.tracksquared.dialog.TrainOrStationPickerDialog;

public class JoinAndLeaveActivity extends AppCompatActivity {

    public static final String EXTRA_AUS_ODER_EINSTEIGEN_ID = "ausOderEinsteigenID";
    public static final int AUSSTEIGEN = 0;
    public static final int EINSTEIGEN = 1;

    private Button chooseStationButton, chooseTrainButton;

    private int einOderAus;
    private String title;
    private Train selectedTrain;
    private Station selectedStation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_and_leave);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button buttonLeaveOrEnter = findViewById(R.id.leaveOrEnterTrainButton);
        chooseStationButton = findViewById(R.id.choose_station_button);
        chooseTrainButton = findViewById(R.id.choose_train_button);

        chooseTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseTrainButtonClicked(v);
            }
        });
        chooseStationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseStationButtonClicked(v);
            }
        });


        einOderAus = getIntent().getIntExtra(EXTRA_AUS_ODER_EINSTEIGEN_ID,-1);
        if(einOderAus == AUSSTEIGEN){
            title = getApplicationContext().getString(R.string.leaving);
            setTitle(R.string.leaving);
        }else if (einOderAus == EINSTEIGEN){
            title = getApplicationContext().getString(R.string.joining);
            setTitle(R.string.joining);
        }else {
            Toast.makeText(getApplicationContext(),"error, false access of the activity",Toast.LENGTH_LONG).show();
        }
        buttonLeaveOrEnter.setText(title);
        if (einOderAus == EINSTEIGEN){
            buttonLeaveOrEnter.setBackgroundColor(getResources().getColor(R.color.green));
        }else if (einOderAus == AUSSTEIGEN){
            buttonLeaveOrEnter.setBackgroundColor(getResources().getColor(R.color.red));
        }
        buttonLeaveOrEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo enter train
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

    private void chooseTrainButtonClicked(View v){
        new TrainOrStationPickerDialog(this, TrainOrStationPickerDialog.TrainOrStation.Train).setSelectedListener(new TrainOrStationPickerDialog.SelectedListener() {
            @Override
            public void onSelected(@Nullable Train train, @Nullable Station station) {
                //todo work with train
            }
        }).show();
    }

    private void chooseStationButtonClicked(View v){
        new TrainOrStationPickerDialog(this, TrainOrStationPickerDialog.TrainOrStation.Station).show();
    }

}
