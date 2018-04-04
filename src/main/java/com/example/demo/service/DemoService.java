package com.example.demo.service;

import com.example.demo.dao.DemoDao;
import com.example.demo.entity.Demo;
import com.example.demo.repository.DemoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by zhangwei on 2018/3/28 0028.
 */
@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;
    @Resource
    private DemoDao demoDao;

    @Transactional
    public void save(Demo demo) {
        demoRepository.save(demo);
    }

    public Demo getById(long id){
        return demoDao.getById(id);
    }
}
