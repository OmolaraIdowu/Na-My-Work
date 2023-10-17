package kodecamp.android.na_my_work.ui.repo

import kodecamp.android.na_my_work.ui.model.UserEntity
interface UserRepository {
    suspend fun getUser(email: String, password: String): UserEntity?

    suspend fun getUserByEmail(email: String): UserEntity?

    suspend fun getUserByID(id: Int): UserEntity?

    suspend fun saveUser(userEntity: UserEntity) : Long

    suspend fun updateUser(user: UserEntity) : Int

    suspend fun deleteUser(user: UserEntity) : Int
}