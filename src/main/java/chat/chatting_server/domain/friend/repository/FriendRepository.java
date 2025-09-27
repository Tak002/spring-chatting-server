package chat.chatting_server.domain.friend.repository;

import chat.chatting_server.domain.friend.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;

import java.util.List;
import java.util.Optional;

public interface FriendRepository extends JpaRepository<Friend, Long> {

    @Nullable
    Friend save(Friend friend);

    @Query("select f from Friend f where f.user.userId = :userId")
    List<Friend> findAllByUserId(@Param("userId") String userId);

    @Query("select f from Friend f where f.friendId = :friendId")
    Optional<Friend> findByFriendId(@Param("friendId") String friendId);

    @Nullable
    @Query("select f from Friend f where f.user.userId = :userId and f.friendId = :friendId")
    Friend findByUserIdAndFriendId(@Param("userId") String userId, @Param("friendId") String friendId);

    @Query("delete from Friend f where f.user.userId = :userId")
    void deleteByUserId(@Param("userId") String userId);

}
