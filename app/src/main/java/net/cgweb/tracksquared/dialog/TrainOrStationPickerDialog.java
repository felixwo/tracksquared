package net.cgweb.tracksquared.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import com.steinfluss.sf_fullscreendialog.FullScreenDialog;
import net.cgweb.tracksquared.R;
import net.cgweb.tracksquared.database.Train;

public class TrainOrStationPickerDialog extends FullScreenDialog {
    public enum TrainOrStation {Train,Station};
    private TrainOrStation mTrainOrStation;

    private TrainSelectedListener mTrainSelectedListener;

    public TrainOrStationPickerDialog(Activity act, TrainOrStation trainOrStation) {
        super(act);
        setContentViewRes(R.layout.train_picker_dialog_layout);
        this.mTrainOrStation = trainOrStation;
        this.setOnShowListener(new OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                updateUI(dialog);
            }
        });
    }

    private void updateUI(DialogInterface dialogInterface){
        //todo adjust interface according to trainOrStation

    }

    public TrainOrStationPickerDialog setTrainSelectedListener(TrainSelectedListener trainSelectedListener){
        this.mTrainSelectedListener = trainSelectedListener;
        return this;
    }

    public interface TrainSelectedListener{
        void onTrainSelected(Train train);
    }
}
