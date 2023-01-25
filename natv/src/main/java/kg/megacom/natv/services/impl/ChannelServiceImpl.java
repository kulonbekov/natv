package kg.megacom.natv.services.impl;

import kg.megacom.natv.dao.ChannelRep;
import kg.megacom.natv.models.entities.Channel;
import kg.megacom.natv.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelRep rep;

    @Override
    public Channel save(Channel channel) {
        return rep.save(channel);
    }

    @Override
    public Channel findById(long id) {
        return rep.findById(id).orElseThrow(()-> new RuntimeException("Channel не найден"));
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Channel> findAll() {
        return rep.findAll();
    }

    @Override
    public Channel update(long id, Channel channel) {
        return null;
    }
}
