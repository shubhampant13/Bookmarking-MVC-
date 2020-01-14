package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;

public class Launch {
 
	private static User[] users;
	private static Bookmark[][] bookmarks;
	
	private static void loadData() {
		System.out.println("1. Loading data..");
		DataStore.loadData();
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		System.out.println("Printing data...");
		printUserData();
		printBookmarkData();
	}
	
	private static void printBookmarkData() {
		for(Bookmark[] bookmarkList : bookmarks) {
			for(Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
		
	}

	private static void printUserData() {
		for(User user : users) {
			System.out.println(user);
		}
		
	}
	
	private static void startBookmarking() {
		System.out.println("\n2. Bookmarking data..");
		for(User user: users) {
			View.bookmark(user, bookmarks);
		}
	}

	public static void main(String[] args) {
	  loadData();
	  startBookmarking();
	}

	

}
