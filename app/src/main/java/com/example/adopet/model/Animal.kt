package com.example.adopet.model

import com.example.adopet.enum.AnimalSize
import com.example.adopet.enum.AnimalType

abstract class Animal {
    abstract val name: String
    abstract val age: Int
    abstract val gender: String
    abstract var isAlreadyAvailable: Boolean
    abstract var breeder: Breeder
    abstract var castrated: Boolean
    abstract var size: AnimalSize
}
