package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton= (Button)findViewById(R.id.rollButton);

        final ImageView leftDice =(ImageView) findViewById(R.id.leftDice);
        final ImageView rightDice =(ImageView) findViewById(R.id.rightDice);

        final int[] diceArray = {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "Button has been pressed");
                Random random = new Random();
                int number = random.nextInt(6);
                int number2 = random.nextInt(6);
                Log.d("Dicee", "Our random numbers are " +number +"and " +number2);
                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]);
            }
        });
    }
}