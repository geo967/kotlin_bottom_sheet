package com.example.bottomsheet_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.example.bottomsheet_kotlin.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity(),ExampleBottomSheetDialog.BottomSheetListener {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val button: Button =findViewById(R.id.button_id)

      /*  button.setOnClickListener {
            val bottomSheetDialog=BottomSheetDialog(this,R.style.BottomSheetDialogTheme)

            val bottomSheetView=LayoutInflater.from(this).inflate(
                R.layout.bottom_sheet_layout, findViewById<LinearLayout>(R.id.bottomSheet))

            bottomSheetView.findViewById<View>(R.id.buttonShare_id).setOnClickListener {
                Toast.makeText(this,"Share....",Toast.LENGTH_SHORT).show()
                bottomSheetDialog.dismiss()
            }
            bottomSheetDialog.setContentView(bottomSheetView)

          *//*  val bottomSheetBehavior=BottomSheetBehavior.from(bottomSheetView)
            bottomSheetBehavior.isFitToContents=false
            bottomSheetBehavior.halfExpandedRatio=.3f*//*
            bottomSheetDialog.show()

            *//*val bottomSheetDialog=BottomSheetDialog(this)
            bottomSheetDialog.setContentView(R.layout.bottom_sheet_layout)

            bottomSheetDialog.show()*//*


        }*/

        button.setOnClickListener {
            val bottomSheet=ExampleBottomSheetDialog(this)
            bottomSheet.show(supportFragmentManager,"example_bottom_sheet")
        }
    }

    override fun onButtonClicked(text: String) {
        binding.textId.text=text
    }
}