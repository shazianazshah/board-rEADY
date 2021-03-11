package com.example.my_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
private EditText player1;
private EditText player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
player1 = findViewById( R.id.editText );
        player2 = findViewById( R.id.editText2 );

    }public void submitButtonClick(View view){
        String editText = player1.getText().toString();
        String editText2 = player2.getText().toString();

            Intent intent = new Intent(this,Main4Activity.class);
            intent.putExtra( "PLAYER_NAMES",new  String[]{editText,editText2} );
startActivity( intent );



    }}

