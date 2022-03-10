package com.jxust.btcexplorer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebPageController {

    @RequestMapping("/")
    public String root() {
        System.out.println("index page");
        return "index.html";
    }

    @RequestMapping("/index")
    public String index() {
        System.out.println("index page");
        return "index.html";
    }

    @RequestMapping("/blockhash")
    public String blockhash() {
        System.out.println("index page");
        return "blockhash.html";
    }

    @RequestMapping("/blockchaininfo")
    public String blockchaininfo() {
        System.out.println("index page");
        return "blockchaininfo.html";
    }

    @RequestMapping("/block")
    public String block() {
        System.out.println("index page");
        return "block.html";
    }

    @RequestMapping("/difficulty")
    public String difficulty() {
        System.out.println("index page");
        return "difficulty.html";
    }

    @RequestMapping("/blockcount")
    public String count() {
        System.out.println("index page");
        return "blockcount.html";
    }

}
