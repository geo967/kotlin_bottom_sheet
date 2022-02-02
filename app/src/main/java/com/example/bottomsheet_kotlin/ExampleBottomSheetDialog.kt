package com.example.bottomsheet_kotlin

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.util.zip.Inflater

class ExampleBottomSheetDialog(c: Context):BottomSheetDialogFragment() {

    lateinit var mListener:BottomSheetListener

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val v:View=LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout,container,false)

        val button: Button =v.findViewById(R.id.buttonShare_id)
        button.setOnClickListener {
            Toast.makeText(context,"share",Toast.LENGTH_SHORT).show()
            mListener.onButtonClicked("Share button Clicked")
        }
        return v
    }

    interface BottomSheetListener{
        fun onButtonClicked(text:String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mListener=context as BottomSheetListener
    }
}