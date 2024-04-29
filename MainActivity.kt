package com.example.imadassignment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

            private var petHealth = 100
            private var petHunger = 50
            private var petCleanLiness = 50

            @SuppressLint("MissingInflatedId")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main
                )
                // Get the button and text view
                val btn_feed = findViewById<Button>(R.id.btn_feed)
                val btn_clean = findViewById<Button>(R.id.btn_clean)
                val btnHappy = findViewById<Button>(R.id.btn_happy)
                val txtHunger = findViewById<EditText>(R.id.txt_hunger)
                val txtClean = findViewById<EditText>(R.id.txt_clean)
                val txtHappy = findViewById<EditText>(R.id.txt_happy)
                val petImage = findViewById<ImageView>(R.id.petimage)

                // Set the initial text values
                txtHunger.setText(petHunger.toString())
                txtClean.setText(petCleanLiness.toString())
                txtHappy.setText(petHealth.toString())

                // Handle button clicks
                btn_feed.setOnClickListener {
                    petHunger -= 10
                    petHealth += 10
                    petHunger += 5
                    txtHunger.setText(petHunger.toString())
                    animateImageChange(petImage, R.drawable.feaddog)
                }

                btn_clean.setOnClickListener {
                    petCleanLiness += 10
                    petHealth += 10
                    txtClean.setText(petCleanLiness.toString())
                    animateImageChange(petImage, R.drawable.clean_dog)
                }

                btnHappy.setOnClickListener {
                    petHealth += 10
                    petHunger += 5
                    petCleanLiness -= 5
                    txtHappy.setText(petHealth.toString())
                    animateImageChange(petImage, R.drawable.happydog)
                }
            }

            private fun animateImageChange(imageView: ImageView, newImageResource: Int) {
                val animation = AlphaAnimation(0.0f, 1.0f)
                animation.duration = 500
                animation.fillAfter =true
                imageView.startAnimation(animation)
                imageView.setImageResource(newImageResource)
            }
        }