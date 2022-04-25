package org.itheima.mapper;

import org.apache.ibatis.annotations.Param;
import org.itheima.pojo.WeatherRecord;

import java.util.List;

public interface WeatherMapper {

    List<WeatherRecord> selectAll();

    WeatherRecord selectByUniHour(@Param("uniHour") int uniHour);
}
