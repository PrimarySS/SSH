package cn.hnck.com.entity;

/**
 * 
 * @ClassName: ShippingAddress
 * @Description: �����ջ���ַ
 * @author XHChen
 * @date 2018-9-19 ����10:34:38
 * 
 */
public class ShippingAddress {

	private int id; // ��ַid

	private String recipient; // �ռ���

	private String mobilePhone; // �ֻ���

	private String address; // �ջ���ַ(ʡ/��/�أ�����)

	private String detailedAddress; // ��ϸ��ַ

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetailedAddress() {
		return detailedAddress;
	}

	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

}
