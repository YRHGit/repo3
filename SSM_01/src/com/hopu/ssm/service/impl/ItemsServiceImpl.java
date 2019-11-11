package com.hopu.ssm.service.impl;

import com.hopu.ssm.mapper.ItemsMapper;
import com.hopu.ssm.model.Items;
import com.hopu.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAllItems() {
        return itemsMapper.findAllItems();
    }

    @Override
    public Items findByID(Integer id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Items items) {
        if (items.getId() == null) {
            itemsMapper.insert(items);
        } else {
            itemsMapper.updateByPrimaryKeySelective(items);
        }
    }

    @Override
    public void deleteByID(Integer id) {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
