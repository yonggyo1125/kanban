package models.works;

public class WorkServiceManager {
    private static WorkServiceManager instance;

    private WorkServiceManager() {}

    public static WorkServiceManager getInstance() {
        if (instance == null) {
            instance = new WorkServiceManager();
        }

        return instance;
    }

    public WorkDao workDao() {
        return new WorkDao();
    }

    public SaveService saveService() {

        return new SaveService(workDao());
    }

    public InfoService infoService() {
        InfoService infoService = new InfoService();
        infoService.setWorkDao(workDao());

        return infoService;
    }

    public DeleteService deleteService() {
        return new DeleteService(workDao());
    }
}
