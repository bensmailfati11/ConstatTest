package ma.ofppt.myprojetversion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;

public class MainActivity1 extends AppCompatActivity {
    Button btn;
    EditText Edate;
    EditText Eheure;
    EditText Elien;
    EditText Etemoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        btn= (Button) findViewById(R.id.btn);
        Edate = (EditText) findViewById(R.id.Edate);
        Eheure =(EditText) findViewById(R.id.Eheure);
        Elien = (EditText) findViewById(R.id.Elien);
        Etemoin=(EditText) findViewById(R.id.Etemoin);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cc =new Intent(MainActivity1.this,MainActivity2.class);
                startActivity(cc);

            }
        });
    }
}