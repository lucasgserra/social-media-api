package lucasserra.dev.social_media_api.repositories

import lucasserra.dev.social_media_api.domains.Like
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface LikeRepository: JpaRepository<Like, UUID> {
}