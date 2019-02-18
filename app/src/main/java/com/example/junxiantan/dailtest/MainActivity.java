package com.example.junxiantan.dailtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.num);
        Button myBtn = (Button) findViewById(R.id.mybtn);

        myBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //将字符串转换成Uri对象
                Uri uri=Uri.parse("tel:"+ editText.getText().toString());


                //第一个参数表示操作的动作，系统根据这个会调用拨号功能
                //第二个参数用于指定操作的数据，即向拨打哪个号码
                Intent intent = new Intent(Intent.ACTION_CALL, uri);

                MainActivity.this.startActivity(intent);
            }
        });
    }
}
