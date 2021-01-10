package com.example.firebaseapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.*;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firebaseapplication.classes.MeetoNote;
import com.example.firebaseapplication.fragment.AllMeetosFragment;

import java.util.ArrayList;

public class MeetoAdapter extends RecyclerView.Adapter {
    ArrayList<MeetoNote> mArray;
    Context context;
    RelativeLayout rl;



    public MeetoAdapter(ArrayList<MeetoNote> meetoNoteArrayList, Context context, RelativeLayout relativeLayout) {
        this.mArray = meetoNoteArrayList;
        this.context = context;
        this.rl = rl;
    }




    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_note,parent,false);
       ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


        ((ViewHolder) holder).note.setText(mArray.get(position).getNote()+"");
        ((ViewHolder) holder).date.setText(mArray.get(position).getDate()+"");
        //عشان امسح التوتية
        ((ViewHolder) holder).delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mArray.remove(position);
                notifyDataSetChanged();
            }
        });


//        String f =mArray.get(position).getFeeling();
//        if(f.equals("normal") ) {
//            ((ViewHolder) holder).feeling.setImageResource(R.drawable.normal);
//        };
//        if(f.equals("happy") ) {
//            ((ViewHolder) holder).feeling.setImageResource(R.drawable.happy);
//        };
//        if(f.equals("sad") ) {
//            ((ViewHolder) holder).feeling.setImageResource(R.drawable.sad);
//        };
//        if(f.equals("sleepy") ) {
//            ((ViewHolder) holder).feeling.setImageResource(R.drawable.sleepy);
//        };

        // لازم الfeeling تعفسنا بالحياة وبالكود
        ((ViewHolder) holder).feeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f =mArray.get(position).getFeeling();
                if(f.equals("normal") ) {
                   ((ViewHolder) holder).feeling.setImageResource(R.drawable.normal);
                   };
                if(f.equals("happy") ) {
                    ((ViewHolder) holder).feeling.setImageResource(R.drawable.happy);
                };
                if(f.equals("sad") ) {
                    ((ViewHolder) holder).feeling.setImageResource(R.drawable.sad);
                };
                if(f.equals("sleepy") ) {
                    ((ViewHolder) holder).feeling.setImageResource(R.drawable.sleepy);
                };

            }
        });
    }

    @Override
    public int getItemCount() {
        //here i should return the array size
        return mArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public View view;

        public TextView note;
        public TextView date;
        public ImageView feeling;
        public ImageView delete;
        public RelativeLayout rl;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            note = itemView.findViewById(R.id.meet);
            feeling = itemView.findViewById(R.id.imotion);
            date = itemView.findViewById(R.id.date);
            delete = itemView.findViewById(R.id.del);

        }
    }
}
