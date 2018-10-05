package cn.hnck.com.action;

import java.util.List;

import cn.hnck.com.dto.ShippingAddressDTO;
import cn.hnck.com.entity.ShippingAddress;
import cn.hnck.com.service.AddressService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @ClassName: ShippingAddressAction
 * @Description: 模型驱动，获得页面数据，调用service接口的方法,传入数据
 * @author XHChen
 * @date 2018-9-21 下午4:42:17
 * 
 */
public class ShippingAddressAction extends ActionSupport implements ModelDriven {

	// 单例模式
	private ShippingAddressDTO AddressDTO = new ShippingAddressDTO();
	private ShippingAddress address;

	// service ioc
	private AddressService addressService;

	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}

	private List<ShippingAddress> list;

	// 修改
	private ShippingAddress updateAddress;

	// 增加
	public String save() throws Exception {

		address = new ShippingAddress();

		address.setRecipient(AddressDTO.getRecipient());
		address.setMobilePhone(AddressDTO.getMobilePhone());
		address.setAddress(AddressDTO.getAddress());
		address.setDetailedAddress(AddressDTO.getDetailedAddress());

		this.addressService.AddAddress(address);

		return "find";
	}

	// 修改
	public String update() throws Exception {

		updateAddress = new ShippingAddress();

		updateAddress.setId(AddressDTO.getId());
		updateAddress.setRecipient(AddressDTO.getRecipient());
		updateAddress.setMobilePhone(AddressDTO.getMobilePhone());
		updateAddress.setAddress(AddressDTO.getAddress());
		updateAddress.setDetailedAddress(AddressDTO.getDetailedAddress());

		this.addressService.UpdateAddress(updateAddress);

		return "find";
	}

	// 删除
	public String delete() throws Exception {

		this.addressService.DeleteAddress(AddressDTO.getId());

		return "list";
	}

	// 查询
	public String show() throws Exception {

		// 返回数据库所有信息
		list = this.addressService.FindAllAddress();

		// 把返回的实体setAttribute到页面
		ActionContext.getContext().put("list", list);

		return "list";
	}

	// 预修改
	public String FindAddressById() throws Exception {

		// 根据id查询，返回实体
		updateAddress = this.addressService.FindAddressById(AddressDTO.getId());

		// 把返回的实体setAttribute到页面
		ActionContext.getContext().put("updateAddress", updateAddress);

		return "update";
	}

	@Override
	public ShippingAddressDTO getModel() {
		return AddressDTO;
	}

	public List<ShippingAddress> getList() {
		return list;
	}

	public void setList(List<ShippingAddress> list) {
		this.list = list;
	}

	public ShippingAddress getUpdateAddress() {
		return updateAddress;
	}

	public void setUpdateAddress(ShippingAddress updateAddress) {
		this.updateAddress = updateAddress;
	}

}
