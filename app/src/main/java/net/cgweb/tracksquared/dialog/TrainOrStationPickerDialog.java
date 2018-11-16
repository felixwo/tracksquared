package net.cgweb.tracksquared.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.steinfluss.sf_fullscreendialog.FullScreenDialog;
import net.cgweb.tracksquared.R;

public class TrainPickerDialog extends FullScreenDialog {

    public TrainPickerDialog(Activity act) {
        super(act);
        setContentViewRes(R.layout.train_picker_dialog_layout);
        this.setOnShowListener(new OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                updateUI(dialog);
            }
        });
    }

    private void updateUI(DialogInterface dialogInterface){


    }
}
