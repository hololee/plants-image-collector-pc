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
	
	static String selectedName = "미상_undefined";
	
	public static void main(String[] args) {		
		
		 ArrayList<listItem> arrayList = new ArrayList<>();
		 
		arrayList.add(new listItem("미상_undefined", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("갈퀴나물_viciaamoena", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("강아지풀_setariaviridis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("개망초_erigeronannuus", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("개미취_aster", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("금계국_coreopsis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("금창초_ajugadecumbens", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("꿩의밥_luzulacapitata", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("남천_berberisl", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("달개비_commelinacommunis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("달맞이꽃_oenothera", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("띠_imperatacylindrica", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("망초_conyzacanadensis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("무릇꽃_muleuskkoch", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("미국쑥부쟁이_symphyotrichumpilosum", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("민들레_taraxacumplatycarpum", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("바랭이_digitariaciliaris", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("벌개미취_asterkoraiensis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("비비추_hostalongipes", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("살갈퀴_viciaangustifoliavarsegetilis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("선씀바귀_ixerisstrigosa", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("소리쟁이_rumexcrispus", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("쇠뜨기_equisetumarvense", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("쇠무릎_achyranthesbidentata", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("쑥_artemisiaprinceps", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("씀바귀_ixeridiumdentatum", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("역기_yeogkkipul", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("원추리_hemerocallis", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("유채_brassicanapus", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("이끼류_sortofmoss", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("점나도나물_cerastium", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("제비꽃_violamandshurica", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("질경이_plantagoasiatica", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("큰개불알풀_veronicapersica", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("클로바_clova", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("튤립_tulipa", "/data1/LJH/plants/",0));
        arrayList.add(new listItem("피막이풀_hydrocotyle", "/data1/LJH/plants/",0));
	 
		
       
        
		//make layout.
		JFrame frame = new JFrame();
		
		frame.setTitle("잡초 사진 업로드 프로그램(IMAGE UPLOADER) VER 1.0.0");
		frame.setBounds(200 , 200 , 600 ,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

		Panel infoBox = new Panel();
		infoBox.setBackground(Color.DARK_GRAY);
	
		
		
		JLabel infoText = new JLabel("<html>찍어둔 사진을 업로드 할 수 있습니다.<br>사진은 바로 '김형석교수님 연구실' 서버 컴퓨터로 업로드 되어지니 신중하게 찍어주시기 부탁드립니다.<br><br>You can upload a picture.<br>The picture will be uploaded directly to the server computer of 'Professor Kim Hyung-seok'.<br>Please take it carefully.<br><br></html>");
		infoText.setForeground(Color.white);
		infoText.setFont(infoText.getFont().deriveFont (12.0f));
		infoBox.add(infoText);
		
		JLabel listLink = new JLabel("");
		listLink.setForeground(Color.white);
		listLink.setText("<html>아래의 링크에서 식물 종류를 확인하세요.<br>Check the plant type from the link below.<br><a href=\"\"  style=\"color:yellow\">https://drive.google.com/open?id=1jLHmm15sJJx0a5zot3qhjMX7QDOBRA7h</a><br><br></html>"); 
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
		userName.setText("이름을 입력하세요.(Input your name.)");
		infoBox.add(userName);
		
		//업로드 버튼.
		Button button = new Button("이미지 업로드(IMAGE UPLOAD)");
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
			                //업로드.
			                    
			                sft.disconnect();
		                	JOptionPane.showMessageDialog(frame, "<html>업로드가 완료되었습니다.<br>Upload completed.</html>");

			                

			            }
			        }).start();

				
				
			}});
			
		
		infoBox.add(button);
		
		
		frame.add(infoBox, BorderLayout.CENTER);
		
		
		//show how to use this.
		JOptionPane.showMessageDialog(frame, "<html>사용방법<br>1.식물 종류를 선택하고 이름을 입력해주세요.<br>2.식물 사진을 전부선택 후 확인을 눌러주세요.<br>3.업로드 완료창이 뜰때까지 기다려주세요.<br><br>How to use <br>1.Please select the plant type and enter name.<br>2.After selecting all plant photos, press OK.<br>3.Wait for the upload completion window to appear.</html>");
		
		
		
	}
	
	public static void renameFile(File file, String newFilename) {
        File fileNew = new File( newFilename );
        if( file.exists() ) file.renameTo( fileNew );
    }
	    

	
	
}
