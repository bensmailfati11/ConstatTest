package ma.ofppt.myprojetversion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    RadioButton moto, voiture, camion;
    LinearLayout lnr1, lnr2, lnr3;
    CheckBox c1, c2, c3, c4, c5, c6;
    CheckBox c1_, c2_, c3_, c4_, c5_, c6_;
    CheckBox c1__, c2__, c3__, c4__, c5__, c6__;
    RadioGroup rg;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn3 =findViewById(R.id.btnfrst);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cc =new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(cc);
            }
        });

        moto = findViewById(R.id.moto);
        voiture = findViewById(R.id.voiture);
        camion = findViewById(R.id.camion);
        rg = findViewById(R.id.rg);


        lnr1 = findViewById(R.id.lnr1);
        lnr2 = findViewById(R.id.lnr2);
        lnr3 = findViewById(R.id.lnr3);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);

        c1_ = findViewById(R.id.c1_);
        c2_ = findViewById(R.id.c2_);
        c3_ = findViewById(R.id.c3_);
        c4_ = findViewById(R.id.c4_);
        c5_ = findViewById(R.id.c5_);
        c6_ = findViewById(R.id.c6_);

        c1__ = findViewById(R.id.c1__);
        c2__ = findViewById(R.id.c2__);
        c3__ = findViewById(R.id.c3__);
        c4__ = findViewById(R.id.c4__);
        c5__ = findViewById(R.id.c5__);
        c6__ = findViewById(R.id.c6__);




    }


    public void check1(View view) {
        if (moto.isChecked()) {
            c1.setEnabled(true);
            c2.setEnabled(true);
            c3.setEnabled(true);
            c4.setEnabled(true);
            c5.setEnabled(true);
            c6.setEnabled(true);


        } else {
            c1.setEnabled(false);
            c2.setEnabled(false);
            c3.setEnabled(false);
            c4.setEnabled(false);
            c5.setEnabled(false);
            c6.setEnabled(false);
        }

    }

    public void checke2(View view) {
        if (voiture.isChecked()) {
            c1_.setEnabled(true);
            c2_.setEnabled(true);
            c3_.setEnabled(true);
            c4_.setEnabled(true);
            c5_.setEnabled(true);
            c6_.setEnabled(true);
        } else {
            c1_.setEnabled(false);
            c2_.setEnabled(false);
            c3_.setEnabled(false);
            c4_.setEnabled(false);
            c5_.setEnabled(false);
            c6_.setEnabled(false);
        }
    }

    public void check3(View view) {
        if (camion.isChecked()) {
            c1__.setEnabled(true);
            c2__.setEnabled(true);
            c3__.setEnabled(true);
            c4__.setEnabled(true);
            c5__.setEnabled(true);
            c6__.setEnabled(true);
        } else {
            c1__.setEnabled(false);
            c2__.setEnabled(false);
            c3__.setEnabled(false);
            c4__.setEnabled(false);
            c5__.setEnabled(false);
            c6__.setEnabled(false);
        }
    }

    }
