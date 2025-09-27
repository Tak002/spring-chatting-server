package chat.chatting_server.commondto.events.user;


import chat.chatting_server.commondto.events.Event;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
public class UserEvent implements Event, Serializable {

    public UserEvent(UUID eventId, UserStatus userStatus, String userId, String userName) {
        this.eventId = eventId;
        this.userStatus = userStatus.name();
        this.userId = userId;
        this.userName = userName;
    }
    public UserEvent() {
    }

    private UUID eventId;
    private final Date date = new Date();
    private String userStatus;
    private String userId;
    private String userName;

    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public Date getDate() {
        return date;
    }
}
