package net.cgweb.tracksquared.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import net.cgweb.tracksquared.R;

public class FullScreenDialog extends Dialog {
    private int resId;
    private Activity activity;
    private View view;
    private FullScreenDialog.OnViewCreatedListener onViewCreatedListener;

    public FullScreenDialog(Activity act, int resId) {
        super(act, R.style.full_screen_dialog);
        this.activity = act;
        this.resId = resId;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(resId);
        keepStatusBar();
    }

    private void keepStatusBar() {
        try {
            WindowManager.LayoutParams attrs = getWindow().getAttributes();
            attrs.flags &= ~WindowManager.LayoutParams.FLAG_FULLSCREEN;
            getWindow().setAttributes(attrs);
        }catch (Exception ae){}
    }

    public void setOnShowListener(@Nullable OnShowListener listener) {
        super.setOnShowListener(listener);
    }

    public FullScreenDialog setContentViewRes(int resId) {
        this.resId = resId;
        return this;
    }

    public FullScreenDialog setOnViewCreatedListener(final FullScreenDialog.OnViewCreatedListener onViewCreatedListener) {
        this.onViewCreatedListener = onViewCreatedListener;
        this.setOnShowListener(new OnShowListener() {
            public void onShow(DialogInterface dialog) {
                onViewCreatedListener.onCreated(FullScreenDialog.this.getView(), dialog);
            }
        });
        return this;
    }

    public View getView() {
        return this.view;
    }

    public interface OnViewCreatedListener {
        void onCreated(View var1, DialogInterface var2);
    }
}
