package com.example.cz16i04001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    public TextView pantalla,secundaria;
    int ope;
    double operand1, operand2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = findViewById(R.id.lblpantalla);
        secundaria = findViewById(R.id.lblsecundaria);

    }

    //parentesis
    public void pare1(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"(";
        pantalla.setText(cap);
    }
    public void pare2(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+")";
        pantalla.setText(cap);
    }
    public void punto(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+".";
        pantalla.setText(cap);
    }

    public void btn2(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"2";
        pantalla.setText(cap);
    }
    public void btn3(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"3";
        pantalla.setText(cap);
    }
    public void btn4(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"4";
        pantalla.setText(cap);
    }
    public void btn5(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"5";
        pantalla.setText(cap);
    }
    public void btn6(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"6";
        pantalla.setText(cap);
    }
    public void btn7(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"7";
        pantalla.setText(cap);
    }
    public void btn8(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"8";
        pantalla.setText(cap);
    }
    public void btn9(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"9";
        pantalla.setText(cap);
    }
    public void btn1(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"1";
        pantalla.setText(cap);
    }
    public void btn0(View view )
    {
        String cap = pantalla.getText().toString();
        cap = cap+"0";
        pantalla.setText(cap);
    }

    // suma (operaciones aritmeticas)
    public  void suma(View v)
    {
        try {
            String aux1 = pantalla.getText().toString();
            operand1 = Double.parseDouble(aux1);
        }
        catch (NumberFormatException nfe)
        {}
        secundaria.setText("     "+pantalla.getText().toString()+"+");
        pantalla.setText("");


        ope =1;

    }

    //
    public  void resta(View v)
    {
        try {
            String aux1 = pantalla.getText().toString();
            operand1 = Double.parseDouble(aux1);
        }
        catch (NumberFormatException nfe)
        {}
        secundaria.setText("     "+pantalla.getText().toString()+"-");
        pantalla.setText("");
        ope =2;

    }

    // suma (operaciones aritmeticas)
    public  void multiplicacion(View v)
    {
        try {
            String aux1 = pantalla.getText().toString();
            operand1 = Double.parseDouble(aux1);
        }
        catch (NumberFormatException nfe)
        {}
        secundaria.setText("     "+pantalla.getText().toString()+"*");
        pantalla.setText("");
        ope =3;

    }

    // suma (operaciones aritmeticas)
    public  void division(View v)
    {
        try {
            String aux1 = pantalla.getText().toString();
            operand1 = Double.parseDouble(aux1);
        }
        catch (NumberFormatException nfe)
        {}
        secundaria.setText("     "+pantalla.getText().toString()+"/");
        pantalla.setText("");
        ope =4;

    }

    public void igual(View v)
    {
        try {
            String aux2 = pantalla.getText().toString();
            operand2 = Double.parseDouble(aux2);
        }
        catch (NumberFormatException nfe)
        {}
        pantalla.setText("");
        if(ope ==1)
        {
            res = operand1 + operand2;
            secundaria.setText("     "+operand1+"+"+operand2);
        }
        else if(ope ==2)
        {
            res = operand1 - operand2;
            secundaria.setText("     "+operand1+"-"+operand2);
        }
        else if(ope ==3)
        {
            res = operand1 * operand2;
            secundaria.setText("     "+operand1+"*"+operand2);
        }
        else if(ope ==4)
        {
            res = operand1 / operand2;
            secundaria.setText("     "+operand1+"/"+operand2);
        }



        pantalla.setText(""+res);
        operand1=res;
    }


    public  void clear(View v)
    {
        pantalla.setText("");
        operand1=0.0;
        operand2=0.0;
        secundaria.setText("");
        res =0.0;
    }
    public void borrar(View v)
    {
        if(!pantalla.getText().toString().equals(""))
        {
            pantalla.setText(pantalla.getText().subSequence(0,pantalla.getText().length()-1)+"");
        }
    }

}
