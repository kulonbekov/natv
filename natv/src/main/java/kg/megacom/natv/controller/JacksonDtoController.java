package kg.megacom.natv.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.natv.models.dtos.ChannelDto;
import kg.megacom.natv.services.serviceDto.DtoToEntity;
import kg.megacom.natv.services.serviceDto.JsonToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@Api(tags = "Конвертация в Dto")
@RestController
@RequestMapping("/api/v1/pojoToJsonDto")
public class JacksonDtoController {

    @Autowired
    private JsonToDto jsonToDto;

    @Autowired
    private DtoToEntity dtoToEntity;

    @GetMapping("/jsonToPojoDto")
    @ApiOperation("json конвентировать в обьект Dto")
    public List<ChannelDto> JacksonJsonToPojo() throws IOException {
        return jsonToDto.jsonToPojoDto();
    }
    @GetMapping("/dtoMapperInClass")
    @ApiOperation("Dto mapper в обьект Class")
    public void DtoMapperInClass() throws IOException {
        dtoToEntity.DtoToEntity(jsonToDto.jsonToPojoDto());
    }
}
