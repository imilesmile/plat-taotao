package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by HM on 16/12/26.
 */

@Controller
public class itemController {

    @Autowired
    private itemService itemService;


    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemId){
        TbItem item = itemService.getTbItemById(itemId);

        return item;
    }
}
