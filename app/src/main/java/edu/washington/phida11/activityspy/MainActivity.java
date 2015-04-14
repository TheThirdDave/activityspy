package edu.washington.phida11.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.util.Log;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            Log.i("hwLog", "onCreate event fired" + savedInstanceState.toString());
        } else {
            Log.i("hwLog", "onCreate event fired");
        }
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("hwLog", "onStart event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("hwLog", "onResume event fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("hwLog", "onRestart event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("hwLog", "onPause event fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("hwLog", "onStop event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("hwLog", "We're going down Captain!");
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
