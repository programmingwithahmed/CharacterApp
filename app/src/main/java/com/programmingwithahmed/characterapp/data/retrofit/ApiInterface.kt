package com.programmingwithahmed.characterapp.data.retrofit

import com.programmingwithahmed.characterapp.data.model.Character
import com.programmingwithahmed.characterapp.data.model.CharactersResponse

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("character")
    fun getAllCharacters(): Call<CharactersResponse>

    @GET("character/{id}")
    fun getOneCharacter(@Path("id") id: String): Call<Character>

}