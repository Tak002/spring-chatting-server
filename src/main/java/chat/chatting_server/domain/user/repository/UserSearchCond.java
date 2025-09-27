package chat.chatting_server.domain.user.repository;

import lombok.Data;

@Data
public class UserSearchCond {
    private String userName;

    public UserSearchCond() {
    }

    public UserSearchCond(String itemName) {
        this.userName = itemName;
    }
}
