package com.example.mydoctor.doctor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mydoctor.R
import com.example.mydoctor.utils.Constants.RECEIVE_ID
import com.example.mydoctor.utils.Constants.SEND_ID


class MessagingAdapter: RecyclerView.Adapter<MessagingAdapter.MessageViewHolder>() {

    var messagesList = mutableListOf<Message>()


    inner class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       
        init {
            itemView.setOnClickListener {
                messagesList.removeAt(adapterPosition)
                notifyItemRemoved(adapterPosition)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.message_item, parent, false)
        
        val mess = itemView.findViewById<TextView>(R.id.tv_message)
        val  bot = itemView.findViewById<TextView>(R.id.tv_bot_message)
        
        return MessageViewHolder(itemView)
    }

    override fun getItemCount(): Int {
         return messagesList.size
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val currentMessage = messagesList[position]
        
        when(currentMessage.id){
            SEND_ID -> {
                holder.itemView.findViewById<TextView>(R.id.tv_message).apply { 
                    text = currentMessage.message
                    visibility = View.VISIBLE
                }
                holder.itemView.findViewById<TextView>(R.id.tv_bot_message).visibility = View.GONE
            }
            
            RECEIVE_ID -> {
                holder.itemView.findViewById<TextView>(R.id.tv_bot_message).apply {
                    text = currentMessage.message
                    visibility = View.VISIBLE
                }
                holder.itemView.findViewById<TextView>(R.id.tv_message).visibility = View.GONE
            }
        }
    }


    fun insertMessage(message: Message){
        this.messagesList.add(message)
        notifyItemInserted(messagesList.size)
    }
}