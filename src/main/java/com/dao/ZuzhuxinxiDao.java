package com.dao;

import com.entity.ZuzhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuzhuxinxiView;

/**
 * 租住信息 Dao 接口
 *
 * @author 
 */
public interface ZuzhuxinxiDao extends BaseMapper<ZuzhuxinxiEntity> {

   List<ZuzhuxinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
