package net.aetxabao.tresactivities;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DosActivity extends TracerActivity {

    public DosActivity(){
        super();
        this.msg = "Traza 2";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        String ruta = bundle.getString("RUTA");
        ruta += " 2";

        TextView lblDos = (TextView) findViewById(R.id.LblDos);
        lblDos.setText("Ruta: " + ruta);

        Button btnA = (Button) findViewById(R.id.BtnADos);
        Button btnB = (Button) findViewById(R.id.BtnBDos);

        final String finalRuta = ruta;

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(DosActivity.this, UnoActivity.class);
                intentA.putExtra("RUTA", finalRuta);
                startActivity(intentA);
                DosActivity.this.finish();
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentB = new Intent(DosActivity.this, TresActivity.class);
                intentB.putExtra("RUTA", finalRuta);
                startActivity(intentB);
                DosActivity.this.finish();
            }
        });

    }

}
