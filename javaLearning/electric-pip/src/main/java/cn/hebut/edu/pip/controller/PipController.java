package cn.hebut.edu.pip.controller;

import cn.hebut.edu.pip.dao.Pip;
import cn.hebut.edu.pip.service.PipService;
import cn.hebut.edu.pip.util.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Date: 2018/3/1
 */
@Controller
@RestController
@RequestMapping("/pip")
public class PipController {

    @Resource
    public PipService pipService;

    @RequestMapping("/hello")
    public Object hello() {
        return ResponseUtil.buildSuccess("hello");
    }

    @RequestMapping(value = "/queryPoint", method = RequestMethod.GET)
    public Object queryPoint() {
//        List<Pip> pipList = pipService.queryPoint();


        return ResponseUtil.buildSuccess("");
    }
}
