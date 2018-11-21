package net.cgweb.tracksquared.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import net.cgweb.tracksquared.R;
import net.cgweb.tracksquared.RVFastAdapter;
import net.cgweb.tracksquared.database.station.Station;
import net.cgweb.tracksquared.database.train.Train;
import net.cgweb.tracksquared.frontend.MainActivity;

import java.util.ArrayList;

public class TrainOrStationPickerDialog extends FullScreenDialog {
    @BindView(R.id.rvPickTrainOrStation)RecyclerView recyclerView;
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
        ButterKnife.bind((Dialog) dialogInterface);
        final ArrayList<String> testList = new ArrayList<>();
        for (int i = 0; i < 100 ; i++){
            testList.add("Test: " + String.valueOf(i));
        }
        RVFastAdapter<String> adapter = new RVFastAdapter<String>(testList,getContext(),R.layout.rv_layout_select_station_or_train);
        adapter.setmRVEventListener(new RVFastAdapter.RVEventListener() {
            @Override
            public <T> void onClick(int pos, ArrayList<T> items) {

            }

            @Override
            public <T> void onBindView(RVFastAdapter.ViewHolderClass holder, ArrayList<T> items) {
                View view = holder.getContentView();
                int pos = holder.getAdapterPosition();
                String item = (String) items.get(pos);
                TextView textView = view.findViewById(R.id.textViewTest);
                textView.setText(item);
            }

            @Override
            public <T> void onLongClick(int pos, ArrayList<T> items) {

            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    public TrainOrStationPickerDialog setSelectedListener(SelectedListener selectedListener){
        this.mSelectedListener = selectedListener;
        return this;
    }

    public interface SelectedListener { //return train or station - other is null
        void onSelected(@Nullable Train train,@Nullable Station station);
    }
}
