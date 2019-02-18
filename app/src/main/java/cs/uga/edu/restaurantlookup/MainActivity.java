package cs.uga.edu.restaurantlookup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* add the image view to display */
        ImageView imageView = findViewById(R.id.mainPageImage);
        imageView.setImageAlpha(50);
        imageView.setImageResource(R.drawable.food_main);

        /* Text Views for the data */
        TextView textViewAppTittle = findViewById(R.id.textViewAppTittle);
        TextView textViewAppOverview = findViewById(R.id.textViewAppOverview);

        /* Spinner */
        Spinner spinnerCuisine = findViewById(R.id.spinnerCuisine);

        /* Button - More Info */
        Button buttonMoreInfo = findViewById(R.id.buttonMoreInfo);

        /* Button - List Restaurants */
        Button buttonListRestaurants = findViewById(R.id.buttonListRestaurants);

        /* set default value for Spinner */
    }
}
