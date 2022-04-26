package com.example.codeacademy.multitask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button2.setOnClickListener {

            var t1 = myThread()
            t1.start()

        }

    }


    inner class myThread:Thread()
    {
        override fun run() {
            var result = 0

            for (item in 1..2000000000)
            {
                result = result + item
            }

            runOnUiThread {
                textView2.text = result.toString()
            }

        }
    }

}
