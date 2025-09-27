package chat.chatting_server.domain.room.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ROOM_ID")
    private Long roomId;
    @Column(name = "CREATED_AT")
    private ZonedDateTime createdAt;
    @Column(name = "UPDATED_AT")
    private ZonedDateTime updatedAt;

    public Room(ZonedDateTime createdAt, ZonedDateTime updatedAt) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Room() {
    }
}
