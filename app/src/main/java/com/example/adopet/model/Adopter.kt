package com.example.adopet.model

import com.example.adopet.enum.AnimalType
import com.example.adopet.enum.UserGender

/*
    O adotante possui outros animais?
    O adotante aceitou os termos de adocao?
    O adotante tem preferencia por notificacoes de algum Animal?
 */

data class Adopter (var hasOtherAnimals : Boolean,
                    var isAdoptionConditionAccepted : Boolean,
                    var adoptersPreferenceAnimalType : AnimalType,
                    override var name: String,
                    override var age: Int,
                    override var email: String,
                    override var gender: UserGender
) : User()

