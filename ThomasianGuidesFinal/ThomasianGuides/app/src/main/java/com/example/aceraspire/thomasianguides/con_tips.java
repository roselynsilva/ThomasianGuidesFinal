package com.example.aceraspire.thomasianguides;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.aceraspire.thomasianguides.R;

public class con_tips extends ActionBarActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_tips);
    }
    public void ust_College(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), College.class));
    }

    public void ust_Flood (View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Flood.class));
    }
    public void ust_Food (View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Food.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.con_tips, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
