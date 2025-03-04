package lucasserra.dev.social_media_api.repositories

import lucasserra.dev.social_media_api.domains.Post
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PostRepository: JpaRepository<Post, UUID> {
}