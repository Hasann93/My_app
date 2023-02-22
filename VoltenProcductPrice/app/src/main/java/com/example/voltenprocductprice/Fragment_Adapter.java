package com.example.voltenprocductprice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Fragment_Adapter extends RecyclerView.Adapter<Fragment_Adapter.MyViewHolder> {

    Context mContext_f;
    List<Combo>mData_f;

    public Fragment_Adapter(Context mContext_f, List<Combo> mData_f) {
        this.mContext_f = mContext_f;
        this.mData_f = mData_f;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mContext_f).inflate(R.layout.cardview_list,parent,false);
        MyViewHolder vHolder=new MyViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return mData_f.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(View itemView) {
        super(itemView);
        }
    }
}
