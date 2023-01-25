package kg.megacom.natv.dao;

import kg.megacom.natv.models.entities.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRep extends JpaRepository<Channel, Long> {
}
