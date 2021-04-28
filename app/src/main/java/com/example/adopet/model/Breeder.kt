package com.example.adopet.model

import com.example.adopet.enum.AnimalType
import com.example.adopet.enum.UserGender

data class Breeder (
    var institutionName : String,
    val typeOfAnimals: ArrayList<AnimalType> = ArrayList(),
    var totalOfAnimals : Int,
    override var name: String,
    override var age: Int,
    override var gender: UserGender,
    override var email: String
) : User()
