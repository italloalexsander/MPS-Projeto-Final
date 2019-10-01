package infra;

public class Report_PDF extends Report{

	String reportType() {
		return "\t\tRelatório de negócios em PDF\n\n\n";
	}

	String loadReport() {
		return "\t\tCarregando informações para o PDF...\n\n\n";
	}

	String saveReport() {
		return "\t\tSalvando PDF...\n\n\n";
	}
}