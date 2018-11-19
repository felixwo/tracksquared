package net.cgweb.tracksquared.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import net.cgweb.tracksquared.R;
import net.cgweb.tracksquared.database.Station;
import net.cgweb.tracksquared.database.Train;

public class TrainOrStationPickerDialog extends FullScreenDialog {

    public enum TrainOrStation {Train,Station};
    private TrainOrStation mTrainOrStation;

    private SelectedListener mSelectedListener;

    public TrainOrStationPickerDialog(Activity act, TrainOrStation trainOrStation) {
        super(act, R.layout.train_picker_dialog_layout);
        setContentViewRes(R.layout.train_picker_dialog_layout);
        this.mTrainOrStation = trainOrStation;
        this.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                updateUI(dialog);
            }
        });
    }

    private void updateUI(DialogInterface dialogInterface){
        //todo adjust interface according to trainOrStation
    }

    public TrainOrStationPickerDialog setSelectedListener(SelectedListener selectedListener){
        this.mSelectedListener = selectedListener;
        return this;
    }

    public interface SelectedListener { //return train or station - other is null
        void onSelected(@Nullable Train train,@Nullable Station station);
    }
}
