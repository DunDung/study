package net.skhu.hyunasdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               EditText e = (EditText)findViewById(R.id.editText);
               if (e.getText().toString().equals("0208")) {
                   startActivity(new Intent(MainActivity.this, DiaryActivity.class));
                    e.setText("");
               }
               else Toast.makeText(MainActivity.this, "현아가 아니잖아요^^", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
