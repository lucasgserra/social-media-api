package lucasserra.dev.social_media_api.services

import lucasserra.dev.social_media_api.domains.Comment
import lucasserra.dev.social_media_api.repositories.CommentRepository
import org.springframework.stereotype.Service

@Service
class CommentService(private val repository: CommentRepository) {

    fun createComment(comment: Comment) = repository.save(comment)

}