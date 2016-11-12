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
import android.widget.Toast;

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
        double conversion;
        //CONVERSIONES DE CELSIUS
        if (selec.equalsIgnoreCase("CELSIUS")&& select.equalsIgnoreCase("FARENHEIT")) {
            conversion= (nro1*1.8)+ 32;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " °F ");
        }else if(selec.equalsIgnoreCase("CELSIUS")&& select.equalsIgnoreCase("KELVIN")){
            conversion= nro1+ 273.15;;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " K ");
        }else if(selec.equalsIgnoreCase("CELSIUS")&& select.equalsIgnoreCase("RANKINE")){
            conversion= (9*nro1/5)+491.67;;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " °Ra ");
        }else if(selec.equalsIgnoreCase("CELSIUS")&& select.equalsIgnoreCase(("CELSIUS"))){
            Toast.makeText(this, "No se puede convertir entre el mismo tipo", Toast.LENGTH_LONG).show();
        }

        //CONVERSIONES DE FARENHEIT
        if (selec.equalsIgnoreCase("FARENHEIT")&& select.equalsIgnoreCase("CELSIUS")) {
            conversion= (nro1-32)*0.55555555555;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " °C ");
        }else if (selec.equalsIgnoreCase("FARENHEIT")&& select.equalsIgnoreCase("KELVIN")) {
            conversion= ((nro1-32)/1.8000)+ 273.15;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " K ");

        }else if (selec.equalsIgnoreCase("FARENHEIT")&& select.equalsIgnoreCase("RANKINE")) {
            conversion= (nro1-32)+ 491.67;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " °Ra ");
        }else if (selec.equalsIgnoreCase("FARENHEIT")&& select.equalsIgnoreCase("FARENHEIT")){
            Toast.makeText(this, "No se puede convertir entre el mismo tipo", Toast.LENGTH_LONG).show();
        }

        //CONVERSIONES KELVIN   YA QUEDA AHÍ EL FORMATO SÓLO PARA QUE CAMBIES LA FÓRMULA

        if (selec.equalsIgnoreCase("KELVIN")&& select.equalsIgnoreCase("CELSIUS") ){
            conversion= (nro1-32)*0.55555555555;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " °C ");
        }else if (selec.equalsIgnoreCase("KELVIN")&& select.equalsIgnoreCase("FARENHEIT")){
            conversion= (nro1-32)*0.55555555555;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " °F ");
        }else if (selec.equalsIgnoreCase("KELVIN") && select.equalsIgnoreCase("RANKINE")){
            conversion= (nro1-32)*0.55555555555;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " °Ra ");
        }else if(selec.equalsIgnoreCase("KELVIN")&& select.equalsIgnoreCase("KELVIN")){
            Toast.makeText(this, "No se puede convertir entre el mismo tipo", Toast.LENGTH_LONG).show();
        }
        //IGUAL QUE EN KELVIN YA ESTÁ LA ESTRUCTURA, SÓLO MODIFICAR LA FÓRMULA...

        if (selec.equalsIgnoreCase("RANKINE")&& select.equalsIgnoreCase("CELSIUS")){
            conversion= (nro1-32)*0.55555555555;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " °C ");
        }else if (selec.equalsIgnoreCase("RANKINE") && select.equalsIgnoreCase("FARENHEIT")){
            conversion= (nro1-32)*0.55555555555;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " °F ");
        }else if (selec.equalsIgnoreCase("RANKINE") && select.equalsIgnoreCase("KELVIN")){
            conversion= (nro1-32)*0.55555555555;
            String resu=String.valueOf(conversion);
            tvResultado.setText(resu + " K ");
        }else;
            Toast.makeText(this, "No se puede convertir entre el mismo tipo", Toast.LENGTH_LONG).show();
        }

    //Función limpiar   REALIZAR LA FUNCIÓN LIMPIAR
    public void Limpiar (View view){
        //
    }


}
