package net.aetxabao.tresactivities;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TresActivity extends TracerActivity {

    public TresActivity(){
        super();
        this.msg = "Traza 3";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        String ruta = bundle.getString("RUTA");
        ruta += " 3";

        TextView lblTres = (TextView) findViewById(R.id.LblTres);
        lblTres.setText("Ruta: " + ruta);

        Button btnA = (Button) findViewById(R.id.BtnATres);
        Button btnB = (Button) findViewById(R.id.BtnBTres);

        final String finalRuta = ruta;

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(TresActivity.this, UnoActivity.class);
                intentA.putExtra("RUTA", finalRuta);
                startActivity(intentA);
                //TresActivity.this.finish();
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentB = new Intent(TresActivity.this, DosActivity.class);
                intentB.putExtra("RUTA", finalRuta);
                startActivity(intentB);
                //TresActivity.this.finish();
            }
        });

    }

}