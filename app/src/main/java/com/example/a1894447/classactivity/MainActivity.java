package com.example.a1894447.classactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = ;
    EditText edt_name, edt_email, edt_pass;
    Button btn_sub;
    private Object btn_exit;
    private Object btn_submit;
    private View btn_ext;
    private Object v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = findViewById(R.id, edt_name);
        edt_email = findViewById(R.id, edt_email);
        edt_pass = findViewById(R.id, edt_pass);

        btn_sub = findViewById(R.id, btn_submit);
        btn_ext = findViewById(R.id, btn_exit);

        btn_sub.setonClickListener(new View.OnClickListener)
        public void onClick(View v) {
        String name = edt_name.getText().toString();
        String email = edt_email.getText().toString();

        Log.i(TAG, name);
        Log.i(TAG, email);
        Log.i(TAG, edt_pass.getText().toString());

        toast.settext();
        toast.setDuration(Toast.LENGTH_LONG);
        //Toast.makeText(getApplicationContext(),text "Registration Done", Toast.LENGTH_SHORT).show();
    }
}};

btn_ext.setonclickListener(new View.onClickListener(){

public void onClick(View v){
        finish();
        }
        }};

    }
}
