package com.secfree.inteface;

import java.io.File;
import java.util.List;

/**
 * 
 * IP��ѯ�ӿ�
 * @author Bearcat
 *
 */
public interface IPQuery {
	/*
	 * ����IP��ѯ
	 */
	public abstract void queryOne(String ip);
	
	/*
	 * ������ѯ 
	 */
	public abstract void queryAll(File filePath);
}
