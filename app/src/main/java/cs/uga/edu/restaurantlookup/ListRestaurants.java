package cs.uga.edu.restaurantlookup;

import android.support.annotation.RawRes;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ListRestaurants extends AppCompatActivity {

    TextView restaurantList;
    private static final String DEBUG_TAG = "Restaurant_List";

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_restaurants);

        /* to set up the back button and title*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        @StringRes int titleListRestaurants = R.string.list_restaurants;
        getSupportActionBar().setTitle(titleListRestaurants);

        /* instanstiate and add scroll bar for the text view */
        restaurantList = findViewById(R.id.restaurantList);
        restaurantList.setMovementMethod(new ScrollingMovementMethod());

        /* get Intent */
        String message = "";
        if(getIntent().hasExtra("spinnerOptionSelected")){
            message = getIntent().getStringExtra("spinnerOptionSelected");
        }

        /* call list restaurants */
        callListRestaurants(message,restaurantList);
    }

    /**
     *
     * @param view
     * @param restListOverviewRawFile
     */
    protected void setOverviewTextViews(TextView view, @RawRes int restListOverviewRawFile) {
        try {
            InputStream mainOverviewFile = this.getResources().openRawResource(restListOverviewRawFile);
            byte[] cuisineOverview = new byte[mainOverviewFile.available()];
            mainOverviewFile.read(cuisineOverview);
            view.setText(new String(cuisineOverview));
        } catch (Exception e) {
            Log.i(DEBUG_TAG,"exception:while R/W the raw file");
        }

    }

    /**
     *
     * @param message
     * @param textView
     */
    protected void callListRestaurants(String message,TextView textView) {
        switch (message) {
            case "Native American":
                setOverviewTextViews(textView,R.raw.native_american_restlist);
                break;
            case "Indian":
                setOverviewTextViews(textView,R.raw.indian_restlist);
                break;
            case "Thai":
                setOverviewTextViews(textView,R.raw.thai_restlist);
                break;
            case "Italian":
                setOverviewTextViews(textView,R.raw.italian_restist);
                break;
            case "Chinese":
                setOverviewTextViews(textView,R.raw.chinese_restlist);
                break;
            case "Mexican":
                setOverviewTextViews(textView,R.raw.mexican_restlist);
                break;
            case "Japanese":
                setOverviewTextViews(textView,R.raw.japanese_restlist);
                break;
            case "Armenian":
                setOverviewTextViews(textView,R.raw.armenian_restlist);
                break;
        }
    }
}
