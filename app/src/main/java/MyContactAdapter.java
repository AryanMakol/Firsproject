package com.example.firstproject;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyContactAdapter extends BaseAdapter {
    Context context;
    String[] festivals;

    public MyContactAdapter(Context context, String[] festivals) {
        this.context=context;
        this.festivals=festivals;
    }

    @Override
    public int getCount() {
        return festivals.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);

        View view=layoutInflater.inflate(R.layout.avengers,parent,false);

        //ImageView imageView=view.findViewById(R.id.img_listItem);

        TextView textView=view.findViewById(R.id.txt_listItem);

        textView.setText(festivals[position]);
        return view;
    }

}
