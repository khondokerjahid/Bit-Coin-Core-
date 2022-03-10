package com.jxust.btcexplorer.controller;

import com.jxust.btcexplorer.service.BTCService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class BlockHashController {
    @RequestMapping("/blockhash.html")
    public String blockhash() {
        return "blockhash.html";
    }

    @RequestMapping("/getblockhash")
    public String getBlockHash(@RequestParam("height") int height, Model model) {
        BTCService Service = new BTCService();
        String hashCODE = Service.getBlockHash(height);
        System.out.println(hashCODE);
        model.addAttribute("hash", hashCODE);
        return "blockhash.html";

    }

    @RequestMapping("/getblockchaininfo")
    public String getBlockChainInfo(@RequestParam("dummy") String dummy, Model model) {
        BTCService Service = new BTCService();
        String chain = Service.getBlockChainInfo().getChain();
        String block = String.valueOf(Service.getBlockChainInfo().getBlocks());
        String headers = String.valueOf(Service.getBlockChainInfo().getHeaders());
        model.addAttribute("chainInfo", chain);
        model.addAttribute("blockInfo", block);
        model.addAttribute("HeaderInfo", headers);
        return "blockchaininfo.html";

    }

    @RequestMapping("/getblock")
    public String getBlockInfo(@RequestParam("height") String height, Model model) {
        BTCService Service = new BTCService();
        String hash = Service.getBlock(height).getHash();
        String confirmations = String.valueOf(Service.getBlock(height).getConfirmations());
        String strippedsize = String.valueOf(Service.getBlock(height).getStrippedsize());
        model.addAttribute("hash", hash);
        model.addAttribute("confirmationsinfo", confirmations);
        model.addAttribute("strippedsizeinfo", strippedsize);
        return "block.html";

    }

    @RequestMapping("/getblockdifficulty")
    public String getdifficulty(@RequestParam("dummy") String height, Model model) {
        BTCService Service = new BTCService();
        String difficulty = String.valueOf(Service.getDifficulty());
        model.addAttribute("difficultyinfo", difficulty);
        return "difficulty.html";

    }

    @RequestMapping("/getblockcount")
    public String getcount(@RequestParam("dummy") String height, Model model) {
        BTCService Service = new BTCService();
        String count = String.valueOf(Service.getBlockCount());
        model.addAttribute("countinfo", count);
        return "blockcount.html";

    }

}