package cn.hnck.com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import cn.hnck.com.dao.AddressDao;
import cn.hnck.com.entity.ShippingAddress;

public class AddressDaoImpl implements AddressDao {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	/**
	 * 添加地址
	 */
	public int AddAddress(ShippingAddress address) throws Exception {

		// 保存dao接口传过来的封装数据
		try {
			this.hibernateTemplate.saveOrUpdate(address);
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}

		return 0;
	}

	@Override
	/**
	 * 更新地址
	 */
	public int UpdateAddress(ShippingAddress address) throws Exception {

		// 保存更新的数据
		try {
			this.hibernateTemplate.saveOrUpdate(address);
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		return 0;

	}

	@Override
	/**
	 * 删除地址
	 */
	public int DeleteAddress(int id) throws Exception {

		// 根据id删除数据
		try {
			// 根据id找到对象
			ShippingAddress as = hibernateTemplate.get(ShippingAddress.class, id);
			// 删除对象
			hibernateTemplate.delete(as);

			return 1;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		return 0;

	}

	@SuppressWarnings("unchecked")
	@Override
	/**
	 * 根据id查询地址
	 */
	public ShippingAddress FindAddressById(int addressID) throws Exception {

		return this.hibernateTemplate.get(ShippingAddress.class, addressID);

	}

	@SuppressWarnings("unchecked")
	@Override
	/**
	 * 查询地址
	 */
	public List<ShippingAddress> FindAllAddress(String entityName)
			throws Exception {

		return (List<ShippingAddress>) this.hibernateTemplate.find("from" + " "
				+ entityName);

	}
}