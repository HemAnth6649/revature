package com.Linkdin.view;

import java.util.Scanner;

import com.Linkdin.controller.LinkdinController;
import com.Linkdin.controller.LinkdinControllerInterface;

public class LinkdinView {

	public static void main(String[] args) {
		System.out.println("*******Main Menu*******");
		System.out.println("Press 1 to create profile");
		System.out.println("Press 2 to view profile");
		System.out.println("Press 3 to viewAll profile");
		System.out.println("Press 4 to edit profile");
		System.out.println("Press 5 to search profile");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		LinkdinControllerInterface lci=new LinkdinController();
		switch(choice) {
		case 1:  lci.createprofilecontroller();
			break;
		case 2: lci.viewprofilecontroller();
			break;
		case 3: lci.ViewAllprofilecontroller();
			break;
		case 4: lci.editprofilecontroller();
			break;
		case 5: lci.searchprofilecontroller();
			break;
		}
		
	}


}
