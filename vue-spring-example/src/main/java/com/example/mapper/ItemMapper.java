package com.example.mapper;

import com.example.dto.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    void insert(Item item);
    List<Item> findAll();
}

