public class Main {

    public static void main(String[] args) {

        ReportGenerator csvReport = new CsvReport();
        ReportGenerator htmlReport = new HtmlReport();

        csvReport.generate();
        System.out.println();
        htmlReport.generate();
    }
}
