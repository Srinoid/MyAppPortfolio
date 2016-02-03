package com.srinumallidi.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button button1,button2,button3,button4,button5,button6;
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

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

    private void showToastMessage(String appName) {
        Toast.makeText(MainActivity.this, getString(R.string.btn_action_message, appName), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                showToastMessage(getString(R.string.my_spotify_streamer_app));
                break;

            case R.id.button2:
                showToastMessage(getString(R.string.scores_app));
                break;

            case R.id.button3:
                showToastMessage(getString(R.string.library_app));
                break;

            case R.id.button4:
                showToastMessage(getString(R.string.my_build_it_bigger_app));
                break;

            case R.id.button5:
                showToastMessage(getString(R.string.my_xyz_reader_app));
                break;

            case R.id.button6:
                showToastMessage(getString(R.string.my_capstone_app));
                break;

            default:
                break;
        }
    }
}