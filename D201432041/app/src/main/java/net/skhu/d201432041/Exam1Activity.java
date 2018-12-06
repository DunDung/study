package net.skhu.d201432041;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Exam1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);

        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner1 = (Spinner) findViewById(R.id.spinner_userType);
                String text = spinner1.getSelectedItem().toString();

                EditText editText1 = (EditText)findViewById(R.id.editText1);
                editText1.setText(text);
            }
        };
        Button button1 = (Button)findViewById(R.id.btnOk);
        button1.setOnClickListener(listener1);

        RadioGroup.OnCheckedChangeListener listener2 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                EditText editText1 = (EditText)findViewById(R.id.editText1);
                switch (checkedId) {
                    case R.id.radioButton1: editText1.setText(R.string.array1); break;
                    case R.id.radioButton2: editText1.setText(R.string.array2); break;
                    case R.id.radioButton3: editText1.setText(R.string.array3); break;
                }
            }
        };
        final RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(listener2);


    }
}
