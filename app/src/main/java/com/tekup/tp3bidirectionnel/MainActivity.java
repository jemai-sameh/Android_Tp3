package com.tekup.tp3bidirectionnel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private EditText msg;
    private String message;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.send);
        msg=findViewById(R.id.msg);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent i) {
        super.onActivityResult(requestCode, resultCode, i);
        if (requestCode=25){
            if(resultCode=RESULT_OK){
                String reply=i.getStringExtra("Reply");
                textView.setVisibility(View.VISIBLE);
                msg.setText(reply);
            }

        }
    }

    private  void sendMessage(View v){

        if (msg.getText().equals(""))
            Toast.makeText(getApplicationContext(),"Chaine vide",Toast.LENGTH_SHORT).show();
    }
    private void launchReply (View v){

    }
}