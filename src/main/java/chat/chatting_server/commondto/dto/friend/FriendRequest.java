package chat.chatting_server.commondto.dto.friend;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

public class FriendRequest {
    @Getter
    @ToString
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class NewFriendDTO {
        @NotBlank(message = "friendId is mandatory")
        @JsonProperty("friendId")
        private String friendId;
        @Builder
        public NewFriendDTO(String friendId) {
            this.friendId = friendId;
        }
    }
}
