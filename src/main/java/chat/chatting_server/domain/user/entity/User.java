package chat.chatting_server.domain.user.entity;

import chat.chatting_server.domain.chat.entity.Chatting;
import chat.chatting_server.domain.friend.entity.Friend;
import chat.chatting_server.domain.participant.entity.Participant;
import chat.chatting_server.domain.user.dto.UserDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER_CHAT_TABLE")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Builder
    public User(String userId, String userName, String userStatus) {
        this.userId = userId;
        this.userName = userName;
        this.userStatus = userStatus;
    }
    @Id
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USER_STATUS")
    private String userStatus;

    @OneToMany(mappedBy = "user", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Friend> friends = new ArrayList<>();

    @OneToMany(mappedBy = "user", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Participant> participants = new ArrayList<>();

    @OneToMany(mappedBy = "sendUser", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Chatting> chattings = new ArrayList<>();

    public UserDto toDto() {
        return UserDto.builder()
            .userId(userId)
            .userName(userName)
            .userStatus(userStatus)
            .build();
    }

}
