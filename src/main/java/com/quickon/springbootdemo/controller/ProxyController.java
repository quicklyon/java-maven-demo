package com.quickon.springbootdemo.controller;

import com.quickon.springbootdemo.service.ProxyService;
import com.quickon.springbootdemo.vo.ProxyReqVO;
import com.quickon.springbootdemo.vo.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

@RestController
public class ProxyController {
    @Autowired
    public ProxyService proxyService;

    @RequestMapping(value = "/proxy", method = RequestMethod.POST, produces = "application/json")
    public String proxyGet(@Valid @RequestBody ProxyReqVO proxyReqVO) throws IOException {
        return proxyService.doProxy(proxyReqVO);
    }
}
