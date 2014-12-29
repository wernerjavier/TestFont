package wernerjavier.com.testfont;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView iconLabelNextMatch = (TextView) findViewById(R.id.iconLabelNextMatch);
        TextView iconLabelCalendar = (TextView) findViewById(R.id.iconLabelCalendar);
        TextView iconLabelResults = (TextView) findViewById(R.id.iconLabelResults);
        TextView iconLabelNews = (TextView) findViewById(R.id.iconLabelNews);
        Typeface font = Typeface.createFromAsset(getAssets(),"fontawesome-webfont.ttf");

        iconLabelNextMatch.setTypeface(font);
        iconLabelCalendar.setTypeface(font);
        iconLabelNews.setTypeface(font);
        iconLabelResults.setTypeface(font);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
