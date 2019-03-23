package com.example.kariotisstefanos.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import java.io.IOException;
import java.io.IOException;
public class Calculator extends AppCompatActivity {
    double apotel;
    public String  symvolo="";
    public String  apotelesma="";
    public double  temp1=0,temp2=0;
    boolean ispressed=false;
    boolean temp2get=false;
    boolean temp1get=false;
    int turn =0;
    String check="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculator);

        Button button0 = (Button) findViewById(R.id.button14);
        Button button1 = (Button) findViewById(R.id.button8);
        Button button2 = (Button) findViewById(R.id.button10);
        Button button3 = (Button) findViewById(R.id.button11);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button9);
        Button button8 = (Button) findViewById(R.id.button);
        Button button9 = (Button) findViewById(R.id.button2);

        Button buttonPR = (Button) findViewById(R.id.button3);
        Button buttonA = (Button) findViewById(R.id.button7);
        Button buttonP = (Button) findViewById(R.id.button12);
        Button buttonD = (Button) findViewById(R.id.button16);

        Button buttonT = (Button) findViewById(R.id.button15);
        Button buttonC = (Button) findViewById(R.id.button13);
        Button buttonI = (Button) findViewById(R.id.button17);


        button0.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                if (apotelesma != "") {
                    out.setText("");
                    apotelesma = "";
                    temp2=0;
                    temp2get=false;
                    turn=0;
                }
                if(temp2get==false && turn==0) {
                    out.append("0");
                    ispressed = false;
                    temp1get=true;
                    check=out.getText().toString();
                }
                else{
                    gettemp2("0");
                }
            }
        });
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                if (apotelesma != "") {
                    out.setText("");
                    apotelesma = "";
                    temp2=0;
                    turn=0;
                    temp2get=false;
                }
                if(temp2get==false && turn==0) {
                    out.append("1");
                    ispressed = false;
                    temp1get=true;
                    check=out.getText().toString();
                }
                else{
                    gettemp2("1");
                }

            }
        });
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                if (apotelesma != "") {
                    out.setText("");
                    apotelesma = "";
                    temp2=0;
                    turn=0;
                    temp2get=false;
                }
                if(temp2get==false&& turn==0) {
                    out.append("2");
                    ispressed = false;
                    temp1get=true;
                    check=out.getText().toString();
                }
                else{
                    gettemp2("2");
                }
            }
        });
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                if (apotelesma != "") {
                    out.setText("");
                    apotelesma = "";
                    temp2=0;
                    turn=0;
                    temp2get=false;
                }
                if(temp2get==false&& turn==0) {
                    out.append("3");
                    ispressed = false;
                    temp1get=true;
                    check=out.getText().toString();
                }
                else{
                    gettemp2("3");
                }
            }
        });
        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                if (apotelesma != "") {
                    out.setText("");
                    apotelesma = "";
                    temp2=0;
                    turn=0;
                    temp2get=false;
                }
                if(temp2get==false&& turn==0) {
                    out.append("4");
                    ispressed = false;
                    temp1get=true;
                    check=out.getText().toString();
                }
                else{
                    gettemp2("4");
                }
            }
        });
        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                if (apotelesma != "") {
                    out.setText("");
                    apotelesma = "";
                    temp2=0;
                    turn=0;
                    temp2get=false;
                }
                if(temp2get==false&& turn==0) {
                    out.append("5");
                    ispressed = false;
                    temp1get=true;
                    check=out.getText().toString();
                }
                else{
                    gettemp2("5");
                }
            }
        });
        button6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                if (apotelesma != "") {
                    out.setText("");
                    apotelesma = "";
                    temp2=0;
                    turn=0;
                    temp2get=false;
                }
                if(temp2get==false&& turn==0) {
                    out.append("6");
                    ispressed = false;
                    temp1get=true;
                    check=out.getText().toString();
                }
                else{
                    gettemp2("6");
                }
            }
        });
        button7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                if (apotelesma != "") {
                    out.setText("");
                    apotelesma = "";
                    temp2=0;
                    turn=0;
                    temp2get=false;
                }
                if(temp2get==false && turn==0) {
                    out.append("7");
                    ispressed = false;
                    temp1get=true;
                    check=out.getText().toString();
                }
                else{
                    gettemp2("7");
                }
            }
        });
        button8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                if (apotelesma != "") {
                    out.setText("");
                    apotelesma = "";
                    temp2=1;
                    turn=0;
                    temp2get=false;

                }
                if(temp2get==false&& turn==0) {
                    out.append("8");
                    ispressed = false;
                    temp1get=true;
                    check=out.getText().toString();
                }
                else{
                    gettemp2("8");
                }
            }
        });
        button9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                if (apotelesma != "") {
                    out.setText("");
                    apotelesma = "";
                    temp2=0;
                    turn=0;
                    temp2get=false;
                }
                if(temp2get==false&& turn==0) {
                    out.append("9");
                    ispressed = false;
                    temp1get=true;
                    check=out.getText().toString();
                }
                else{
                    gettemp2("9");
                }
            }
        });
        buttonPR.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(temp1get==true) {

                TextView out = (TextView) findViewById(R.id.editText);
                temp1=0;
                temp2=0;
                if(check!="") {
                    temp1 = Double.parseDouble(out.getText().toString());
                    out.setText("");
                    check="";
                    turn = 1;
                    temp2get = true;
                }
                else{
                    temp1=0;
                    turn = 0;
                    temp2get = false;
                    out.setText("");
                }
                ispressed = false;
                symvolo = "+";
                apotelesma = "";
            }
            }
        });
        buttonA.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp1get==true) {

                    TextView out = (TextView) findViewById(R.id.editText);
                    temp1=0;
                    temp2=0;
                    if(check!="") {
                        temp1 = Double.parseDouble(out.getText().toString());
                        out.setText("");
                        check="";
                        turn = 1;
                        temp2get = true;
                    }
                    else{
                        temp1=0;
                        turn = 0;
                        temp2get = false;
                        out.setText("");
                    }
                    ispressed = false;
                    symvolo = "-";
                    apotelesma = "";
                }
            }
        });
        buttonP.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp1get==true) {
                    temp1=0;
                    temp2=0;
                    TextView out = (TextView) findViewById(R.id.editText);
                    if(check!="") {
                        temp1 = Double.parseDouble(out.getText().toString());
                        out.setText("");
                        check="";
                        turn = 1;
                        temp2get = true;
                    }
                    else{
                        temp1=0;
                        turn = 0;
                        temp2get = false;
                        out.setText("");
                    }
                    ispressed = false;
                    symvolo = "*";
                    apotelesma = "";
                }
            }
        });
        buttonD.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp1get==true) {
                    temp1=0;
                    temp2=0;
                    TextView out = (TextView) findViewById(R.id.editText);

                    if(check!="") {
                        temp1 = Double.parseDouble(out.getText().toString());
                        out.setText("");
                        check="";
                        turn = 1;
                        temp2get = true;
                    }
                    else{
                        temp1=0;
                        turn = 0;
                        temp2get = false;
                        out.setText("");
                    }
                    ispressed = false;
                    symvolo = "/";
                    apotelesma = "";
                }
            }
        });
        buttonT.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                out.append(".");
            }
        });
        buttonC.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);
                out.setText("");
                apotelesma = "";
                apotel = 0;
                temp1 = 0;
                temp2 = 0;
                temp2get = false;
                temp1get=false;
            }
        });


        buttonI.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView out = (TextView) findViewById(R.id.editText);

                if (symvolo == "+" && temp2get == true) {
                    if (ispressed == false) {
                        apotel =temp1+ temp2;
                        out.setText(Double.toString(apotel));
                        ispressed = true;

                    } else if (ispressed == true) {
                        apotel = apotel + temp2;
                        out.setText(Double.toString(apotel));
                    }

                }
                if (symvolo == "-" && temp2get == true) {
                    if (ispressed == false) {
                        apotel = temp1 - temp2;
                        out.setText(Double.toString(apotel));
                        ispressed = true;
                    } else if (ispressed == true) {
                        apotel = apotel - temp2;
                        out.setText(Double.toString(apotel));
                    }
                }


                if (symvolo == "*" && temp2get == true) {
                    if (ispressed == false) {
                        apotel = temp1 * temp2;
                        out.setText(Double.toString(apotel));
                        ispressed = true;
                    } else if (ispressed == true) {
                        apotel = apotel * temp2;
                        out.setText(Double.toString(apotel));
                    }
                }
                if (symvolo == "/" && temp2get == true) {

                    if (temp2 == 0) {
                        out.setText("Cannot Divide by Zero");
                    } else {
                        if (ispressed == false) {
                            out.setText(Double.toString(temp1 / temp2));
                            apotel = temp1 / temp2;
                            ispressed = true;
                        } else if (ispressed == true) {
                            apotel = apotel / temp2;
                            out.setText(Double.toString(apotel));
                        }
                    }

                }


                apotelesma = "" + apotel;
            }
        });
    }

    void gettemp2(String n) {
        TextView out = (TextView) findViewById(R.id.editText);

        if (apotelesma != "") {
            out.setText("");
            apotelesma = "";
        }
            out.append(n);
            check=out.getText().toString();
            temp2 = Double.parseDouble(out.getText().toString());
            turn = 0;
            temp2get=true;
        }

    }
