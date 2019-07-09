package android.example.appnumbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button checkBtn;
    EditText numbertxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBtn = findViewById(R.id.checkBtn);
        numbertxt = findViewById(R.id.number_txt);

    }


    class Number {

        //int number = Integer.parseInt(String.valueOf(numbertxt.getText()));

        double number = Double.parseDouble(numbertxt.getText().toString());

        public boolean isTriangular(){

            int x =1;

            int triangularNum = 1;

            while(triangularNum < number){
                x++;

                triangularNum = triangularNum + x;
            }

            if(triangularNum == number)
                return true;
            else
                return false;

        }


        public boolean isSqaure() {

            double squareRoot = Math.sqrt(number);

            if(squareRoot == Math.floor(squareRoot)){
                return true;
            }
            else{
                return false;
            }

        }


    }


    public void checkNum(View view) {

        if (numbertxt.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this,"Please input a number!", Toast.LENGTH_LONG).show();
        }
        else{
            Number myNum = new Number();

            myNum.number = Integer.parseInt(numbertxt.getText().toString());


            if (myNum.isTriangular() && myNum.isSqaure()) {
                Toast.makeText(MainActivity.this, myNum.number + " is a triangular and square number", Toast.LENGTH_LONG).show();
            } else if (myNum.isTriangular()) {
                Toast.makeText(MainActivity.this, myNum.number + " is a triangular number but not a square number", Toast.LENGTH_LONG).show();
            } else if (myNum.isSqaure()) {
                Toast.makeText(MainActivity.this, myNum.number + " is a square number but not a triangular number", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, myNum.number + " is neither a triangular or" +
                        " square number", Toast.LENGTH_LONG).show();
            }

        }
    }
}
