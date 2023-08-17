package models.files;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload2.core.FileItem;

import java.util.List;

public class FileUploadService {
    private FileInfoDao fileInfoDao;

    public FileUploadService(FileInfoDao fileInfoDao) {
        this.fileInfoDao = fileInfoDao;
    }

    public List<FileInfo> uploads(HttpServletRequest request) {

        return null;
    }
}
