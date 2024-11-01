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


import com.dao.ZiliaofenxiangDao;
import com.entity.ZiliaofenxiangEntity;
import com.service.ZiliaofenxiangService;
import com.entity.vo.ZiliaofenxiangVO;
import com.entity.view.ZiliaofenxiangView;

@Service("ziliaofenxiangService")
public class ZiliaofenxiangServiceImpl extends ServiceImpl<ZiliaofenxiangDao, ZiliaofenxiangEntity> implements ZiliaofenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiliaofenxiangEntity> page = this.selectPage(
                new Query<ZiliaofenxiangEntity>(params).getPage(),
                new EntityWrapper<ZiliaofenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiliaofenxiangEntity> wrapper) {
		  Page<ZiliaofenxiangView> page =new Query<ZiliaofenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiliaofenxiangVO> selectListVO(Wrapper<ZiliaofenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiliaofenxiangVO selectVO(Wrapper<ZiliaofenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiliaofenxiangView> selectListView(Wrapper<ZiliaofenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiliaofenxiangView selectView(Wrapper<ZiliaofenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
