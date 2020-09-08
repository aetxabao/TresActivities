package net.aetxabao.tresactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UnoActivity extends TracerActivity {

    public UnoActivity(){
        super();
        this.msg = "Traza 1";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        String ruta = "";
        if (bundle != null) ruta = bundle.getString("RUTA");
        ruta += " 1";

        TextView lblUno = (TextView) findViewById(R.id.LblUno);
        lblUno.setText("Ruta:" + ruta);

        Button btnA = (Button) findViewById(R.id.BtnAUno);
        Button btnB = (Button) findViewById(R.id.BtnBUno);

        final String finalRuta = ruta;

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(UnoActivity.this, DosActivity.class);
                intentA.putExtra("RUTA", finalRuta);
                startActivity(intentA);
                //UnoActivity.this.finish();
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentB = new Intent(UnoActivity.this, TresActivity.class);
                intentB.putExtra("RUTA", finalRuta);
                startActivity(intentB);
                //UnoActivity.this.finish();
            }
        });

    }

}

