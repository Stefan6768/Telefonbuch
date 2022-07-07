package com.example.telefonbuch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.telefonbuch.adapter.ContactAdapter
import com.example.telefonbuch.data.Datasource
import com.example.telefonbuch.databinding.ActivityMainBinding
import com.example.telefonbuch.model.Contact


class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    val contact = Datasource().loadContacts()

    binding.recyclerView.adapter = ContactAdapter(contact)

    binding.saveButton2.setOnClickListener {
      val name = binding.nameTextEdit.text.toString()
      val nummer = binding.telefonnummerTextEdit.text.toString()

      if(name != "" && nummer != "") {
        contact.add(Contact(name, nummer))
      }

    }
  }
}
