package templatemethod;

public abstract class ReportGenerator {

    public final void generateReport(){

        fetchData();
        formatData();
        saveReport();
    }

    void fetchData(){
        System.out.println("Fetching data");
    }

    abstract void formatData();

    void saveReport(){
        System.out.println("Saving report");
    }
}
