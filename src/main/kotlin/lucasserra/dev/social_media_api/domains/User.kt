package lucasserra.dev.social_media_api.domains

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.EqualsAndHashCode
import lombok.Getter
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.util.UUID

@Entity
@Table(name = "users")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = ["id"])
data class User(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,

    val firstName: String,

    val lastName: String,

    @Column(unique = true)
    val email: String,

    @Column(unique = true)
    val document: String,

    val password: String,

    val createdAt: OffsetDateTime? = OffsetDateTime.now(ZoneOffset.UTC),

    @OneToOne(mappedBy = "user", cascade = [CascadeType.ALL], orphanRemoval = true)
    val profile: Profile? = null,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], orphanRemoval = true)
    val posts: MutableList<Post> = mutableListOf(),

    @OneToMany(mappedBy = "author", cascade = [CascadeType.ALL], fetch = FetchType.LAZY, orphanRemoval = true)
    val comments: MutableList<Comment> = mutableListOf()
)
