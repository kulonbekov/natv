package kg.megacom.natv.services.serviceDto.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import kg.megacom.natv.models.dtos.ChannelDto;
import kg.megacom.natv.services.serviceDto.DtoToEntity;
import kg.megacom.natv.services.serviceDto.JsonToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class JsonToDtoImpl implements JsonToDto {

    @Autowired
    private DtoToEntity dtoToEntity;


    @Override
    public List<ChannelDto> jsonToPojoDto() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        List<ChannelDto> channelDtoList = objectMapper.readValue(new File("task.json"), new TypeReference<List<ChannelDto>>() {
        });
        return channelDtoList;
    }
}
