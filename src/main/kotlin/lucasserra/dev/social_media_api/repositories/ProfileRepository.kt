package lucasserra.dev.social_media_api.repositories

import lucasserra.dev.social_media_api.domains.Profile
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ProfileRepository: JpaRepository<Profile, UUID> {
}