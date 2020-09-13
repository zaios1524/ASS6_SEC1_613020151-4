package com.example.ass6


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.as6.ThreeFragment
import com.example.as6.TwoFragment
import com.myweb.ass6.OneFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState==null) {
            supportFragmentManager.beginTransaction().add(
                R.id.frameLayout, OneFragment()
            ).commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        when(item?.itemId) {

            R.id.menu2 -> {
                transaction.replace(R.id.frameLayout, TwoFragment())
                transaction.addToBackStack(null)
                transaction.commit()
                return true }
            R.id.menu3 -> {
                transaction.replace(R.id.frameLayout, ThreeFragment())
                transaction.addToBackStack(null)
                transaction.commit()
                return true }
            else ->  return super.onOptionsItemSelected(item)
        }

    }
}
