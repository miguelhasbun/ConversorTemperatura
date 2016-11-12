package android.unitec.conversortemperatura;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Spinner spinner2;
    private EditText eTcantidad;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTcantidad=(EditText)findViewById(R.id.eTcantidad);
        tvResultado=(TextView)findViewById(R.id.tvResultado);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        String []opciones={"CELSIUS","FARENHEIT","KELVIN","RANKINE"};
        String []destino={"CELSIUS","FARENHEIT","KELVIN","RANKINE"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, destino);
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter2);

    }
    public void Convertir(View view){
        String cant=eTcantidad.getText().toString();
        int nro1=Integer.parseInt(cant);

        String selec=spinner.getSelectedItem().toString();
        String select=spinner2.getSelectedItem().toString();

        if (selec.equalsIgnoreCase("CELSIUS")&& select.equalsIgnoreCase("FARENHEIT")) {
            double conversion= nro1+ 273.15;;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " F° ");
        }
    }
    //Función limpiar
    public void Limpiar (View view){
        //
    }


}
