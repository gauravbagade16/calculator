package com.example.new_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    ImageView btn_dot, btn_equal, btn_ac, btn_module, btn_plus, btn_minus, btn_multiplication;


    EditText inputTxt;


    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputTxt = findViewById(R.id.inputTxt);


        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_dot = findViewById(R.id.btn_dot);
        btn_equal = findViewById(R.id.btn_equal);
        btn_ac = findViewById(R.id.btn_ac);
        btn_module = findViewById(R.id.btn_module);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiplication = findViewById(R.id.btn_multiplication);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + "0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + "9");
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText("");
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxt.setText(inputTxt.getText() + ".");
            }
        });


        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputTxt == null) {
                    inputTxt.setText("");
                } else {
                    mValueOne = Float.parseFloat(inputTxt.getText() + "");
                    mAddition = true;
                    inputTxt.setText(null);
                }
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputTxt == null) {
                    inputTxt.setText("");
                } else {
                    mValueOne = Float.parseFloat(inputTxt.getText() + "");
                    mSubtract = true;
                    inputTxt.setText(null);
                }
            }
        });
        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputTxt == null) {
                    inputTxt.setText("");
                } else {
                    mValueOne = Float.parseFloat(inputTxt.getText() + "");
                    mMultiplication = true;
                    inputTxt.setText(null);
                }
            }
        });
        btn_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputTxt == null) {
                    inputTxt.setText("");
                } else {
                    mValueOne = Float.parseFloat(inputTxt.getText() + "");
                    mDivision = true;
                    inputTxt.setText(null);
                }
            }
        });


        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(inputTxt.getText() + "");

                if (mAddition == true) {
                    inputTxt.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if (mSubtract == true) {
                    inputTxt.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    inputTxt.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    inputTxt.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }

            }
        });





    }
}