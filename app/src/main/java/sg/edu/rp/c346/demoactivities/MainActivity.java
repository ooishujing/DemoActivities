package sg.edu.rp.c346.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etName = (EditText) findViewById(R.id.editText);
                EditText etAge = (EditText) findViewById(R.id.editText2);
                String[] info = {etName.getText().toString(), etAge.getText().toString()};
                Intent i = new Intent(MainActivity.this,DemoActivities2.class);
                // pass the string array holding the name & age to new activity
                i.putExtra("info",info);
                // Start the new activity
                startActivity(i);
            }
        });
    }
}
