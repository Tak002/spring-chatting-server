package chat.chatting_server.commondto.dto.friend;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

public class FriendResponse {
    @Getter
    @ToString
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class FriendDTO implements Serializable {
        @JsonProperty("friendId")
        private String friendId;
        @JsonProperty("friendName")
        private String friendName;
        @JsonProperty("friendStatus")
        private String friendStatus;

        @Builder
        public FriendDTO(String friendId, String friendName, String friendStatus) {
            this.friendId = friendId;
            this.friendName = friendName;
            this.friendStatus = friendStatus;
        }

    }

}
