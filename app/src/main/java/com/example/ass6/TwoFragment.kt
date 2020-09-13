package com.example.as6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.ass6.R
import com.myweb.ass6.OneFragment

import kotlinx.android.synthetic.main.fragment_two.view.*

class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        view.btnClickFragTwo.setOnClickListener(){
            var fragment: Fragment? = null
            fragment = OneFragment()
            replaceFragment(fragment)
        }
        return view
    }
    fun replaceFragment(someFragment: Fragment){
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLayout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}