package kodecamp.android.na_my_work.ui.repo

import kodecamp.android.na_my_work.ui.data.UserDao
import kodecamp.android.na_my_work.ui.model.UserEntity
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : UserRepository {
    override suspend fun getUser(email: String, password: String): UserEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getUserByEmail(email: String, password: String): UserEntity? {
        val user = userDao.getUserByEmail(email)
        return if (user != null && user.password == password) user else null
    }
    override suspend fun saveUser(userEntity: UserEntity) {
        userDao.saveUser(userEntity)
    }

    override suspend fun updateUser(user: UserEntity) {
        userDao.updateUser(user)
    }

}
