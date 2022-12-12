package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button= findViewById<Button>(R.id.button)
        button.setOnClickListener {
            //Family Member
            val edittext1= findViewById<EditText>(R.id.editTextTextPersonName)
            var msg1= edittext1.text.toString().toInt()
            if (msg1>5){
                msg1=2
            }
            if (msg1==5){
                msg1=4
            }
            if (msg1==4){
                msg1=6
            }
            if (msg1==3){
                msg1=8
            }
            if (msg1==2){
                msg1=10
            }
            if (msg1==1){
                msg1=12
            }
            //Water consumption
            val edittext2= findViewById<EditText>(R.id.editTextTextPersonName3)
            val msg2= edittext2.text.toString().toInt()
            var temp3=0
            if (msg2>0&&msg2<=20){
                temp3=2
            }
            else if (msg2>20){
                temp3=3
            }

            // transportation
            val edittext3= findViewById<EditText>(R.id.editTextTextPersonName2)
            val msg3= edittext3.text.toString().toInt()
            var temp=0
            if (msg3==1){
                temp=4
            }
            if (msg3==2){
                temp=4
            }
            if (msg3==3){
                temp=4
            }
            if (msg3==4){
                temp=4
            }
            else {
                temp = 12
            }
            //Garbage
            val edittext4= findViewById<EditText>(R.id.editTextTextPersonName4)
            val msg4= edittext4.text.toString().toInt()
            var temp1=0
            if (msg4<=1){
                temp1=5
            }
            if (msg4>=2){
                temp1=20
            }
            if (msg4>=3){
                temp1=40
            }
            if (msg4>=4){
                temp1=50
            }



            val msg=msg1+temp3+temp+temp1
            val result=msg.toString()

            val intent = Intent(this,Result::class.java)
            intent.putExtra("MSG",result)
            startActivity(intent)
        }


    }
}