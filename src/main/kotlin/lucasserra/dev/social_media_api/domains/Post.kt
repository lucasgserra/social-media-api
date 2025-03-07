package lucasserra.dev.social_media_api.domains

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "posts")
data class Post(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,

    val content: String,

    @OneToMany(mappedBy = "post", cascade = [CascadeType.ALL], fetch = FetchType.LAZY, orphanRemoval = true)
    val like: MutableList<Like> = mutableListOf(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @OneToMany(mappedBy = "post", cascade = [CascadeType.ALL], fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "comment_id", nullable = false)
    val comments: MutableList<Comment> = mutableListOf()
)
