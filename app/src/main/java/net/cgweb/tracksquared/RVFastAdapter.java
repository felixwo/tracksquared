package net.cgweb.tracksquared;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RVFastAdapter <T> extends RecyclerView.Adapter<RVFastAdapter.ViewHolderClass>{

    private ArrayList<T> items;
    private Context context;
    private RVEventListener mRVEventListener;
    private int layout;

    public RVFastAdapter(ArrayList<T> items, Context context, int layout) {
        this.items = items;
        this.layout = layout;
        this.context = context;
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public RVEventListener getmRVEventListener() {
        return mRVEventListener;
    }

    public void setmRVEventListener(RVEventListener mRVEventListener) {
        this.mRVEventListener = mRVEventListener;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    @Override
    public void onBindViewHolder(@NonNull RVFastAdapter.ViewHolderClass viewHolderClass, int i) {

    }

/*@Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        mRVEventListener.onBindView(holder, items);
        holder.getContentView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRVEventListener.onClick(holder.getAdapterPosition(),items);
            }
        });
        holder.getContentView().setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mRVEventListener.onLongClick(holder.getAdapterPosition(),items);
                return true;
            }
        });
    }*/

    @Override
    public ViewHolderClass<T> onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(layout, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT); //needed to set the clickboxs
        itemView.setLayoutParams(lp);
        ViewHolderClass<T> holder = new RVFastAdapter<T>.ViewHolderClass<T>(itemView);
        return holder;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolderClass<T> extends RecyclerView.ViewHolder{
        private View contentView;
        public ViewHolderClass(View itemView){
            super(itemView);
            this.contentView = itemView;
        }

        public View getContentView() {
            return contentView;
        }
    }

    public interface RVEventListener {
        <T>void onClick(int pos, ArrayList<T> items);
        <T>void onBindView(RVFastAdapter.ViewHolderClass holder, ArrayList<T> items);
        <T>void onLongClick(int pos, ArrayList<T> items);
    }
}