package com.douzone.guestbook.test;

import java.util.List;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;


public class GuestbookDaoTest {

	public static void main(String[] args) {
		
		//insertTest();
		new GuestbookDao().delete(5);
		findAllTest();
	}

	private static void findAllTest() {
		List<GuestbookVo> list= new GuestbookDao().findAll();
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void insertTest() {
		GuestbookVo vo= new GuestbookVo();
		vo.setName("김정인");
		vo.setPassword("98765");
		vo.setMessage("hello");
		
		new GuestbookDao().insert(vo);
	}
}
