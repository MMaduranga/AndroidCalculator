package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
EditText text ;
String txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.edittxt1);
    }
    public void buttonEq(View view){
         txt=text.getText().toString();
         try {
             Context context=Context.enter();
             context.setOptimizationLevel(-1);
             Scriptable scriptable=context.initSafeStandardObjects();
             double result= (double) context.evaluateString(scriptable,txt,"Javascript",1,null);
             text.setText(result+"");
         }catch (Exception e){
             Toast.makeText(this, "Invalid expression", Toast.LENGTH_SHORT).show();
         }
    }
    public void buttonPlus(View view){
        txt=text.getText().toString();
        text.setText(txt+"+");
    }
    public void buttonMinus(View view){
         txt=text.getText().toString();
        text.setText(txt+"-");
    }
    public void buttonDiv(View view){
         txt=text.getText().toString();
        text.setText(txt+"/");
    }
    public void buttonMulti(View view){
         txt=text.getText().toString();
        text.setText(txt+"*");
    }
    public void buttonDot(View view){
        txt=text.getText().toString();
        text.setText(txt+".");
    }
    public void buttonC(View view){
text.setText("");
    }
    public void button0(View view){
 txt=text.getText().toString();
text.setText(txt+"0");
    }
    public void button1(View view){
         txt=text.getText().toString();
        text.setText(txt+"1");
    }
    public void button2(View view){
        txt=text.getText().toString();
        text.setText(txt+"2");
    }
    public void button3(View view){
        txt=text.getText().toString();
        text.setText(txt+"3");
    }
    public void button4(View view){
     txt=text.getText().toString();
        text.setText(txt+"4");
    }
    public void button5(View view){
      txt=text.getText().toString();
        text.setText(txt+"5");
    }
    public void button6(View view){
       txt=text.getText().toString();
        text.setText(txt+"6");
    }
    public void button7(View view){
     txt=text.getText().toString();
        text.setText(txt+"7");
    }
    public void button8(View view){
      txt=text.getText().toString();
        text.setText(txt+"8");
    }
    public void button9(View view){
     txt=text.getText().toString();
        text.setText(txt+"9");
    }

}