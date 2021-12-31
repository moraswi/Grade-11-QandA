package com.cvb.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class PhysicsScreen extends AppCompatActivity {

    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.grade_11,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item0:

                Intent intent = new Intent(PhysicsScreen.this, PaperTwo.class);
                startActivity(intent);
                return true;

            case R.id.item1:

                intent = new Intent(PhysicsScreen.this, tips.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                Toast.makeText(this,"Mathematics additional questions", Toast.LENGTH_SHORT).show();
                intent = new Intent(PhysicsScreen.this, QMaths.class);
                startActivity(intent);
                return true;
            case R.id.item4:
                Toast.makeText(this,"Physical Science additional questions", Toast.LENGTH_SHORT).show();
                intent = new Intent(PhysicsScreen.this, QPhysics.class);
                startActivity(intent);
                return true;
            case R.id.item5:
                intent = new Intent(PhysicsScreen.this, aboutUs.class);
                startActivity(intent);
                return true;
            case R.id.item6:
                intent = new Intent(PhysicsScreen.this, MainActivity.class);
                startActivity(intent);
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_screen);

        imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysicsScreen.this, physicspdf2n.class );
                startActivity(intent);
            }
        });

        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysicsScreen.this, physicspdf2s.class);
                startActivity(intent);
            }
        });

        imageView4 = findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysicsScreen.this, phy2019jp1.class );
                startActivity(intent);
            }
        });

        imageView5 = findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysicsScreen.this, phy2019sp1.class);
                startActivity(intent);
            }
        });

        imageView6 = findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhysicsScreen.this,"QP is not available", Toast.LENGTH_LONG).show();
            }
        });

        imageView7 = findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhysicsScreen.this,"QP is not available", Toast.LENGTH_LONG).show();
            }
        });
    }
}