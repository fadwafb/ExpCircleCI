package com.example.fadwa.expcircleci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final FrameLayout main = (FrameLayout)findViewById(R.id.main);

        final int numViews = 5;
       final String[] menuItems = {"changer mot de passe", "remplir formulaire","dsssssss","ssaqsjkfds","fgfgzqq"};
        for(int i = 0; i < numViews; i++)
        {
            // Create some quick TextViews that can be placed.
            TextView v = new TextView(this);

            // Set a text and center it in each view.
            v.setText(menuItems[i]);

            v.setGravity(Gravity.CENTER);
            v.setBackgroundColor(0xffff0000);
            // Force the views to a nice size (150x100 px) that fits my display.
            // This should of course be done in a display size independent way.
            FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(150, 100);
            // Place all views in the center of the layout. We'll transform them
            // away from there in the code below.
            lp.gravity = Gravity.CENTER;
            // Set layout params on view.
            v.setLayoutParams(lp);

            // Calculate the angle of the current view. Adjust by 90 degrees to
            // get View 0 at the top. We need the angle in degrees and radians.
            float angleDeg = i * 360.0f / numViews - 90.0f;
            float angleRad = (float)(angleDeg * Math.PI / 180.0f);
            // Calculate the position of the view, offset from center (300 px from
            // center). Again, this should be done in a display size independent way.
            v.setTranslationX(300 * (float)Math.cos(angleRad));
            v.setTranslationY(300 * (float)Math.sin(angleRad));
            // Set the rotation of the view.
            v.setRotation(angleDeg + 90.0f);
            main.addView(v);
        }


    }}