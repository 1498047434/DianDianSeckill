package com.nowcoder.seckill.dao;

import com.nowcoder.seckill.entity.ItemStockLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemStockLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock_log
     *
     * @mbg.generated Wed Feb 03 18:45:18 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock_log
     *
     * @mbg.generated Wed Feb 03 18:45:18 CST 2021
     */
    int insert(ItemStockLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock_log
     *
     * @mbg.generated Wed Feb 03 18:45:18 CST 2021
     */
    ItemStockLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock_log
     *
     * @mbg.generated Wed Feb 03 18:45:18 CST 2021
     */
    List<ItemStockLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock_log
     *
     * @mbg.generated Wed Feb 03 18:45:18 CST 2021
     */
    int updateByPrimaryKey(ItemStockLog record);
}