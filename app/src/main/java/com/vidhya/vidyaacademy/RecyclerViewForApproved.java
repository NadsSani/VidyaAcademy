package com.vidhya.vidyaacademy;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewForApproved extends RecyclerView.Adapter<RecyclerViewForApproved.ViewHolder> {
    TextView tv_card_name_admin_ap ;
    CircleImageView iv_card_photo_admin_ap;
    ArrayList<Approved_Adapter> list;
    Context context;
    ImageButton ib_edit_AdminList,ib_delete_AdminList;

    public RecyclerViewForApproved(Context context, ArrayList<Approved_Adapter> arrayList) {
        this.list = arrayList;
        this.context = context;



    }

    @NonNull
    @Override
    public RecyclerViewForApproved.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        CardView view = (CardView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_approved_card, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewForApproved.ViewHolder viewHolder, final int i) {
        final int j;
        final CardView cardView = viewHolder.cardView;


        tv_card_name_admin_ap= cardView.findViewById(R.id.tv_card_name_admin_ap);
        iv_card_photo_admin_ap=cardView.findViewById( R.id.iv_card_photo_admin_ap );
        tv_card_name_admin_ap.setText(list.get(i).getName().toString());

        Glide.with( context ).load( list.get( i ).getImage().toString()).into(iv_card_photo_admin_ap  );



        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(context, Approved_Classlist.class);
                intent.putExtra("AdminID",list.get( i ).getUserid());
                Log.e("AdminID",list.get(i).getUserid());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        int len = list.size();
        return len;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public CardView cardView;
        public ViewHolder(View view) {
            super(view);

            cardView = (CardView) view.findViewById(R.id.cardview_forAdmin_ap);

        }
    }
}