package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.TBItemService;

@Service
public class TBItemServiceImpl implements TBItemService {

	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem geTbItemById(long ItemId) {
		return tbItemMapper.selectByPrimaryKey(ItemId);
	}

}
