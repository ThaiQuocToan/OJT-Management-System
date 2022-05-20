/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se1625.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.servlet.ServletContext;

/**
 *
 * @author Thai Quoc Toan <toantqse151272@fpt.edu.vn>
 */
public class MyApplicationHelper {
    public static void getSiteMaps(ServletContext context) throws IOException {
        //1. get siteMaps file
        String siteMapsFile = context.getInitParameter("SITE_MAPS_FILE_PATH");
        //2. load properties from context and siteMapsFile to getResourceAsStream
        InputStream is = null;
        is = context.getResourceAsStream(siteMapsFile);
        Properties properties = new Properties();
        properties.load(is);
        
        //3. tạo attribute trong contextScope
        context.setAttribute("SITE_MAPS", properties);
    }
}
