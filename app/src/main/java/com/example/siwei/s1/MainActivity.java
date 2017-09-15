package com.example.siwei.s1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.content.DialogInterface;
import android.widget.Toast;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    final String ID1 = "abc";
    final String PW1 = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                AlertDialog.Builder tishi = new AlertDialog.Builder(MainActivity.this);
                tishi.setMessage("这是一条提示");
                tishi.setTitle("提示");
                tishi.setPositiveButton("确定",null);
                tishi.show();
            }

        });

        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                final AlertDialog.Builder denglukuang = new AlertDialog.Builder(MainActivity.this);
                //LayoutInflater inflater = getLayoutInflater();
                final View view = getLayoutInflater().inflate(R.layout.denglu,null);
                denglukuang.setView(view)
                        //inflater.inflate(R.layout.denglu,null))
                        .setTitle("登陆框")
                        .setPositiveButton("登陆",new DialogInterface.OnClickListener(){
                            //View view = getLayoutInflater().inflate(R.layout.denglu,null);
                            EditText ID = (EditText)view.findViewById(R.id.yonghuming);
                            EditText PW = (EditText)view.findViewById(R.id.mima);
                            public void onClick(DialogInterface a, int id){
                                String aaa = ID.getText().toString();
                                String bbb = PW.getText().toString();
                                //Toast.makeText(MainActivity.this, aaa, Toast.LENGTH_LONG).show();
                                if(aaa.equals(ID1)&&bbb.equals(PW1)) {
                                    Toast.makeText(MainActivity.this, "成功", Toast.LENGTH_LONG).show();
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "错误", Toast.LENGTH_LONG).show();
                                }
                            }

                        })
                        .setNegativeButton("取消",new  DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface a, int id){
                                Toast.makeText(MainActivity.this, "用户取消登录", Toast.LENGTH_LONG).show();
                            }
                        });
                denglukuang.show();
            }

        });

    }

}
