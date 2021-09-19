package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author Dengbinsheng
 * @date 2021/9/17 21:13
 */
//@Repository
@Component        //代替@Repository声明bean
@Mapper           //mybatis提供的，等价：@MapperScan("com.atguigu.springcloud.dao")
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
