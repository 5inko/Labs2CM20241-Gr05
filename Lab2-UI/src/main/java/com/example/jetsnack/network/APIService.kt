package com.example.jetsnack.network

import com.example.jetsnack.model.Snack
import com.example.jetsnack.model.UsuarioSnack
import retrofit2.http.GET

interface APIService {
    @GET("get-snacks")
    suspend fun getSnacks(): List<Snack>

    @GET("get-users")
    suspend fun getUsers(): List<UsuarioSnack>
}