package chat.chatting_server.commondto.dto.user;


import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDto {
    private String userId;
    private String userPw;
    private String email;
    private String userName;
    private LocalDateTime joinDate;
    private LocalDateTime loginDate;
    private LocalDateTime logoutDate;

    @Builder
    public UserDto(String userId, String userPw, String email, String userName, LocalDateTime joinDate, LocalDateTime loginDate, LocalDateTime logoutDate) {
        this.userId = userId;
        this.userPw = userPw;
        this.email = email;
        this.userName = userName;
        this.joinDate = joinDate;
        this.loginDate = loginDate;
        this.logoutDate = logoutDate;
    }
}
