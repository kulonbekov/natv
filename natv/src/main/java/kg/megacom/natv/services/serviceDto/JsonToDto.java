package kg.megacom.natv.services.serviceDto;

import kg.megacom.natv.models.dtos.ChannelDto;


import java.io.IOException;
import java.util.List;

public interface JsonToDto {


    public List<ChannelDto> jsonToPojoDto() throws IOException;
}
