package com.hopu.ssm.controller;

import com.hopu.ssm.model.Items;
import com.hopu.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("items")
    public String list(Map<String, Object> map){
        map.put("items", itemsService.findAllItems());
        return "list";
    }

    @RequestMapping("save")
    public String save(){
        Items items = new Items();
        items.setName("iPhone11");
        items.setPrice(12999.00F);
        items.setCreatetime(new Date());
        items.setDetail("非常好用");
        itemsService.saveOrUpdate(items);
        return "redirect:items";
    }
}
