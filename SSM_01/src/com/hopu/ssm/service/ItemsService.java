package com.hopu.ssm.service;

import com.hopu.ssm.model.Items;

import java.util.List;

public interface ItemsService {
    public List<Items> findAllItems();
    public Items findByID(Integer id);
    public void saveOrUpdate(Items items);
    public void deleteByID(Integer id);
}
