package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.config.MqttConsumer;
import com.example.entity.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testmqtt")
public class MqttTest {
    /**
     * 测试推送消息
     */
    @ResponseBody
    @GetMapping(value = "/push")
    public Object push() {
        Message message = new Message("人工","威胁",10);
        String s = JSON.toJSONString(message);
        MqttConsumer.publish("test", s);
        return "测试发布主题成功" + s;
    }
}