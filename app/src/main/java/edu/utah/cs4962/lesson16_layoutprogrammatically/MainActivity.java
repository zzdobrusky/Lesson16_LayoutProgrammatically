package edu.utah.cs4962.lesson16_layoutprogrammatically;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.view.ViewGroup.LayoutParams;


public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // creating LinearLayout
        LinearLayout linLayout = new LinearLayout(this);

        // specifying vertical orientation
        linLayout.setOrientation(LinearLayout.VERTICAL);

        // creating LayoutParams
        LayoutParams linLayoutParam = new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);

        LayoutParams lpViewParam = new LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);

        // Creating TextView view
        TextView tv = new TextView(this);
        tv.setText("TextView");
        tv.setLayoutParams(lpViewParam);
        linLayout.addView(tv); //, lpViewParam);

        // Creating Button view
        Button btn = new Button(this);
        btn.setText("Button");
        linLayout.addView(btn, lpViewParam);

        LinearLayout.LayoutParams leftMarginParams = new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        leftMarginParams.leftMargin = 50;

        Button btn1 = new Button(this);
        btn1.setText("Button1");
        linLayout.addView(btn1, leftMarginParams);

        LinearLayout.LayoutParams rightGravityParams = new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        rightGravityParams.gravity = Gravity.RIGHT;

        Button btn2 = new Button(this);
        btn2.setText("Button2");
        linLayout.addView(btn2, rightGravityParams);

        // set LinearLayout as a root element of the screen
        setContentView(linLayout, linLayoutParam);
    }

}
