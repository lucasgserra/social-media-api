package lucasserra.dev.social_media_api.domains

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import java.util.UUID

@Entity
@Table(name = "profiles")
@Getter
@AllArgsConstructor
data class Profile(
    @Id
    val id: UUID? = null,

    val picture: String,
    
    val bio: String,

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "user_id", nullable = false)
    val user: User
)
