package chat.chatting_server.domain.participant.dto;

import chat.chatting_server.domain.user.dto.UserDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@ToString
public class ParticipantDto {
    private Long participantId;
    private UserDto userDto;
    private Long roomId;
    private String roomName;
    private LocalDate createdAt;
    private LocalDate UpdatedAt;

    @Builder
    public ParticipantDto(Long participantId, UserDto userDto, Long roomId, String roomName,
                          LocalDate createdAt, LocalDate updatedAt) {
        this.participantId = participantId;
        this.userDto = userDto;
        this.roomId = roomId;
        this.roomName = roomName;
        this.createdAt = createdAt;
        UpdatedAt = updatedAt;
    }
}
