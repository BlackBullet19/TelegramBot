package org.telran.project.telegrambot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.project.telegrambot.model.Channel;
import org.telran.project.telegrambot.service.ChannelService;

import java.util.List;

@RestController
@RequestMapping("/channels")
public class ChannelController {

    @Autowired
    private ChannelService channelService;

    @GetMapping("/{id}")
    public Channel getChannel(@PathVariable(name = "id")long id) {
        return channelService.getChannel(id);
    }

    @PostMapping()
    public void createChannel(@RequestBody Channel channel) {
        channelService.createChannel(channel);
    }

    @DeleteMapping("/{id}")
    public void deleteChannel(@PathVariable(name = "id")long id) {
        channelService.deleteChannel(id);
    }

    @PutMapping("/{id}")
    public void updateChannel(@PathVariable(name = "id")long id) {
        channelService.updateChannel(id);
    }

    @GetMapping
    public List<Channel> listChannels() {
        return channelService.listChannels();
    }
}