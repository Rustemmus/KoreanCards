package com.example.riskakov.koreancards;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button  btnStartTest, btnCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartTestClick(View view) {
        btnStartTest = (Button) findViewById(R.id.btnStartTest);
        Intent intent = new Intent(MainActivity.this, CardsActivity.class);

        if (view.getId() == R.id.btnStartTest)

            startActivity(intent);
    }

    public void onCardClick(View view) {
        btnCard = (Button) findViewById(R.id.btnCard);
        Intent intent = new Intent(MainActivity.this, CardsActivity.class);

        if (view.getId() == R.id.btnCard)

            startActivity(intent);
    }


}




