package com.notusedhelp.test.ictidwgamebokkesander;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameStart extends AppCompatActivity {

    private Button start_game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);
    }

    public void buttonOnClick(View v){
        Button button=(Button) v;
        ((Button) v).setText("Clicked");
    }
}

public class Main extends ActionBarActivity implements View.OnClickListener {
    // do your stuff
}
