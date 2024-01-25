package com.example.mydoctor.doctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mydoctor.R
import com.example.mydoctor.utils.BotResponse
import com.example.mydoctor.utils.Constants.RECEIVE_ID
import com.example.mydoctor.utils.Constants.SEND_ID
import com.example.mydoctor.utils.Time
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ResumeSession : AppCompatActivity() {

    private lateinit var rv_mess: RecyclerView
    private lateinit var layout: LinearLayout
    private lateinit var et_mess: EditText
    private lateinit var adapter: MessagingAdapter
    private lateinit var send: ImageView
    private val botList = listOf("Dr.Lucy", "Dr.Alexina", "Dr.Ali", "Dr.John","Dr.Anne")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume_session)

        rv_mess = findViewById(R.id.rv_messages)
        et_mess = findViewById(R.id.et_message)
        send = findViewById(R.id.btn_send)

        recyclerView()

        clickEvents()

        val random = (0..3).random()
        customBotMessage("Hello! and Welcome! Today you're speaking with ${botList[random]}, how are you doing?")
    }

    private fun clickEvents(){
        send.setOnClickListener {
            sendMessage()
        }
        et_mess.setOnClickListener {
            GlobalScope.launch {
                delay(100)
                withContext(Dispatchers.Main){
                    rv_mess.scrollToPosition(adapter.itemCount -1)
                }
            }
        }
    }

    private fun recyclerView(){
        adapter = MessagingAdapter()
        rv_mess.adapter = adapter
        rv_mess.layoutManager = LinearLayoutManager(applicationContext)
    }
    private fun sendMessage(){
        val message = et_mess.text.toString()
        val timestamp = Time.timeStamp()
        if (message.isNotEmpty()){
            et_mess.setText("")
            adapter.insertMessage(Message(message, SEND_ID, timestamp))
            rv_mess.scrollToPosition(adapter.itemCount -1)

            botResponse(message)
        }
    }

    private fun botResponse(message: String){
        val timestamp = Time.timeStamp()
        GlobalScope.launch {
            delay(1000)

            withContext(Dispatchers.Main){
                val response = BotResponse.basicResponses(message)

                adapter.insertMessage(Message(response, RECEIVE_ID, timestamp))
                rv_mess.scrollToPosition(adapter.itemCount -1)
            }
        }

    }

    override fun onStart() {
        super.onStart()
        GlobalScope.launch {
            delay(1000)
            withContext(Dispatchers.Main){
                rv_mess.scrollToPosition(adapter.itemCount -1)
            }
        }
    }
    private fun customBotMessage(message: String) {
        GlobalScope.launch {
            delay(1000)
            withContext(Dispatchers.Main){
                val timestamp = Time.timeStamp()
                adapter.insertMessage(com.example.mydoctor.doctor.Message(message, RECEIVE_ID, timestamp))
                rv_mess.scrollToPosition(adapter.itemCount -1)
            }
        }

    }

}