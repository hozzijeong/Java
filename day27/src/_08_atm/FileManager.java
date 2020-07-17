package _08_atm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	UserManager userManager = ATM.userManager;
	

	String filename = "Custmoinfo.txt";
	File file = new File(filename);
	FileWriter fw = null;
	FileReader fr = null;
	BufferedReader br = null;
	
	String user_data = "";
	String[] acc_data;
	
	int user_count;
	
	public FileManager() {
		user_count = userManager.userCount;
		
	}
	
	String setData() {
		System.out.println("user_count = " + user_count);
		user_data += userManager.userCount+"\n";
		int i=0;
		while(i<user_count) {
			user_data += userManager.user[i].name+":"+userManager.user[i].pw +"\n"+ userManager.user[i].accCount;
			if(userManager.user[i].accCount==0) {
				user_data += "\n";
			}else {
				user_data += "|";
				for(int j=0; j<userManager.user[i].accCount; j++) {
					user_data += userManager.user[i].acc[j].number + "/" + userManager.user[i].acc[j].money;
					if(j!= userManager.user[i].accCount-1) {
						user_data += ",";
					}
				}
				user_data += "\n";
			}
			i+=1;
		}
		return user_data;
	}
	
	void saveData() {
		user_count = userManager.userCount;
		try {
			fw = new FileWriter(filename);
			fw.write(setData());
			///System.out.println(setData());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
	}
	
	void loadData() {
		String data = "";
		if(file.exists()) {
			try {
				fr = new FileReader(filename);
				br = new BufferedReader(fr);
				String line = br.readLine();
				userManager.userCount = Integer.parseInt(line); // 전체 게시글 개수
				while(true) {
					String a = br.readLine();
					if(a == null) {
						break;
					}
					data += a;
					data += "\n";
				}
				data = data.substring(0,data.length()-1);
				userManager.user = new User[userManager.userCount];
				for(int i=0; i<userManager.userCount;i++) {
					userManager.user[i] = new User();
				}
				String[] temp = data.split("\n");
				int j=0;
				for(int i=0; i<temp.length;i+=2) {
					String[] cus_info = temp[i].split(":");
					userManager.user[j].name = cus_info[0];
					userManager.user[j].name = cus_info[1];
					String[] acc_info = temp[i+1].split("|");
					userManager.user[j].accCount = Integer.parseInt(acc_info[0]);
					if(userManager.user[j].accCount ==1) {
						String[] acc_info2 = acc_info[1].split("/");
						userManager.user[j].acc[0] = new Account();
						userManager.user[j].acc[0].number = acc_info[0];
						userManager.user[j].acc[0].money = Integer.parseInt(acc_info[1]);
					}else if(userManager.user[j].accCount >1) {
						String[] acc_info2 = acc_info[1].split(",");
						for(int k=0; k<acc_info2.length; k++) {
							String[] acc_info3 = acc_info[k].split("/");
							userManager.user[j].acc[k] = new Account();
							userManager.user[j].acc[k].number = acc_info3[0];
							userManager.user[j].acc[k].money = Integer.parseInt(acc_info3[1]);
						}
					}
					j+=1;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {fr.close();} catch (IOException e) {e.printStackTrace();}
				try {br.close();} catch (IOException e) {e.printStackTrace();}
			}
		
		}

	}
}
		
	