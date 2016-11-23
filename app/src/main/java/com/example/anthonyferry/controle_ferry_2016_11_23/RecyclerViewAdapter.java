package com.example.anthonyferry.controle_ferry_2016_11_23;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anthony FERRY on 23/11/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    ArrayList<FicheAnimal> items;
    Context mContext;

    public RecyclerViewAdapter(Context context, ArrayList<FicheAnimal> items) {
        this.items = items;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View convertView;
        convertView = inflater.inflate(R.layout.list_element, parent, false);

        return new ViewHolder(convertView);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {

        FicheAnimal item = items.get(position);
        holder.name.setText(item.getName());
        holder.spicie.setText(item.getSpicie());
        holder.note.setText(item.getNote());
      //  holder.picture.setImageResource(item.getPicture());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView spicie;
        public TextView note;
        public ImageView picture;

        public ViewHolder(View itemView) {
            super(itemView);



            name = (TextView) itemView.findViewById(R.id.tv_animal_name);
            spicie = (TextView) itemView.findViewById(R.id.tv_spicies);
            note = (TextView) itemView.findViewById(R.id.tv_note);
            picture = (ImageView) itemView.findViewById(R.id.iv_picture);
        }
    }
}