package com.example.androidprojekt

import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val john: ImageView = findViewById(R.id.john)
        val Bred: ToggleButton = findViewById(R.id.Bred)
        val Bblue: ToggleButton = findViewById(R.id.Bblue)
        val Bgreen: ToggleButton = findViewById(R.id.Bgreen)

        Bred.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                john.setColorFilter(null);
                Bblue.setChecked(false);
                Bgreen.setChecked(false);

                john.setColorFilter(resources.getColor(R.color.redColor));
            } else {
                john.setColorFilter(null);
                //Bblue.setChecked(false);
                //Bgreen.setChecked(false);
            }
        }

        Bblue.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                john.setColorFilter(null);
                Bred.setChecked(false);
                Bgreen.setChecked(false);

                john.setColorFilter(resources.getColor(R.color.blueColor));
            } else {
                john.setColorFilter(null);
                //Bred.setChecked(false);
                //Bgreen.setChecked(false);
            }
        }

        Bgreen.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                john.setColorFilter(null);
                Bblue.setChecked(false);
                Bred.setChecked(false);

                john.setColorFilter(resources.getColor(R.color.greenColor));
            } else {
                john.setColorFilter(null);
                //Bblue.setChecked(false);
                //Bred.setChecked(false);
            }
        }


    }
}