package com.cvb.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class math2nov extends AppCompatActivity {

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

                Intent intent = new Intent(math2nov.this, PaperTwo.class);
                startActivity(intent);
                return true;

            case R.id.item1:

               intent = new Intent(math2nov.this, tips.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                Toast.makeText(this,"Mathematics additional questions", Toast.LENGTH_SHORT).show();
                intent = new Intent(math2nov.this, QMaths.class);
                startActivity(intent);
                return true;
            case R.id.item4:
                Toast.makeText(this,"Physical Science additional questions", Toast.LENGTH_SHORT).show();
                intent = new Intent(math2nov.this, QPhysics.class);
                startActivity(intent);
                return true;
            case R.id.item5:
                intent = new Intent(math2nov.this, aboutUs.class);
                startActivity(intent);
                return true;
            case R.id.item6:
                intent = new Intent(math2nov.this, MainActivity.class);
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
        setContentView(R.layout.activity_math2nov);

        PDFView pdfview = findViewById(R.id.pdfview);
        pdfview.fromAsset("math2n.pdf").load();

    }
}