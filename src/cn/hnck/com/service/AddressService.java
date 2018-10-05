package cn.hnck.com.service;

import java.util.List;

import cn.hnck.com.entity.ShippingAddress;

/**
 * 
 * @ClassName: AddressService
 * @Description: dao��service����,��Action���ã���������
 * @author XHChen
 * @date 2018-9-21 ����4:04:00
 * 
 */
public interface AddressService {

	// ��ӵ�ַ
	public boolean AddAddress(ShippingAddress address) throws Exception;

	// ���µ�ַ
	public boolean UpdateAddress(ShippingAddress address) throws Exception;

	// ɾ����ַ
	public boolean DeleteAddress(int id) throws Exception;

	// ����id��ѯ��ַ
	public ShippingAddress FindAddressById(int addressID) throws Exception;

	// ��ѯ���е�ַ
	public List<ShippingAddress> FindAllAddress() throws Exception;

}
