package models.works;

public class WorkServiceManager {
    public WorkDao workDao() {
        return new WorkDao();
    }

    public SaveService saveService() {

        return new SaveService(workDao());
    }
}
