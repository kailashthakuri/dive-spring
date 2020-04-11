<%@ page import="org.apache.commons.fileupload.FileItem" %>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory" %>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload" %>
<%@ page import="java.io.File" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: kailash
  Date: 08/04/2020
  Time: 1:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Server</title>
</head>
<body>
<h2 align="center">File Server Example</h2>
</body>

<%

    String appPath = pageContext.getServletContext().getRealPath("");
    String rpath = "/uploaded-files";

    String path = appPath + rpath;


    int maxSize = 1024 * 5000;

    String fileUploadLocation = pageContext.getServletContext().getInitParameter("file-upload");
    String contentType = request.getContentType();
    if (contentType.indexOf("multopart/form-data") >= 0) {
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        diskFileItemFactory.setSizeThreshold(maxSize);
        diskFileItemFactory.setRepository(new File("e:\\study"));
        ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
        fileUpload.setFileSizeMax(maxSize);
        List list = fileUpload.parseRequest(request);
        list.forEach(item -> {
            FileItem fileItem = (FileItem) item;
            if (!fileItem.isFormField()) {
                String fieldName = fileItem.getFieldName();
                String name = fileItem.getName();
                long size = fileItem.getSize();
                try {
                    fileItem.write(new File(path + "\\" + name));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

%>


</html>
