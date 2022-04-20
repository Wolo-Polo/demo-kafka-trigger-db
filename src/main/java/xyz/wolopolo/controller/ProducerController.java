package xyz.wolopolo.controller;

import xyz.wolopolo.producer.DemoProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController
{
    @Autowired
    private DemoProducer producer;

    @PostMapping("/push-message")
    @ResponseBody
    public void pushMessage(@RequestParam(name = "message") String message) {
        producer.sendMessage(message);
    }
}
