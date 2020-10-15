package com.example.splashscren

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro
import com.github.appintro.AppIntro2
import com.github.appintro.AppIntroFragment



class MyAppIntroActivity : AppIntro() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Make sure you don't call setContentView!

        // Call addSlide passing your Fragments.
        // You can use AppIntroFragment to use a pre-built fragment

        isColorTransitionsEnabled = true
        addSlide(

                AppIntroFragment.newInstance(
                title = "The title of your slide page 1",
                description = "A description that will be shown on the bottom",
            /*    imageDrawable = R.drawable.the_central_icon,
                backgroundDrawable = R.drawable.the_background_image,*/

                titleColor = Color.WHITE,
                        imageDrawable = R.drawable.image,
                descriptionColor = Color.WHITE,
                backgroundColor = R.color.splash_background_color1,
               /* titleTypefaceFontRes = R.font.opensans_regular,
                descriptionTypefaceFontRes = R.font.opensans_regular,*/
        ))


        addSlide(AppIntroFragment.newInstance(
                title = "...Let's get started! page 2",
                titleColor = Color.WHITE,
                descriptionColor = Color.WHITE,
                backgroundColor = R.color.splash_background_color1,
                description = "This is the last slide, I won't annoy you more :)"
        ))


        addSlide(AppIntroFragment.newInstance(
                title = "...Let's get started! page 3",
                titleColor = Color.WHITE,
                descriptionColor = Color.WHITE,
                backgroundColor = R.color.splash_background_color1,
                description = "This is the last slide, I won't annoy you more :)"
        ))
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        // Decide what to do when the user clicks on "Skip"
        finish()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        // Decide what to do when the user clicks on "Done"
        finish()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}