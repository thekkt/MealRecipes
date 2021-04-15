package com.example.mealrecipes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Database.setContext(MainActivity.this);
        Database.addMeal(new Meal("Spinach & tuna pancakes", "Celebrate Shrove Tuesday with these wholesome spinach and tuna pancakes. Healthy, nutritious and full of flavour, they deliver three of your 5-a-day","10 mins", "Ingredients\n" +
                "½ cauliflower , broken into florets, stalk chopped into cubes\n" +
                "2 tsp olive oil\n" +
                "100g orzo\n" +
                "2 tsp capers , drained and rinsed\n" +
                "1 small garlic clove , sliced\n" +
                "½ lemon , zested and juiced\n" +
                "100ml low-salt vegetable stock (check it’s vegan, if required)\n" +
                "handful of rocket leaves , to serve","Method\n" +
                "STEP 1\n" +
                "Heat the grill to high. Toss the cauliflower with half the oil and some seasoning. Tip onto a baking tray and grill for 15-20 mins until golden, charred, and tender all the way through.\n" +
                "\n" +
                "STEP 2\n" +
                "Meanwhile, cook the orzo in a pan of boiling salted water for 8 mins, or until al dente. Drain.\n" +
                "\n" +
                "STEP 3\n" +
                "Heat the remaining oil in a frying pan and sizzle the capers and garlic until golden. Stir in the orzo, cauliflower, lemon zest and juice and the stock. Bubble for 1 min, then spoon half into a bowl and top with the rocket. Leave the leftovers to cool for the lunchbox, see tip below.  \n" +
                " ",false,"122","3",R.drawable.image5));
        Database.addMeal(new Meal("Lemon & yogurt chicken flatbreads","Make these family-friendly chicken wraps with lemon, garlic and cinnamon marinade on a barbecue if the sun is shining. Serve in flatbreads with yoghurt","20 mins","Ingredients\n" +
                "1 large sweet potato , skin left on, scrubbed and cut into medium chunks\n" +
                "1 cauliflower , cut into large florets, stalk diced\n" +
                "1 tbsp garam masala\n" +
                "3 tbsp groundnut oil\n" +
                "2 garlic cloves\n" +
                "200g puy lentils\n" +
                "thumb-sized piece ginger , grated\n" +
                "1 tsp Dijon mustard\n" +
                "1½ limes , juiced\n" +
                "2 carrots","STEP 1\n" +
                "Heat oven to 200C/180C fan/gas 6. Toss the sweet potato and cauliflower with the garam masala, half the oil and some seasoning. Spread out on a large roasting tray. Add the garlic and roast for 30-35 mins until cooked.\n" +
                "\n" +
                "STEP 2\n" +
                "Meanwhile, put the lentils in a saucepan with 400ml cold water. Bring to the boil, then simmer for 20-25 mins until the lentils are cooked but still have some bite. Drain. \n" +
                "\n" +
                "STEP 3\n" +
                "Remove the garlic cloves from the tray and squish them with the blade of your knife. Put the garlic in a large bowl with the remaining oil, ginger, mustard, a pinch of sugar and one-third of the lime juice. Whisk, then tip in the warm lentils, stir and season to taste. Coarsely grate the carrots, shred the cabbage and roughly chop the coriander. Squeeze over the remaining lime juice and season to taste.\n" +
                "\n" +
                "STEP 4\n" +
                "Divide the lentil mixture between four bowls (or four containers if saving and chilling). Top each serving with a quarter of the carrot slaw and a quarter of the sweet potato and cauliflower mix.\n" +
                "\n" +
                "GOES WELL WITH\n" +
                "Lentil & sweet potato curry\n" +
                "Superhealthy slaw\n" +
                "Cauliflower tempura\n" +
                "Recipe from Good Food magazine, December 2018\n" +
                "\n" +
                "More from around the web\n" +
                "Promoted stories by\n" +
                "Actor Sylvester Stallone Selling La Quinta, California, Villa at a Loss\n" +
                "Actor Sylvester Stallone Selling La Quinta, California, Villa at a Loss\n" +
                "(Mansion Global)\n" +
                "Why secure data analytics is critical for CCPA compliance\n" +
                "Why secure data analytics is critical for CCPA compliance\n" +
                "(TechBeacon)\n" +
                "Charlize Theron Selling Los Angeles Bungalow\n" +
                "Charlize Theron Selling Los Angeles Bungalow\n" +
                "(Mansion Global)\n" +
                "Sendgrid blames lack of 2FA for mountains of spam\n" +
                "Sendgrid blames lack of 2FA for mountains of spam\n" +
                "(TechBeacon)\n" +
                "5 reasons QA teams need to pump up application security training\n" +
                "5 reasons QA teams need to pump up application security training\n" +
                "(TechBeacon)\n" +
                "Cristiano Ronaldo Sells Manchester House: This Is A Big One\n" +
                "Cristiano Ronaldo Sells Manchester House: This Is A Big One\n" +
                "(Mansion Global)\n" +
                "Build your cybersecurity A-team: 7 recruiting tips\n" +
                "Build your cybersecurity A-team: 7 recruiting tips\n" +
                "(TechBeacon)\n" +
                "The Ruins of Liam Hemsworth’s Former Malibu Home Quietly Sell\n" +
                "The Ruins of Liam Hemsworth’s Former Malibu Home Quietly Sell\n" +
                "(Mansion Global)\n" +
                "Comments, questions and tips (4)\n" +
                "Rate this recipe\n" +
                "What is your star rating out of 5?1 star out of 5\n" +
                "2 stars out of 5\n" +
                "3 stars out of 5\n" +
                "4 stars out of 5\n" +
                "5 stars out of 5\n" +
                "Choose the type of message you'd like to post\n" +
                "Choose the type of message you'd like to post\n" +
                "\n" +
                "Comment\n" +
                "\n" +
                "Question\n" +
                "\n" +
                "Tip\n" +
                "Overall rating\n" +
                "Rating: 4 out of 5.\n" +
                "23 ratings\n" +
                "LP_food\n" +
                "1 month ago\n" +
                "Really delicious. I used curry powder instead of garam masala and only calculated a portion as 300 calories not 350 which was a bonus! The slaw is a great staple recipe I’ll be using with other meals!\n" +
                "\n" +
                "Rachelephillips\n" +
                "5 months ago\n" +
                "Really enjoyed this. The slaw will be one of my goto salad accompaniments going forward and the sweet potato/cauliflower mix was so good\n" +
                "\n" +
                "Lucylockket\n" +
                "1 year ago\n" +
                "Question\n" +
                "Can this be made ahead? Would you store it in the fridge in 3 separate containers, then serve chilled or how do you reheat?\n" +
                "\n" +
                "denise\n" +
                "2 years ago\n" +
                "Rating: 5 out of 5.\n" +
                "Really tasty recipe. The flavour combinations are amazing. The red cabbage and carrot slaw are the star of the show. I also cooked the puy lentils in some white wine and vegetable stock which added extra flavour to dish. A definite keeper. Highly recommend.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Related guides\n" +
                "Exclusive offer from Good Food Deals: Get a personalised garden sign and dibber for just £15.49!\n" +
                "\n",false,"342","6",R.drawable.image1));
        Database.addMeal(new Meal("Tomato soup with pasta", "Enjoy this family-favourite tomato soup with carrots, celery and pasta for a lighter supper. It's great for a packed lunch too – simply pour into a flask","30 mins", "null","null",false,"233","3",R.drawable.image2));
        Database.addMeal(new Meal("Quick chicken hummus bowl", "Make our healthy chicken and hummus salad bowl for a delicious budget lunch option. It can be thrown together in just 10 minutes and delivers three of your 5-a-day","10 mins","null","null",false,"265","4", R.drawable.image4));
        Database.addMeal(new Meal("Spinach & tuna pancakes", "Celebrate Shrove Tuesday with these wholesome spinach and tuna pancakes. Healthy, nutritious and full of flavour, they deliver three of your 5-a-day","10 mins","null","null",false,"122","6", R.drawable.image5));
        Database.addMeal(new Meal("Tomato soup with pasta", "Enjoy this family-favourite tomato soup with carrots, celery and pasta for a lighter supper. It's great for a packed lunch too – simply pour into a flask","30 mins", "null","null",false,"123","7",R.drawable.image2));
        Database.addMeal(new Meal("Quick chicken hummus bowl", "Make our healthy chicken and hummus salad bowl for a delicious budget lunch option. It can be thrown together in just 10 minutes and delivers three of your 5-a-day","10 mins","null","null",false,"265","3", R.drawable.image4));
        Database.addMeal(new Meal("Spinach & tuna pancakes", "Celebrate Shrove Tuesday with these wholesome spinach and tuna pancakes. Healthy, nutritious and full of flavour, they deliver three of your 5-a-day","10 mins","null","null",false,"144","6", R.drawable.image5));



        recyclerView = (RecyclerView) findViewById(R.id.recycle_view_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MealAdapter adapterMain = new MealAdapter();
        Database.maybe = false;
        recyclerView.setAdapter(adapterMain);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.favourite){
            startActivity(new Intent(MainActivity.this, FavoriteActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}