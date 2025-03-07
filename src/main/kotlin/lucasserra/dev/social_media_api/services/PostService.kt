package lucasserra.dev.social_media_api.services

import lucasserra.dev.social_media_api.domains.Comment
import lucasserra.dev.social_media_api.domains.Like
import lucasserra.dev.social_media_api.domains.Post
import lucasserra.dev.social_media_api.exceptions.NotFoundEntity
import lucasserra.dev.social_media_api.repositories.PostRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class PostService(private val repository: PostRepository) {

    fun createPost(post: Post) {
        repository.save(post)
    }
}