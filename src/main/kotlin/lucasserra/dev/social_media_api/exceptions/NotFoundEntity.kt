package lucasserra.dev.social_media_api.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundEntity(message: String): RuntimeException(message) {
}