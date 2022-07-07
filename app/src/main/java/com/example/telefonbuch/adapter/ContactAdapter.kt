package com.example.telefonbuch.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telefonbuch.R
import com.example.telefonbuch.model.Contact

class ContactAdapter(
  private val contactList: List<Contact>
) : RecyclerView.Adapter<ContactAdapter.ItemViewHolder>() {

  class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView = view.findViewById(R.id.bild_name_text)
    val textView1: TextView = view.findViewById(R.id.telefonnummer_text)
    val imageView: ImageView = view.findViewById(R.id.contact_image)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

    val adapterLayout = LayoutInflater.from(parent.context)
      .inflate(R.layout.list_item, parent, false)

    return ItemViewHolder(adapterLayout)
  }

  override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    val currentContact = contactList[position]
    holder.textView.text = currentContact.name
    holder.textView1.text = currentContact.nummer
    holder.imageView.setImageResource(R.drawable.bild1)
  }

  override fun getItemCount(): Int {
    return contactList.size
  }
}

