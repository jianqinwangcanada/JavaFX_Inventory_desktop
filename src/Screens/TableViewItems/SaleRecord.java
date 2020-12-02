package Screens.TableViewItems;

import javafx.scene.control.CheckBox;

public  class SaleRecord 
{	
	//create an saleTime so we can reference this later
	private  String saleTime;
	//create an name so we can reference this later
	private  String name;
	//create an tax so we can reference this later
	private  String tax;
	//create an total so we can reference this later
	private  String total;
	//create an saleId so we can reference this later
	private  int saleId;
	//create an checkDetail so we can reference this later
	private CheckBox checkDetail;

	public SaleRecord(String saleTime, String name, String tax, String total,int saleId) 
	{
		super();
		this.saleTime = saleTime;
		this.name = name;
		this.tax = tax;
		this.total = total;
		checkDetail=new CheckBox();
		this.saleId=saleId;
	}
	
	public String getSaleTime() 
	{
		return saleTime;
	}
	
	public void setSaleTime(String saleTime) 
	{
		this.saleTime = saleTime;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getTax() 
	{
		return tax;
	}
	
	public void setTax(String tax) 
	{
		this.tax = tax;
	}
	
	public String getTotal() 
	{
		return total;
	}
	
	public void setTotal(String total) 
	{
		this.total = total;
	}
	
	public int getSaleId() 
	{
		return this.saleId;
	}
	
	public void setSaleId(int saleId) 
	{
		this.saleId=saleId;
	}
	
	public CheckBox getCheckDetail() 
	{
		return checkDetail;
	}
	
	public void setCheckDetail(CheckBox checkDetail) 
	{
		this.checkDetail = checkDetail;
	}
}