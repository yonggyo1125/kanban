package models.files;

import java.util.List;

public class FileInfoDao {
    public boolean add(FileInfo fileInfo) {


    }

    public FileInfo get(long id) {

    }

    public List<FileInfo> getList(String gid, String location) {

    }

    public List<FileInfo> getList(String gid) {
        return getList(gid, null);
    }

    public boolean delete(long id) {

    }

    public boolean delete(String gid, String location) {

    }

    public boolean delete(String gid) {
        return delete(gid, null);
    }
}
