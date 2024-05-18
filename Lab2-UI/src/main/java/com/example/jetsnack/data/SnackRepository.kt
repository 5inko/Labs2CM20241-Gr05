package com.example.jetsnack.data

import com.example.jetsnack.model.Snack
import com.example.jetsnack.model.UsuarioSnack
import com.example.jetsnack.network.APIService

interface SnackRepository{
    suspend fun getSnacks(): List<Snack>
    suspend fun getUsers(): List<UsuarioSnack>
}

class NetworkSnackRepository(
    private val snackApiService: APIService
): SnackRepository {
    override suspend fun getSnacks(): List<Snack> = snackApiService.getSnacks()

    override suspend fun getUsers(): List<UsuarioSnack> = snackApiService.getUsers()
}