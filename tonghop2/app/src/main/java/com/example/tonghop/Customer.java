package com.example.tonghop;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class Customer extends ArrayAdapter<String>{
    private Activity context;
    private String[] name;
    private String[] song;
    private Integer[] imgid;

    public Customer(Activity context,String[] name, String[] song, Integer[] imgid) {
        super(context, R.layout.product,song);
        this.context = context;
        this.name = name;
        this.song = song;
        this.imgid = imgid;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View row = inflater.inflate(R.layout.product,null,true);
        TextView namee =(TextView) row.findViewById(R.id.product_name);
        TextView typee=(TextView) row.findViewById(R.id.product_song);
        ImageView img=(ImageView) row.findViewById(R.id.product_img);

        namee.setText(name[position]);
        typee.setText(song[position]);
        img.setImageResource(imgid[position]);
        return row;
    }
}
