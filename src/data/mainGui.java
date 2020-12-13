package data;
import data.SftpUtil;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class mainGui{
	
	static String selectedName = "�̻�_undefined";
	
	public static void main(String[] args) {		
		
		 ArrayList<listItem> arrayList = new ArrayList<>();
		 
		arrayList.add(new listItem("�̻�_undefined", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("��������_viciaamoena", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("������Ǯ_setariaviridis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("������_erigeronannuus", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("������_aster", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�ݰ豹_coreopsis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("��â��_ajugadecumbens", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("���ǹ�_luzulacapitata", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("��õ_berberisl", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�ް���_commelinacommunis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�޸��̲�_oenothera", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("��_imperatacylindrica", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("����_conyzacanadensis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("������_muleuskkoch", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�̱���������_symphyotrichumpilosum", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�ε鷹_taraxacumplatycarpum", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�ٷ���_digitariaciliaris", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("��������_asterkoraiensis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�����_hostalongipes", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�찥��_viciaangustifoliavarsegetilis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�����ٱ�_ixerisstrigosa", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�Ҹ�����_rumexcrispus", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("��߱�_equisetumarvense", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�蹫��_achyranthesbidentata", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("��_artemisiaprinceps", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("���ٱ�_ixeridiumdentatum", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("����_yeogkkipul", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("���߸�_hemerocallis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("��ä_brassicanapus", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�̳���_sortofmoss", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("����������_cerastium", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�����_violamandshurica", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("������_plantagoasiatica", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("ū���Ҿ�Ǯ_veronicapersica", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("Ŭ�ι�_clova", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("ƫ��_tulipa", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("�Ǹ���Ǯ_hydrocotyle", "/data1/LJH/plants/",0));
	 
		
       
        
		//make layout.
		JFrame frame = new JFrame();
		
		frame.setTitle("���� ���� ���ε� ���α׷�(IMAGE UPLOADER) VER 1.0.0");
		frame.setBounds(200 , 200 , 600 ,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

		Panel infoBox = new Panel();
		infoBox.setBackground(Color.DARK_GRAY);
	
		
		
		JLabel infoText = new JLabel("<html>���� ������ ���ε� �� �� �ֽ��ϴ�.<br>������ �ٷ� '������������ ������' ���� ��ǻ�ͷ� ���ε� �Ǿ����� �����ϰ� ����ֽñ� ��Ź�帳�ϴ�.<br><br>You can upload a picture.<br>The picture will be uploaded directly to the server computer of 'Professor Kim Hyung-seok'.<br>Please take it carefully.<br><br></html>");
		infoText.setForeground(Color.white);
		infoText.setFont(infoText.getFont().deriveFont (12.0f));
		infoBox.add(infoText);
		
		JLabel listLink = new JLabel("");
		listLink.setForeground(Color.white);
		listLink.setText("<html>�Ʒ��� ��ũ���� �Ĺ� ������ Ȯ���ϼ���.<br>Check the plant type from the link below.<br><a href=\"\"  style=\"color:yellow\">https://drive.google.com/open?id=1jLHmm15sJJx0a5zot3qhjMX7QDOBRA7h</a><br><br></html>"); 
		listLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
		listLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://drive.google.com/open?id=1jLHmm15sJJx0a5zot3qhjMX7QDOBRA7h"));
                } catch (Exception ex) {
                    //It looks like there's a problem
                }
            }
        });
		infoBox.add(listLink);
		
		
		
		
		
	
		
		Choice ch = new Choice();
		for(int i = 0 ; i < arrayList.size() ; i++) {
			ch.addItem(arrayList.get(i).getName());
		}
		infoBox.add(ch);
		
		ch.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				selectedName = ch.getSelectedItem();
				
			}});
		
		//name field
		TextField userName = new TextField();
		userName.setText("�̸��� �Է��ϼ���.(Input your name.)");
		infoBox.add(userName);
		
		//���ε� ��ư.
		Button button = new Button("�̹��� ���ε�(IMAGE UPLOAD)");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 
				
				//open file browser.
				 JFileChooser chooser = new JFileChooser();
				 chooser.setMultiSelectionEnabled(true);
				 chooser.showOpenDialog(frame);
				 File[] files = chooser.getSelectedFiles();
				
				
				 new Thread(new Runnable() {
			            @Override
			            public void run() {

			                SftpUtil sft = new SftpUtil();
			                sft.init();

			                for(int i =0 ; i< files.length; i++) {
			                	File data = files[i];
			                	renameFile(data, data.getAbsoluteFile().getParent()+"/" + selectedName+"_"+userName.getText()+"_"+data.getName());      	
			                	File renamed = new File(data.getAbsoluteFile().getParent()+"/" + selectedName+"_"+userName.getText()+"_"+data.getName());
			                	
			                	boolean sc_uploaded = sft.upload("/data1/LJH/plants/", renamed);
			                		
			                }
			                //���ε�.
			                    
			                sft.disconnect();
		                	JOptionPane.showMessageDialog(frame, "<html>���ε尡 �Ϸ�Ǿ����ϴ�.<br>Upload completed.</html>");

			                

			            }
			        }).start();

				
				
			}});
			
		
		infoBox.add(button);
		
		
		frame.add(infoBox, BorderLayout.CENTER);
		
		
		//show how to use this.
		JOptionPane.showMessageDialog(frame, "<html>�����<br>1.�Ĺ� ������ �����ϰ� �̸��� �Է����ּ���.<br>2.�Ĺ� ������ ���μ��� �� Ȯ���� �����ּ���.<br>3.���ε� �Ϸ�â�� �㶧���� ��ٷ��ּ���.<br><br>How to use <br>1.Please select the plant type and enter name.<br>2.After selecting all plant photos, press OK.<br>3.Wait for the upload completion window to appear.</html>");
		
		
		
	}
	
	public static void renameFile(File file, String newFilename) {
        File fileNew = new File( newFilename );
        if( file.exists() ) file.renameTo( fileNew );
    }
	    

	
	
}
