package com.example.thehungrydeveloper2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView starterscard;
    CardView mainsCard;
    CardView dessartsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        starterscard =findViewById(R.id.card_view_starters);
        mainsCard =findViewById(R.id.card_view_main);
        dessartsCard =findViewById(R.id.card_view_dessarts);


        starterscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  startersActivityIntent =new Intent(MainActivity.this, StarterActivity.class);

                startActivity(startersActivityIntent);
            }

        });
        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  mainsCoursesActivityIntent =new Intent(MainActivity.this, MainCoursesActivity.class);

                startActivity(mainsCoursesActivityIntent);

            }
        });
        dessartsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dessartsActivityIntent =new Intent(MainActivity.this,DessertsActivity.class);
                startActivity(dessartsActivityIntent);
            }
        });

        TextView emailTextView =findViewById(R.id.text_view_emil_adress);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchemailAppintent =new Intent(Intent.ACTION_SENDTO);
                launchemailAppintent.setData(Uri.parse("mailto: shubhanshusingh2451@gmail.com "));
                startActivity(launchemailAppintent);

            }
        });







    }
}