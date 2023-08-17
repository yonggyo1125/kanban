package models.files;

import lombok.Data;

@Data
public class FileInfo {
    private long id;
    private String gid;
    private String location;
    private String fileName;
    private String fileType;
}
