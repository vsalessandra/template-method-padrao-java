## CsvReport.java

```java
public class CsvReport {

    public void generate() {
        System.out.println("Reading sales data");
        String[] data = {"Notebook", "Mouse"};

        String content = "Product\n" + String.join("\n", data);
        System.out.println("Saving report.csv");
        System.out.println(content);

        System.out.println("Report generated successfully");
    }
}
```

## HtmlReport.java

```java
public class HtmlReport {

    public void generate() {
        System.out.println("Reading sales data");
        String[] data = {"Notebook", "Mouse"};

        String content = "<ul><li>" + String.join("</li><li>", data) + "</li></ul>";
        System.out.println("Saving report.html");
        System.out.println(content);

        System.out.println("Report generated successfully");
    }
}
```

## Main.java

```java
public class Main {

    public static void main(String[] args) {

        CsvReport csvReport = new CsvReport();
        HtmlReport htmlReport = new HtmlReport();

        csvReport.generate();
        htmlReport.generate();
    }
}
