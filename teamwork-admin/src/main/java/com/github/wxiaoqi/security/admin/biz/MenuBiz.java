package com.github.wxiaoqi.security.admin.biz;

import com.github.wxiaoqi.security.admin.entity.Menu;
import com.github.wxiaoqi.security.common.biz.BaseBiz;
import com.github.wxiaoqi.security.admin.constant.CommonConstant;
import org.springframework.stereotype.Service;
import com.github.wxiaoqi.security.admin.mapper.MenuMapper;

@Service
public class MenuBiz extends BaseBiz<MenuMapper,Menu> {
    @Override
    public void insertSelective(Menu entity) {
        if(CommonConstant.ROOT == entity.getParentId()){
            entity.setPath("/"+entity.getCode());
        }else{
            Menu parent = this.selectById(entity.getParentId());
            entity.setPath(parent.getPath()+"/"+entity.getCode());
        }
        super.insertSelective(entity);
    }

    @Override
    public void updateById(Menu entity) {
        if(CommonConstant.ROOT == entity.getParentId()){
            entity.setPath("/"+entity.getCode());
        }else{
            Menu parent = this.selectById(entity.getParentId());
            entity.setPath(parent.getPath()+"/"+entity.getCode());
        }
        super.updateById(entity);
    }
}
