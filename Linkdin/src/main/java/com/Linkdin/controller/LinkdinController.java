package com.Linkdin.controller;

import java.util.Scanner;

import com.Linkdin.entity.LinkdinUser;
import com.Linkdin.service.LinkdinService;
import com.Linkdin.service.LinkdinServiceInterface;

public class LinkdinController implements LinkdinControllerInterface {
	@Override
	public void createprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your password");
		String password=sc.next();
		System.out.println("Enter your email");
		String email=sc.next();
		System.out.println("Enter your adress");
		String adress=sc.next();
		LinkdinUser lu=new LinkdinUser();
		lu.setName(name);
		lu.setPassword(password);
		lu.setEmail(email);
		lu.setAdress(adress);
		LinkdinServiceInterface lsi=new LinkdinService();
		int i=lsi.createprofileservice(lu);
		if(i>0) {
			System.out.println("Profile Created");
		}else {
			System.out.println("No profile");
		}
		
	}

	@Override
	public void viewprofilecontroller() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ViewAllprofilecontroller() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editprofilecontroller() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchprofilecontroller() {
		// TODO Auto-generated method stub
		
	}

}
