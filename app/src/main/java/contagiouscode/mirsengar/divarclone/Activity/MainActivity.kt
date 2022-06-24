package contagiouscode.mirsengar.divarclone.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import Fragment.AccountFragment
import Fragment.AdvFragment
import Fragment.CatFragment
import Fragment.HomeFragment
import contagiouscode.mirsengar.divarclone.R

class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState : Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)
          var nav_buttom =
                    findViewById<BottomNavigationView>(R.id.nav_main_navigation) //باتن نویگیشن رو کست کردیم
          ///////////////////
//      اینجا تبهای باتن نویگیشن میباشد
          ///////////////////
          val homeFragment = HomeFragment()
          val catFragment = CatFragment()
          val advFragment = AdvFragment()
          val accountFragment = AccountFragment()
//      خط پایین یعنی فرگمنت از هوم فرگمنت اغاز بشه
          createFragment(homeFragment)
//      مقادیر بایتها رو مقدار دهی کردیم
          nav_buttom.setOnNavigationItemSelectedListener {
               when (it.itemId) {
                    R.id.tab_cat       -> createFragment(catFragment)
                    R.id.tab_circle    -> createFragment(advFragment)
                    R.id.tab_myAccount -> createFragment(accountFragment)
                    R.id.tab_home      -> createFragment(homeFragment)
               }
               true
          }
     }
     fun createFragment(fragment : Fragment) {
          var transAction = manager.beginTransaction()
          transAction.replace(R.id.container , fragment)
          transAction.commit()
     }
}
