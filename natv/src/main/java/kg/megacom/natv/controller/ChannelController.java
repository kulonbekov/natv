package kg.megacom.natv.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.natv.models.entities.Channel;
import kg.megacom.natv.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Каналы")
@RestController
@RequestMapping("/api/v1/channel")
public class ChannelController {

    @Autowired
    private ChannelService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    Channel save(@RequestBody Channel channel){return service.save(channel);}

    @GetMapping("/findById")
    @ApiOperation("Поиск канала по ID")
    Channel findById(@RequestParam Long id){return service.findById(id);}

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех каналов")
    List<Channel> findAll(){return service.findAll();}
}
