package com.mybatis_practice.mappers;

import com.mybatis_practice.model.Address;
import org.apache.ibatis.annotations.Select;

public interface AddressMapper {

    @Select("select * from t_address where id=#{id}")
    public Address findById(Integer id);

}
