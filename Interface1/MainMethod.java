
public class MainMethod {

	public static void main(String[] args) {
		Banker MichaelThomas = new Banker(120000.00);
		MichaelThomas.PayTaxes(.15);
		MichaelThomas.FileTaxReturn();
		
		SchoolTeacher MichaelJordan = new SchoolTeacher(50000);
		MichaelJordan.PayTaxes(.42);
		MichaelJordan.FileTaxReturn();
		
		Scientist StephenCurry = new Scientist(90000);
		StephenCurry.PayTaxes(.35);
		StephenCurry.FileTaxReturn();
	}
}

