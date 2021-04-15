package com.example.mealrecipes;

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

public class MealAdapter extends RecyclerView.Adapter<MealAdapter.Holder>{
    public static class Holder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView image,favorite_delete;
        TextView header,description,timer;
        boolean next;



        public Holder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            image = itemView.findViewById(R.id.image_food);
            header = itemView.findViewById(R.id.header);
            description = itemView.findViewById(R.id.description);
            timer = itemView.findViewById(R.id.time);
            if (Database.maybe){
                favorite_delete = itemView.findViewById(R.id.delete);
                favorite_delete.setImageResource(R.drawable.ic_baseline_delete_24);
            }else{
                favorite_delete = itemView.findViewById(R.id.addFavorite);
                favorite_delete.setImageResource(R.drawable.ic_baseline_favorite_false_24);
            }

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = Database.getContext();
                    Intent intent = new Intent(context,DetailsActivity.class);
                    intent.putExtra("meal", getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Holder holder;
        if (Database.maybe) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.first_meal_favorite_activity, parent, false);
            holder = new Holder(view);
        }else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.first_meal, parent, false);
            holder = new Holder(view);
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Meal currentMeal;
        if (Database.maybe) {
            currentMeal = Database.getMealsFavorite().get(position);
        } else {
            currentMeal = Database.getMeals().get(position);
        }
        holder.header.setText(currentMeal.header);
        holder.image.setImageResource(currentMeal.mealImage);
        holder.description.setText(currentMeal.description);
        holder.timer.setText(currentMeal.time);
        if (Database.maybe) {
            holder.favorite_delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    currentMeal.favorite = false;
                    Database.getMealsFavorite().remove(currentMeal);
                    notifyDataSetChanged();
                }
            });
        } else {
                holder.favorite_delete.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Database.addMealFavorite(currentMeal);
                        currentMeal.favorite = true;
                        holder.favorite_delete.setImageResource(R.drawable.ic_baseline_favorite_true_25);
                    }
                });
            }
        }
    @Override
    public int getItemCount() {
        if (Database.maybe) {
            return Database.getMealsFavorite().size();
        } else {
            return Database.getMeals().size();
        }
    }

}
