package com.secfree.inteface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.secfree.util.IPSeeker;

/**
 * 
 * IPQueryʵ����
 * 
 * @author Bearcat
 *
 */
public class IPQueryImpl implements IPQuery{
	
	@Override
	public void queryOne(String ip) {
		IPSeeker is = new IPSeeker();
		System.out.println("\n" + ip + "----" +is.getAddress(ip));
		System.out.println("\n ��ѯ���");
	}
	
	public void queryAll(File filePath) {
		String ip;
		IPSeeker is = new IPSeeker();
		System.out.println("\n");
		try {
			BufferedReader read = new BufferedReader(new FileReader(filePath));
			while ((ip = read.readLine()) != null) {
				System.out.println(ip + "----" +is.getAddress(ip));
			}
			System.out.println("\n ��ѯ���");
		} catch (IOException e) {
			System.out.println("[!] " + filePath + " �ļ�������\n");
		}
	}
}