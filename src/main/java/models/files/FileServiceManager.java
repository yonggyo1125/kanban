package models.files;

public class FileServiceManager {
    public FileInfoDao fileInfoDao() {
        return new FileInfoDao();
    }

    public FileUploadService fileUploadService() {
        return new FileUploadService(fileInfoDao());
    }

    public FileDeleteService fileDeleteService() {
        return new FileDeleteService(fileInfoDao());
    }

    public FileInfoService fileInfoService() {
        return new FileInfoService(fileInfoDao());
    }
}
