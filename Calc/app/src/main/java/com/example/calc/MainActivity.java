package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private Spinner sp1;
    private TextView tv3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        sp1=(Spinner)findViewById(R.id.sp1);
        tv3=(TextView)findViewById(R.id.tv3);

          String[] opciones={"Sum","Substract","Multiply","Divide"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item, opciones);

        sp1.setAdapter(adapter);




    }

    public void matematicas(View view){
        int num1,num2;
        int suma,resta,multi,div;
        String selec;
        num1=Integer.parseInt(et1.getText().toString());
        num2=Integer.parseInt(et2.getText().toString());
        selec=sp1.getSelectedItem().toString();

        if (selec.equals("Sum")){
            suma=num1+num2;
            tv3.setText("The sum is: "+suma);
        }else{
            if (selec.equals("Substract")){
                resta=num1-num2;
                tv3.setText("The subst is:"+resta);

            }else{
                if (selec.equals("Multiply")){
                    multi=num1*num2;
                    tv3.setText("The mult is:"+multi);

                }else{
                    if (selec.equals("Divide")){
                        div=num1/num2;
                        tv3.setText("The div is:"+div);
                    }
                }
            }
        }
    }
}
