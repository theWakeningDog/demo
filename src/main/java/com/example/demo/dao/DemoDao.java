package com.example.demo.dao;

import com.example.demo.entity.Demo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by zhangwei on 2018/3/28 0028.
 */
@Repository
public class DemoDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public Demo getById(long id){
        String sql = "select * from demo where id=?";
        RowMapper<Demo> rm = new BeanPropertyRowMapper<Demo>(Demo.class);
        return jdbcTemplate.queryForObject(sql, rm, id);
    }
}
