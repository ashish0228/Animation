package com.example.ashish.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        menu.setQwertyMode(true);
        menu.add(1,1,1,"Rotation XML");
        menu.add(2,2,2,"Rotation Program");
        menu.add(3,3,3,"Scaling XML");
        menu.add(4,4,4,"Scaling Program");
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        ImageView imageView=(ImageView)findViewById(R.id.image1);
        switch (menuItem.getItemId())
        {
            case 1:
                Animation an= AnimationUtils.loadAnimation(this,R.anim.rotate);
                imageView.setImageResource(R.drawable.ab);
                imageView.startAnimation(an);

                return true;
            case 2:
                RotateAnimation rotateAnimation=new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotateAnimation.setDuration(5000);
                imageView.setImageResource(R.drawable.abc);
                imageView.startAnimation(rotateAnimation);
                return true;
            case 3:
                Animation scale=AnimationUtils.loadAnimation(this,R.anim.scalling);
                imageView.setImageResource(R.drawable.ab);
                imageView.startAnimation(scale);
                return true;
            case 4:
                ScaleAnimation scaleAnimation=new ScaleAnimation(1.0f,2.0f,1.0f,2.0f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                scaleAnimation.setDuration(5000);
                imageView.setImageResource(R.drawable.abc);
                imageView.startAnimation(scaleAnimation);
                return true;
            /*case 5:
                Animation at= AnimationUtils.loadAnimation(this,R.anim.trotate);
                imageView.setImageResource(R.drawable.ab);
                imageView.startAnimation(at);
                return true;*/
        }
        return false;
    }
}
