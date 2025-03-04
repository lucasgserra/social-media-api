package lucasserra.dev.social_media_api.domains

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import java.util.UUID

@Entity
@Table(name = "comments")
@Getter
@AllArgsConstructor
data class Comment(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    val post: Post,

    val content: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", nullable = false)
    val author: User
)
