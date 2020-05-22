package com.example.android_kotlin_bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "로그띄우기"
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //바텀네비게이션 사용하기 위해 필요하다.
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        when (menuItem.itemId) {
            R.id.navigation_home-> {
                Log.d(TAG, "아이디 띄워 버리기! -> navigation_home")

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search  -> {
                Log.d(TAG, "아이디 띄워 버리기! -> navigation_search ")

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_message -> {
                Log.d(TAG, "아이디 띄워 버리기! -> navigation_message")

                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_profile -> {
                Log.d(TAG, "아이디 띄워 버리기! -> navigation_profile")
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

}
