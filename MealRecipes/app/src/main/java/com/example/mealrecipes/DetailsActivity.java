package com.example.mealrecipes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView header,method,time,ingredients,servers,kcal,nullActivityDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

           imageView = (ImageView) findViewById(R.id.image_details);
           header = (TextView) findViewById(R.id.header_detail);
           method = (TextView) findViewById(R.id.method);
           time = (TextView) findViewById(R.id.time_detail);
           ingredients = (TextView) findViewById(R.id.ingredients);
           kcal = (TextView) findViewById(R.id.kcal);
           servers = (TextView) findViewById(R.id.servers);



        Intent intent = getIntent();
        int position = intent.getIntExtra("meal", 1);

        Meal meal = Database.getMeals().get(position);
        Log.i("position", String.valueOf(position));
        imageView.setImageResource(meal.mealImage);
        header.setText(meal.header);
        method.setText(meal.method);
        time.setText(meal.time);
        ingredients.setText(meal.ingredients);
        kcal.setText(meal.kcal);
        servers.setText(meal.servers);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

