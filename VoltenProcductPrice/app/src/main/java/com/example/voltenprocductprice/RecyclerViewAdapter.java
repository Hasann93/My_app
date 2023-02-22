package com.example.voltenprocductprice;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mComtext;
    private List<Combo> mData;

    public RecyclerViewAdapter(Context mComtext, List<Combo> mData) {
        this.mComtext = mComtext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInfalter=LayoutInflater.from(mComtext);
        view=mInfalter.inflate(R.layout.cardview_list,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_combo_title.setText(mData.get(position).getTitle());
        holder.txtPrice.setText(mData.get(position).getCategory());
        holder.img_combo_thumbnail.setImageResource(mData.get(position).getThumbnail());

        //Set Click Listener
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mComtext,MainActivity2.class);
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Category",mData.get(position).getTitle());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                mComtext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_combo_title,txtPrice;
        ImageView img_combo_thumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_combo_title=(TextView) itemView.findViewById(R.id.txt_View);
            txtPrice=itemView.findViewById(R.id.txt_View_Price);
            img_combo_thumbnail=(ImageView) itemView.findViewById(R.id.Img_view);
            cardView=(CardView) itemView.findViewById(R.id.card_view);
        }
    }

}
