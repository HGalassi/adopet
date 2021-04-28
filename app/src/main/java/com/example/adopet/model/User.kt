package com.example.adopet.model

import com.example.adopet.enum.UserGender

abstract class User{
    abstract var name : String
    abstract var age :  Int
    abstract var gender : UserGender
    abstract var email : String
}