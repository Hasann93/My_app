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

public class Single_Adapter extends RecyclerView.Adapter<Single_Adapter.MyViewHolder2> {
    private Context msContext;
    private List<Single>msData;

    public Single_Adapter(Context msContext, List<Single> msData) {
        this.msContext = msContext;
        this.msData = msData;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view2;
        LayoutInflater msInflater=LayoutInflater.from(msContext);
        view2=msInflater.inflate(R.layout.cardview_single,parent,false);
        return new MyViewHolder2(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        holder.tvs_Single_title.setText(msData.get(position).getS_Title());
        holder.txt_view_Price_s.setText(msData.get(position).getS_Description());
        holder.Single_Thumbnail.setImageResource(msData.get(position).getS_Thumbnail());
        //Set Click Listener
        holder.cardViews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(msContext,MainActivity3.class);
                intent.putExtra("sTitle",msData.get(position).getS_Title());
                intent.putExtra("sThumbnail",msData.get(position).getS_Thumbnail());
                msContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return msData.size();
    }

    public static class MyViewHolder2 extends RecyclerView.ViewHolder{

        TextView tvs_Single_title , txt_view_Price_s;
        ImageView Single_Thumbnail;
        CardView cardViews;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            txt_view_Price_s=itemView.findViewById(R.id.txt_View_Price_s);
            tvs_Single_title=(TextView) itemView.findViewById(R.id.txt_View_S);
            Single_Thumbnail=(ImageView) itemView.findViewById(R.id.Img_view_S);
            cardViews=(CardView) itemView.findViewById(R.id.card_view_s);

        }
    }
}
