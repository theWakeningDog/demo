package com.example.demo.repository;

import com.example.demo.entity.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * CrudRepository中自带crud方法
 * spring data中repository是最基本的接口，spring提供了很多实现了该接口的基本接口,
 * 如:CrudRepository，PagingAndSortingRepository，SimpleJpaRepository，QueryDslJpaRepository等大量查询接口
 * Created by zhangwei on 2018/3/28 0028.
 */
public interface DemoRepository extends CrudRepository<Demo, Long> {

}
