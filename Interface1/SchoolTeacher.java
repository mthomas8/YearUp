
public class SchoolTeacher implements ITaxPayer
	{
	private double m_income = -1;
	private boolean m_donePayingTaxes = false;
	
	SchoolTeacher(double income) 
	{  
		setM_income(income);
	}
	public double getm_income()
	{
		return m_income;
	}
private void setM_income(double income) 
{
	this.m_income = income;
}

public void PayTaxes (double taxRate)
{
	if (!m_donePayingTaxes)
	{
	double taxes = taxRate * getm_income();
	double newIncome = getm_income() - taxes;
	
	setM_income(newIncome);
	m_donePayingTaxes = true;
	}
	else
	{
		System.out.println("Client has already paid taxes.");
	}
}

public void FileTaxReturn()
{
	if (m_donePayingTaxes)
	{
		System.out.println("School Teacher has filed tax return.");
	}
	else 
	{
		System.out.println("School Teacher needs to pay taxes before filing tax return.");
	}
}
}
