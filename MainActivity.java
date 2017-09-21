package kushagragupta.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double mul=0,pl=0,mi=0,di=0;
    double dis=0,oper=0,del=0;
    int in=0;
    String number="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(String a)
    {

        TextView edit = (TextView) findViewById(R.id.text);

                edit.setText(a);
    }
    public void displaysymbol(String a)
    {TextView edit=(TextView) findViewById(R.id.symbol);
        edit.setText(a);
        edit.setTextColor(getResources().getColor(R.color.black));


    }
    public void one(View view)
    { number+="1";
        display(number);

    }
    public void two(View view)
    {
        number+="2";
        display(number);
        }
    public void three(View view)
    {
        number+="3";
        display(number);
        }
    public void four(View view)
    {
        number+="4";
        display(number);
        }
    public void five(View view)
    {
        number+="5";
        display(number);
       }
    public void six(View view)
    {
        number+="6";
        display(number);
        }
    public void seven(View view)
    {
        number+="7";
        display(number);
        }
    public void eight(View view)
    {
        number+="8";
        display(number);
        }
    public void nine(View view)
    {
        number+="9";
        display(number);
        }
    public void zero(View view)
    {
        number+="0";
        display(number);

            
        }
    public void plus(View view)
    {if(number!="")
    {
        if(pl==1||mi==1||di==1||mul==1)
    {
        if(pl==1)
        {dis= Double.parseDouble(number);
            String result = Double.toString(oper+dis);
            display(result);
            oper+=dis;
        }
        if(mi==1)
        {dis= Double.parseDouble(number);
            String result = Double.toString(oper-dis);
            display(result);
            oper-=dis;
        }
        if(mul==1)
        {dis= Double.parseDouble(number);
            String result = Double.toString(oper*dis);
            display(result);
            oper*=dis;
        }
        if(di==1)
        {dis= Double.parseDouble(number);
            String result = Double.toString(oper/dis);
            display(result);
            oper/=dis;
        }
        mul=mi=di=pl=del=dis=0;
        number="";
        displaysymbol("+");

        pl=1;
    }
    else
    {

        displaysymbol("+");
        if(number!="")
        oper= Double.parseDouble(number);
        number="";
        display("0");
        pl=1;}
    }}
    public void minus(View view)
    {if(number!="")
    {  if(pl==1||mi==1||di==1||mul==1) {
        if (pl == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper + dis);
            display(result);
            oper += dis;
        }
        if (mi == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper - dis);
            display(result);
            oper -= dis;
        }
        if (mul == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper * dis);
            display(result);
            oper *= dis;
        }
        if (di == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper / dis);
            display(result);
            oper /= dis;
        }
        mul = mi = di = pl = del = dis = 0;
        number = "";
        displaysymbol("-");

        mi = 1;
    }
    else {

        displaysymbol("-");
        if (number != "")
            oper = Double.parseDouble(number);
        number = "";
        display("0");
        mi = 1;
    }

    }}
    public void multiply(View view)
    {if(number!="")
    {  if(pl==1||mi==1||di==1||mul==1) {
        if (pl == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper + dis);
            display(result);
            oper += dis;
        }
        if (mi == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper - dis);
            display(result);
            oper -= dis;
        }
        if (mul == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper * dis);
            display(result);
            oper *= dis;
        }
        if (di == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper / dis);
            display(result);
            oper /= dis;
        }
        mul = mi = di = pl = del = dis = 0;
        number = "";
        displaysymbol("×");

        mul = 1;
    }
    else
    {
        displaysymbol("×");
        if(number!="")
        oper= Double.parseDouble(number);
        number="";
        display("0");
        mul=1;

    }}}
    public void devide(View view)
    {if(number!="")
    { if(pl==1||mi==1||di==1||mul==1) {
        if (pl == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper + dis);
            display(result);
            oper += dis;
        }
        if (mi == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper - dis);
            display(result);
            oper -= dis;
        }
        if (mul == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper * dis);
            display(result);
            oper *= dis;
        }
        if (di == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper / dis);
            display(result);
            oper /= dis;
        }
        mul = mi = di = pl = del = dis = 0;
        number = "";
        displaysymbol("÷");

        di = 1;
    }
    else
    {
        displaysymbol("÷");
        if(number!="")
        oper= Double.parseDouble(number);
        number="";
        display("0");
        di=1;


    }}}
    public void equal(View view)
    {if(number!="") {
        if (pl == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper + dis);
            display(result);
            oper += dis;
        }
        if (mi == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper - dis);
            display(result);
            oper -= dis;
        }
        if (mul == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper * dis);
            display(result);
            oper *= dis;
        }
        if (di == 1) {
            dis = Double.parseDouble(number);
            String result = Double.toString(oper / dis);
            display(result);
            oper /= dis;
        }
        mul = mi = di = pl = del = dis = 0;
        number = "";
        displaysymbol(null);
    }
    }

    public void del(View view)
    {if(number.length()!=0)
    { if(number.charAt(number.length()-1)=='.')
        del=0;
        number=number.substring(0,number.length()-1);
        display(number);
    }




    }
    public void decimal(View view)
    {if(del==0)
    {
        number+=".";
        display(number);
        del=1;
    }

    }
    public void inv(View view)
    {if(in==0)
    { Button b=(Button)findViewById(R.id.sin);
        b.setText("arcsin");
        b.setTextSize(15);
        Button c=(Button)findViewById(R.id.cos);
        c.setText("arccos");
        c.setTextSize(15);
        Button d=(Button)findViewById(R.id.tan);
        d.setText("arctan");
        d.setTextSize(15);
    in=1;}
        else
    {Button b=(Button)findViewById(R.id.sin);
        b.setText("sin");
        b.setTextSize(20);
        Button c=(Button)findViewById(R.id.cos);
        c.setText("cos");
        c.setTextSize(20);
        Button d=(Button)findViewById(R.id.tan);
        d.setText("tan");
        d.setTextSize(20);
        in=0;

    }
    }
    public void sin(View view)
    {if(number!="")
    { if(in==0)
        {
            oper=Double.parseDouble(number);
            double x=Math.sin(Math.toRadians(oper));
            number=Double.toString(x);
            oper=x;
            display(number);
            number="";
            
        }
        else
        {oper=Double.parseDouble(number);
            double x=Math.asin(oper);
            number=Double.toString(Math.toDegrees(x));
            oper=x;
            display(number);
            number="";
            

        }
    }}
    public void cos(View view)
    {if(number!="")
    {if(in==0)
        {
            oper=Double.parseDouble(number);
            double x=Math.cos(Math.toRadians(oper));
            number=Double.toString(x);
            oper=x;
            display(number);
            number="";
            
        }
        else
        {oper=Double.parseDouble(number);
            double x=Math.acos(oper);
            number=Double.toString(Math.toDegrees(x));
            oper=x;
            display(number);
            number="";
            

        }
    }}
    public void tan(View view)
    {if(number!="")
    {  if(in==0)
        {
            oper=Double.parseDouble(number);
            double x=Math.tan(Math.toRadians(oper));
            number=Double.toString(x);
            oper=x;
            display(number);
            number="";
            
        }
        else
        {oper=Double.parseDouble(number);
            double x=Math.atan(oper);
            number=Double.toString(Math.toDegrees(x));
            display(number);
            oper=x;
            number="";
            

        }
    }}
    public void info(View view)
    {
        Intent i = new Intent(MainActivity.this, info.class);
        startActivity(i);
    }

}
