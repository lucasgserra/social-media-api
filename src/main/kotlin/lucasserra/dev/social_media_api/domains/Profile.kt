package lucasserra.dev.social_media_api.domains

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import java.util.UUID

@Entity(name = "profiles")
@Table(name = "profiles")
@Getter
@AllArgsConstructor
data class Profile(
    @Id
    val id: UUID? = null,
    val picture: String,
    val bio: String,
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    val user: User
)
