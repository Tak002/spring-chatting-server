package chat.chatting_server.domain.friend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Getter
@Setter
@Entity
public class Friend {

    // PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FRIEND_SEQ")
    private Long id;

    // FK
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "FRIEND_ID")
    private String friendId;

    public Friend() {}
}
