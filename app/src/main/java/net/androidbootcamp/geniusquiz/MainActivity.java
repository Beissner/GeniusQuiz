package net.androidbootcamp.geniusquiz;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public int incorrect =0;
    public int correct =0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void firstQuestion(View view)
    {
        //button reference variables
        Button button11 = (Button) findViewById(R.id.btn1_1);
        Button button12 = (Button) findViewById(R.id.btn1_2);
        Button button13 = (Button) findViewById(R.id.btn1_3);

        //incorrect button
        if (button11.isPressed() || button13.isPressed())
        {
            button11.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button13.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button12.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);

            //button11.setBackgroundColor(0xFFFF0000);      //this messes up button style (changes look)

            incorrect++;
        }

        //correct button
        if (button12.isPressed())
        {
             button12.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            correct++;
        }
    }

    public void secondQuestion(View view)
    {
        Button button21 = (Button) findViewById(R.id.btn2_1);
        Button button22 = (Button) findViewById(R.id.btn2_2);
        Button button23 = (Button) findViewById(R.id.btn2_3);

        if (button21.isPressed() || button22.isPressed())
        {
            button21.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button22.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button23.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);

            incorrect++;
        }
        else
        {
            button23.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            correct++;
        }

    }

    public void thirdQuestion(View view)
    {
        //reference variables
        Button button31 = (Button) findViewById(R.id.btn3_1);
        Button button32 = (Button) findViewById(R.id.btn3_2);

        if(button32.isPressed())
        {
            button31.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            button32.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            incorrect++;
        }
        else
        {
            button31.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            correct++;
        }
    }

    public void fourthQuestion(View view)
    {
        //reference variables
        Button button41 = (Button) findViewById(R.id.btn4_1);
        Button button42 = (Button) findViewById(R.id.btn4_2);
        Button button43 = (Button) findViewById(R.id.btn4_3);

        if (button42.isPressed() || button43.isPressed())
        {
            button42.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button43.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button41.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            incorrect++;
        }
        else
        {
            button41.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            correct++;
        }
    }

    public void fifthQuestion(View view)
    {
        //button reference variables
        Button button51 = (Button) findViewById(R.id.btn5_1);
        Button button52 = (Button) findViewById(R.id.btn5_2);
        Button button53 = (Button) findViewById(R.id.btn5_3);

        if(button52.isPressed() || button53.isPressed())
        {
            button52.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button53.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button51.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            incorrect++;
        }
        else
        {
            button51.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            correct++;
        }
    }

    public void sixthQuestion(View view)
    {
        //button variables
        Button button61 = (Button) findViewById(R.id.btn6_1);
        Button button62 = (Button) findViewById(R.id.btn6_2);
        Button button63 = (Button) findViewById(R.id.btn6_3);

        if (button61.isPressed() || button63.isPressed())
        {
            button61.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button63.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button62.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            incorrect++;
        }
        else
        {
            button62.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            correct++;
        }
    }

    public void seventhQuestion(View view)
    {
        //button reference variables
        Button button71 = (Button) findViewById(R.id.btn7_1);
        Button button72 = (Button) findViewById(R.id.btn7_2);
        Button button73 = (Button) findViewById(R.id.btn7_3);

        if (button71.isPressed() || button73.isPressed())
        {
            button71.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button73.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button72.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            incorrect++;
        }
        else
        {
            button72.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            correct++;
        }
    }

    public void eighthQuestion(View view)
    {
        //button reference variables
        Button button81 = (Button) findViewById(R.id.btn8_1);
        Button button82 = (Button) findViewById(R.id.btn8_2);
        Button button83 = (Button) findViewById(R.id.btn8_3);

        if (button81.isPressed() || button82.isPressed())
        {
            button81.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button82.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button83.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            incorrect++;
        }
        else
        {
            button83.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            correct++;
        }
    }

    public void ninthQuestion(View view)
    {
        //button reference variables
        Button button91 = (Button) findViewById(R.id.btn9_1);
        Button button92 = (Button) findViewById(R.id.btn9_2);

        if (button91.isPressed())
        {
            button91.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button92.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            incorrect++;
        }
        else
        {
            button92.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            correct++;
        }
    }

    public void tenthQuestion(View view)
    {
        //button reference variables
        Button button101 = (Button) findViewById(R.id.btn10_1);
        Button button102 = (Button) findViewById(R.id.btn10_2);
        Button button103 = (Button) findViewById(R.id.btn10_3);

        if (button102.isPressed() || button103.isPressed())
        {
            button102.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button103.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
            button101.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);

            incorrect++;
        }
        else
        {
            button101.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            correct++;
        }

    }

    public void submitButton(View view)
    {
        //variable
        String result;

        if (correct > 8)
        {
            result = "You're a genius!";
        }
        else if (correct > 6)
        {
            result = "You're pretty smart!";
        }
        else if (correct > 4)
        {
            result = "You know some stuff!";
        }
        else if (correct > 2)
        {
            result = "You should study some trivia.";
        }
        else if (correct > 0)
        {
            result = "Maybe go back to school?";
        }
        else
        {
            result = "Sorry. You need to rethink your life.";
        }


        //toast message showing results
        CharSequence text = result +"\nYou got " + correct + " correct.\n" + "You got " + incorrect + " incorrect.";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(this, text, duration);      //instantiate Toast object with makeText methods - this method takes in 3 parameters
        toast.show();
    }


}
