package com.example.adopet.model

import com.example.adopet.enum.AnimalSize
import com.example.adopet.enum.AnimalType

data class Cat (

    private val isFiv : Boolean,
    private val isFelv : Boolean,
    override val name: String,
    override val age: Int,
    override val gender: String,
    override var isAlreadyAvailable: Boolean,
    override var breeder: Breeder,
    override var castrated: Boolean,
    override var size: AnimalSize
) : Animal()