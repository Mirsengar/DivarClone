package contagiouscode.mirsengar.divarclone.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import contagiouscode.mirsengar.divarclone.R
import java.util.*
import kotlin.concurrent.timerTask

class SplashScreenActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState : Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_splash_screen)
          var timer = Timer()
          timer.schedule(timerTask {
               var intent = Intent(applicationContext , MainActivity::class.java)
               finish()
               cancel()
               startActivity(intent)
          } , 3000 , 1000)
     }
}