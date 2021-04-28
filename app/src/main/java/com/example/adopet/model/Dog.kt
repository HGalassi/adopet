package com.example.adopet.model

import com.example.adopet.enum.AnimalSize

data class Dog (
    override val name: String,
    override val age: Int,
    override val gender: String,
    override var isAlreadyAvailable: Boolean,
    override var breeder: Breeder,
    override var castrated: Boolean,
    override var size: AnimalSize
) : Animal()