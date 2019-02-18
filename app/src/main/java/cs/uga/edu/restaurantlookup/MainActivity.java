package cs.uga.edu.restaurantlookup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* add the image view to display */
        ImageView imageView = (ImageView) findViewById(R.id.mainPageImage);
        imageView.setImageAlpha(50);
        imageView.setImageResource(R.drawable.food_main);

    }
}
