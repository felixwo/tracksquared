package net.cgweb.tracksquared.frontend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import net.cgweb.tracksquared.R;
import net.cgweb.tracksquared.database.Train;
import net.cgweb.tracksquared.dialog.TrainOrStationPickerDialog;

public class JoinAndLeaveActivity extends AppCompatActivity {

    public static final String EXTRA_AUS_ODER_EINSTEIGEN_ID = "ausOderEinsteigenID";
    public static final int AUSSTEIGEN = 0;
    public static final int EINSTEIGEN = 1;

    private EditText editTextConnection;
    private Button chooseStationButton, chooseTrainButton;

    private int einOderAus;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_and_leave);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        editTextConnection = findViewById(R.id.editTextConnection);
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
                Toast.makeText(getApplicationContext(),title + ",\nZugnummer: " + editTextConnection.getText().toString(),Toast.LENGTH_LONG).show();
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
        new TrainOrStationPickerDialog(this, TrainOrStationPickerDialog.TrainOrStation.Train).setTrainSelectedListener(new TrainOrStationPickerDialog.TrainSelectedListener() {
            @Override
            public void onTrainSelected(Train train) {
                //todo work with train
            }
        }).show();
    }

    private void chooseStationButtonClicked(View v){
        new TrainOrStationPickerDialog(this, TrainOrStationPickerDialog.TrainOrStation.Station).setTrainSelectedListener(new TrainOrStationPickerDialog.TrainSelectedListener() {
            @Override
            public void onTrainSelected(Train train) {
                //todo work with station
            }
        }).show();
    }

}
