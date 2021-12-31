package com.cvb.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, PaperTwo.class);
                startActivity(intent);
                finish();
            }
        },1000);
    }
}
/*<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"

    tools:context=".PaperTwo"
    >

    <Button
        android:id="@+id/maths2"
        android:layout_width="272dp"
        android:layout_height="wrap_content"
        android:text="1.Mathematics"
        android:layout_marginTop="180dp"
        android:background="@drawable/circle"
        android:textColor="@color/black"
        android:layout_marginLeft="50dp"
        />
    <Button
        android:id="@+id/physics2"
        android:layout_width="272dp"
        android:layout_height="wrap_content"
        android:text="2.Physical Sciences"
        android:background="@drawable/circle"
        android:layout_marginTop="40dp"
        android:textColor="@color/black"
        android:layout_marginLeft="50dp"
        />



</LinearLayout>*/

/*<RelativeLayout
        android:layout_width="286dp"
        android:layout_height="105dp"
        android:layout_gravity="center"


        >

        <androidx.cardview.widget.CardView

            android:id="@+id/card1"
            android:layout_width="220dp"
            android:layout_height="49dp"
            android:layout_marginStart="30dp"
            android:layout_marginTop="30dp"
            android:layout_marginEnd="30dp"
            android:layout_marginBottom="30dp"
            app:cardBackgroundColor="@color/skyblue"
            app:cardCornerRadius="15dp"

            >

            <TextView
                android:layout_width="127dp"
                android:layout_height="wrap_content"
                android:layout_marginLeft="80dp"


                android:layout_marginTop="18dp"
                android:text="Mathematics"
                android:textColor="@color/white" />


            <ImageView
                android:id="@+id/imageView1"
                android:layout_width="54dp"
                android:layout_height="39dp"
                android:layout_marginTop="4dp"
                android:layout_marginLeft="10dp"
                app:srcCompat="@drawable/mathsicon" />

        </androidx.cardview.widget.CardView>

    </RelativeLayout>

    <RelativeLayout
        android:layout_width="286dp"
        android:layout_height="105dp"
        android:layout_gravity="center">

        <androidx.cardview.widget.CardView

            android:id="@+id/card2"
            android:layout_width="220dp"
            android:layout_height="49dp"
            android:layout_marginStart="30dp"
            android:layout_marginTop="30dp"
            android:layout_marginEnd="30dp"
            android:layout_marginBottom="30dp"
            app:cardBackgroundColor="@color/skyblue"
            app:cardCornerRadius="15dp">

            <TextView
                android:layout_width="127dp"
                android:layout_height="wrap_content"
                android:layout_marginLeft="80dp"

                android:layout_marginTop="18dp"

                android:text="Physical Sciences"

                android:textColor="@color/white" />


            <ImageView
                android:id="@+id/imageView2"
                android:layout_width="54dp"
                android:layout_height="39dp"
                android:layout_marginTop="4dp"
                android:layout_marginLeft="10dp"
                app:srcCompat="@drawable/phyicon" />

        </androidx.cardview.widget.CardView>
    </RelativeLayout>

    <RelativeLayout
        android:layout_width="286dp"
        android:layout_height="105dp"
        android:layout_gravity="center">

        <androidx.cardview.widget.CardView

            android:id="@+id/card3"
            android:layout_width="220dp"
            android:layout_height="49dp"
            android:layout_marginStart="30dp"
            android:layout_marginTop="30dp"
            android:layout_marginEnd="30dp"
            android:layout_marginBottom="30dp"
            app:cardBackgroundColor="@color/skyblue"
            app:cardCornerRadius="15dp">

            <TextView
                android:layout_width="126dp"
                android:layout_height="wrap_content"
                android:layout_marginLeft="80dp"

                android:layout_marginTop="18dp"

                android:text="About Us"

                android:textColor="@color/white" />


        </androidx.cardview.widget.CardView>
    </RelativeLayout>*/