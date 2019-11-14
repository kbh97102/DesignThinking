package com.example.designthinkingprototype;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.CustomViewHolder> {


    private ArrayList<FoodInfo> arrayList;

    public MainAdapter(ArrayList<FoodInfo> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MainAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomViewHolder holder, final int position) {

        holder.food_image.setImageResource(arrayList.get(position).getFood_iamge());
        holder.food_name.setText(arrayList.get(position).getFood_name());
        holder.food_content.setText(arrayList.get(position).getFood_cost());

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_menu_image = arrayList.get(position).getFood_iamge();
                String selected_menu_name = arrayList.get(position).getFood_name();
                String selected_menu_cost = arrayList.get(position).getFood_cost();
                //별점
                Intent intent = new Intent(v.getContext(),SelectedFoodMenu.class);
                intent.putExtra("selected_food_name", selected_menu_name);
                intent.putExtra("selected_food_cost", selected_menu_cost);
                intent.putExtra("selected_food_image", selected_menu_image);
                v.getContext().startActivity(intent);
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                remove(holder.getAdapterPosition());
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);
    }

    public void remove(int position){
        try{
            arrayList.remove(position);
            notifyItemRemoved(position);

        }catch(IndexOutOfBoundsException e1){
            e1.printStackTrace();
        }
    }
    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected ImageView food_image;
        protected TextView food_name;
        protected TextView food_content;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.food_image = (ImageView) itemView.findViewById(R.id.food_image);
            this.food_name = (TextView)itemView.findViewById(R.id.food_name);
            this.food_content = (TextView)itemView.findViewById(R.id.food_content);

        }
    }
}
