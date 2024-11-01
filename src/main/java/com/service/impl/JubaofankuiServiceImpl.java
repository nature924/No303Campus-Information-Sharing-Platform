package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JubaofankuiDao;
import com.entity.JubaofankuiEntity;
import com.service.JubaofankuiService;
import com.entity.vo.JubaofankuiVO;
import com.entity.view.JubaofankuiView;

@Service("jubaofankuiService")
public class JubaofankuiServiceImpl extends ServiceImpl<JubaofankuiDao, JubaofankuiEntity> implements JubaofankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JubaofankuiEntity> page = this.selectPage(
                new Query<JubaofankuiEntity>(params).getPage(),
                new EntityWrapper<JubaofankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JubaofankuiEntity> wrapper) {
		  Page<JubaofankuiView> page =new Query<JubaofankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JubaofankuiVO> selectListVO(Wrapper<JubaofankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JubaofankuiVO selectVO(Wrapper<JubaofankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JubaofankuiView> selectListView(Wrapper<JubaofankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JubaofankuiView selectView(Wrapper<JubaofankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
