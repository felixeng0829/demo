package Dao;

import java.util.List;

import Model.member;

public interface memberDao {
	// C
	void add(member m);

	// R
	
	boolean selectUsername(String username);

	boolean selectUsername(String username, String password);

	
}
