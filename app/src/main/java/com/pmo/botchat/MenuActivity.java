package com.pmo.botchat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btn1 = (Button)findViewById(R.id.btnchat);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ChatActivity.class));
            }
        });

        btn2 = (Button)findViewById(R.id.btnkeyword);

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, KeywordActivity.class));
            }
        });

        btn3 = (Button)findViewById(R.id.btnhistory);

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, HistoryActivity.class));
            }
        });

        btn4 = (Button)findViewById(R.id.btnlogout);

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, KeywordActivity.class));
                finish();
            }
        });
    }

}