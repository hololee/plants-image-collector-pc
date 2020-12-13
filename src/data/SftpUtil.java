package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SftpUtil {


    private Session session = null;
    private Channel channel = null;
    private ChannelSftp channelSftp = null;


  
    public void init() {
        String url = "***.***.***.***";
        String user = "***";
        String password = "***";
      
        JSch jsch = new JSch();
        try {
         
            session = jsch.getSession(user, url);

          
            session.setPassword(password);

     
            java.util.Properties config = new java.util.Properties();

          
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);

         
            session.connect();

        
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp) channel;

        } catch (JSchException e) {
            e.printStackTrace();
        }


    }

  
    public boolean upload(String dir, File file) {
        FileInputStream in = null;

        try { 
            in = new FileInputStream(file);
            channelSftp.cd(dir);
            channelSftp.put(in, file.getName());
            in.close();
            return true;
        } catch (Exception se) {
            se.printStackTrace();
            return false;
        }
    }
    
  

    public void disconnect() {
        channelSftp.quit();
        session.disconnect();
    }

}
