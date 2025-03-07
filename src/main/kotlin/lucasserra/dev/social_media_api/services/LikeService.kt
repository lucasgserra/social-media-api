package lucasserra.dev.social_media_api.services

import lucasserra.dev.social_media_api.domains.Like
import lucasserra.dev.social_media_api.repositories.LikeRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class LikeService(private val repository: LikeRepository) {

    fun addLike(like: Like) = repository.save(like)
    fun removeLike(id: UUID) {
        val like = repository.findById(id)
        if (like.isPresent) repository.delete(like.get())
    }
}