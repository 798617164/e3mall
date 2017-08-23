package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.TBItemService;

@Controller
public class TBItemController {
	
	@Autowired
	private TBItemService tBItemService;

	@RequestMapping("/item/{ItemId}")
	@ResponseBody
	public TbItem getTBItemById(@PathVariable long ItemId){
		TbItem item = tBItemService.geTbItemById(ItemId);
		return item;
	}
	
}
