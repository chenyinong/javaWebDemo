package com.how2java.mapper;

import com.how2java.pojo.Order;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper{
    @Select("select * from order_ ")
    @Results({
            @Result(property = "orderItems" ,column = "id",many = @Many(select = "com.how2java.mapper.OrderItemMapper.listByOrder"))
    })
    public List<Order> list();
}
