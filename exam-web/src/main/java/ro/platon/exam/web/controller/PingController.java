package ro.platon.exam.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by vladplaton on 19/06/2017.
 */
@RestController
public class PingController {

    private static final Logger log = LoggerFactory.getLogger(PingController.class);

    @RequestMapping(value = "/ping", method = GET)
    @ResponseBody
    String ping() {
        System.out.println("asdfasdf");
        return "pong";
    }
}
