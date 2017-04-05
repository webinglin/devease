package com.piedra.platease.service.impl.system;

import com.piedra.platease.dao.system.UserDao;
import com.piedra.platease.model.Page;
import com.piedra.platease.model.system.User;
import com.piedra.platease.service.impl.BaseServiceImpl;
import com.piedra.platease.service.system.UserService;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户实体业务实现层
 * @author webinglin
 * @since 2017-04-05
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService {
	@Resource
	public void setBaseDao(UserDao userDao) {
		super.setBaseDao(userDao);
	}






	public Page<User> getUserPage(Integer pageSize,Integer pageIndex){
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		Page<User> page = new Page<>();
		page.setOrderBy("id");
		page.setPageSize(pageSize);
		page.setPageIndex(pageIndex);
		return getBaseDao().getPage(criteria, page);
	} 
}
