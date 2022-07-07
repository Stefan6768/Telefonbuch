package com.example.telefonbuch.data

import com.example.telefonbuch.model.Contact

class Datasource() {
  fun loadContacts(): MutableList<Contact> {
    return mutableListOf(
      Contact("Bernd", "01722305876"),
      Contact("Uwe", "01745679807"),
      Contact("Sabine", "01765432892"),
      Contact("Birgitt", "01756748390"),
      Contact("Susanne", "017965423190")
    )


  }
}