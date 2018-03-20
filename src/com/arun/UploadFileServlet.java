package com.arun;

import com.google.gson.JsonObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;


@WebServlet(name = "UploadFileServlet", urlPatterns = {"/uploadFile"})
@MultipartConfig
public class UploadFileServlet extends HttpServlet {
    InputStream filecontent = null;
    int read = 0;
    final byte[] bytes = new byte[1024];
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part filePart = request.getPart("uploadedFile");
        String fileName = getFileName(filePart);
        System.out.println(fileName);

        BufferedReader br = new BufferedReader(new InputStreamReader(filePart.getInputStream()));
        // JSONParser parser=new JSONParser();

        String line;
        String data = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            data += line + "\n";
        }
        try {

            JSONParser parser = new JSONParser();
        } catch (Exception e){
            System.out.println(e);
        }

    }

    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            System.out.println();
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}
