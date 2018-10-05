package cn.hnck.com.dao;

import java.util.List;

import cn.hnck.com.entity.ShippingAddress;

/**
 * 
 * @ClassName: AddressDao
 * @Description: ���ݲ�ӿ�,��serviceImpl���ã���������
 * @author XHChen
 * @date 2018-9-21 ����3:46:52
 * 
 */
public interface AddressDao {

	// ��ӵ�ַ
	public int AddAddress(ShippingAddress address) throws Exception;

	// ���µ�ַ
	public int UpdateAddress(ShippingAddress address) throws Exception;

	// ɾ����ַ
	public int DeleteAddress(int id) throws Exception;

	// ����id��ѯ��ַ
	public ShippingAddress FindAddressById(int addressID) throws Exception;

	// ��ѯ���е�ַ
	public List<ShippingAddress> FindAllAddress(String entityName) throws Exception;

}
