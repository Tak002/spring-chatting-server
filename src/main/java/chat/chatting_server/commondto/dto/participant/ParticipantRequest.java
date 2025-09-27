package chat.chatting_server.commondto.dto.participant;

import lombok.*;

public class ParticipantRequest {
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @Getter
    @Setter
    @ToString
    public static class RemoveParticipantDto {
        private Long roomId;

        @Builder
        public RemoveParticipantDto(Long roomId) {
            this.roomId = roomId;
        }
    }

    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @Getter
    @Setter
    @ToString
    public static class AddParticipantRequest {
        private Long roomId;

        @Builder
        public AddParticipantRequest(Long roomId) {
            this.roomId = roomId;
        }
    }
}
