package com.myweb.ass6
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ass6.R

import kotlinx.android.synthetic.main.fragment_one.view.*

class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)

        return view
    }

    fun replaceFragment(someFragment: Fragment) {
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLayout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}



