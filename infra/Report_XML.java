package infra;

public class Report_XML extends Report{

	String reportType() {
		return "\t\tRelatório XML\n\n\n";
	}

	String loadReport() {
		return "\t\tColetando dados para o XML...\n\n\n";
	}

	String saveReport() {
		return "\t\tSalvando arquivo XML...\n\n\n";
	}

}