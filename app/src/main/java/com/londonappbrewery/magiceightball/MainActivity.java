package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.askButton);
        final ImageView ballToApear = findViewById(R.id.ball);

        final int[] images = {
                R.drawable.yes_ball,
                R.drawable.no_ball,
                R.drawable.no_idea,
                R.drawable.ask_again,
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumberGenarator = new Random();

                int number = randomNumberGenarator.nextInt(4);
                ballToApear.setImageResource(images[number]);
            }
        });
    }
}
