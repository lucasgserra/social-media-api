package lucasserra.dev.social_media_api.services

import lucasserra.dev.social_media_api.domains.User
import lucasserra.dev.social_media_api.exceptions.NotFoundEntity
import lucasserra.dev.social_media_api.repositories.UserRepository
import org.springframework.stereotype.Service
import java.util.Optional
import java.util.UUID

@Service
class UserService(private val repository: UserRepository) {

    fun createUser(user: User) = repository.save(user)

    fun deleteUser(id: UUID) {
        val user: Optional<User> = repository.findById(id)
        if (user.isPresent) repository.delete(user.get())
        else throw NotFoundEntity("Nenhum usuario correspondente para o ID inserido!")
    }

    fun getUser(id: UUID): User = repository.findById(id).get()
}