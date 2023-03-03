package com.tekup.tp3bidirectionnel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ReplyActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private EditText msg;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.send);
        msg=findViewById(R.id.msg);

        i= getIntent();
        String resp=i.getStringExtra("send");
        textView.setVisibility(View.VISIBLE);
        textView.setText(resp);
    }
    private  void replyMessage(View v){
        String msgResp=msg.getText().toString();
        Intent j =new Intent();
        j.putExtra("Reply",msgResp);
        if (msgResp.isEmpty()){
            setResult(RESULT_CANCELED,j);
        }else             setResult(RESULT_OK,j);


        finish();

        if (msg.getText().equals(""))
            Toast.makeText(getApplicationContext(),"Chaine vide",Toast.LENGTH_SHORT).show();
    }
}