public abstract class ReportGenerator {

    // Template Method: define a ordem fixa das etapas
    public final void generate() {
        String[] data = readData();
        String content = formatData(data);
        saveReport(content);
        afterGeneration();
    }

    // Etapa comum a todos os relatórios
    protected final String[] readData() {
        System.out.println("Reading sales data");
        return new String[] {"Notebook", "Mouse"};
    }

    // Etapas que variam conforme o formato
    protected abstract String formatData(String[] data);

    protected abstract void saveReport(String content);

    // Hook: comportamento padrão que pode ser sobrescrito
    protected void afterGeneration() {
        System.out.println("Report generated successfully");
    }
}
