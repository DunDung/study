package net.skhu.b201432041;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class B201432041Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b201432041);

        Button b = (Button)findViewById(R.id.Button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = (EditText)findViewById(R.id.editText1);
                CharSequence s =e1.getText();
                EditText e2 = (EditText)findViewById(R.id.editText2);
                e2.setText(s);
                e1.setText(null);
            }
        });
    }
}
