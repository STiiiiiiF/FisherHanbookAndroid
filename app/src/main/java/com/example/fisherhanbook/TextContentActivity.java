package com.example.fisherhanbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TextContentActivity extends AppCompatActivity {
    private ImageView imageContent;
    private Typeface face1;
    private TextView textContent;
    private int category = 0;
    private int position = 0;
    private int[] arrayFish = {R.string.fish_karp, R.string.fish_pike, R.string.fish_catfish, R.string.fish_sturgeon, R.string.fish_burbot};
    private int[] arrayBait = {R.string.bait_worm, R.string.bait_corn, R.string.bait_bread, R.string.bait_maggot, R.string.bait_fly};
    private int[] arrayTackle = {R.string.tackle_fishing_rod, R.string.tackle_fishing_line, R.string.tackle_float, R.string.tackle_sinkers, R.string.tackle_hook};
    private int[] arrayLure = {R.string.lure_crackers, R.string.lure_bran, R.string.lure_cake, R.string.lure_milk, R.string.lure_bworm};
    private int[] arrayHistory = {R.string.stories1, R.string.stories2, R.string.stories3, R.string.stories4, R.string.stories5};
    private int[] arrayAdvice = {R.string.advice1, R.string.advice2, R.string.advice3, R.string.advice4, R.string.advice5};
    private int[] arrayFishImage = {R.drawable.karp, R.drawable.pike, R.drawable.catfish, R.drawable.sturgeon, R.drawable.burbot};
    private int[] arrayBaitImages = {R.drawable.worm, R.drawable.corn, R.drawable.bread, R.drawable.maggot, R.drawable.fly};
    private int[] arrayTackleImages = {R.drawable.fising_rod, R.drawable.fishing_line, R.drawable.float1, R.drawable.sinkers, R.drawable.hook};
    private int[] arrayLureImages = {R.drawable.crackers, R.drawable.bran, R.drawable.cake, R.drawable.powdered_milk, R.drawable.bloodworm};
    private int[] arrayHistoryImages = {R.drawable.fisherman_and_sea, R.drawable.fisherman_and_pike, R.drawable.on_the_don, R.drawable.case_of_fishing, R.drawable.still_pool};
    private int[] arrayAdviceImages = {R.drawable.lure, R.drawable.season_fish, R.drawable.what, R.drawable.big, R.drawable.best_fishing_rod};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        initText();
        reciveIntent();

    }

    private void reciveIntent() {
        Intent intent = getIntent();
        if (intent != null) {
            category = intent.getIntExtra("category", 0);
            position = intent.getIntExtra("position", 0);
        }
        switch (category) {
            case 0:
                textContent.setText(arrayFish[position]);
                imageContent.setImageResource(arrayFishImage[position]);
                break;
            case 1:
                textContent.setText(arrayBait[position]);
                imageContent.setImageResource(arrayBaitImages[position]);
                break;
            case 2:
                textContent.setText(arrayTackle[position]);
                imageContent.setImageResource(arrayTackleImages[position]);
                break;
            case 3:
                textContent.setText(arrayLure[position]);
                imageContent.setImageResource(arrayLureImages[position]);
                break;
            case 4:
                textContent.setText(arrayHistory[position]);
                imageContent.setImageResource(arrayHistoryImages[position]);
                break;
            case 5:
                textContent.setText(arrayAdvice[position]);
                imageContent.setImageResource(arrayAdviceImages[position]);
                break;

        }
    }

    private void initText() {
        textContent = findViewById(R.id.text_main_content);
        imageContent = findViewById(R.id.imageContent);
        face1 = Typeface.createFromAsset(this.getAssets(), "fonts/NotoSerif-VariableFont_wdth,wght.ttf");
        textContent.setTypeface(face1);

    }
}
