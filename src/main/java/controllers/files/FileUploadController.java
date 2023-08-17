package controllers.files;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.files.FileServiceManager;
import models.files.FileUploadService;

import java.io.IOException;

@WebServlet("/file/upload")
public class FileUploadController extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileUploadService uploadService = FileServiceManager.getInstance().fileUploadService();

        uploadService.uploads(req);
    }
}
