import java.util.Arrays;

public class BankApplication {
    private String name;
    private String country;
    Worker[] workers = new Worker[100];
    int sizeOfWorkers = 0;

    public BankApplication() {
    }
    public BankApplication(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "BankApplication{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", workers=" + Arrays.toString(workers) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    void addWorker(Worker worker){
        workers[sizeOfWorkers] = worker;
        sizeOfWorkers++;
    }
}
