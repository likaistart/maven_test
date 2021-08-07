package date2021.date.mapper.worker4;

import date2021.date.model.worker4.B2CArea;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface B2CAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(B2CArea record);

    int insertSelective(B2CArea record);

    B2CArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(B2CArea record);

    int updateByPrimaryKey(B2CArea record);
}