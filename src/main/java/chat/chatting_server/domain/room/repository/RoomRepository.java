package chat.chatting_server.domain.room.repository;

import chat.chatting_server.domain.room.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {

    Room save(Room room);

    Optional<Room> findByRoomId(@Param("roomId") Long roomId);

    List<Room> findAll();
}
