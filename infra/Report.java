package infra;

public abstract class Report {

	abstract String reportType();
	abstract String loadReport();
	abstract String saveReport();

	public final void generateReport()
	{
		String showReport = "";

		showReport += reportType();
		showReport += loadReport();
		showReport += saveReport();

		System.out.println(showReport);
	}
}