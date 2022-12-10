package Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Model.member;

public class implMember implements memberDao {

	public static void main(String[] args) {
		/*member m = new member("1", "2", "李", "4", "5");
		new implMember().add(m);*/
		//System.out.println(new implMember().selectUsername("1"));
		//System.out.println(new implMember().selectUsername("2","2"));

	}

	@Override
	public void add(member m) {
		SqlSession se = DbConnection.getDb();
		se.insert("memberMapper.add", m);
		se.commit();

	}

	@Override
	public boolean selectUsername(String username) {
		SqlSession se = DbConnection.getDb();
		boolean bl=false;
		List<member> l = se.selectList("memberMapper.selectUsername", username);
		member[] M = l.toArray(new member[l.size()]);
		if (l.size() != 0) {
			bl=true;
		}
		return bl;
	}

	@Override
	public boolean selectUsername(String username, String password) {
		boolean bl=false;
		SqlSession se = DbConnection.getDb();
		Map<String,String> map=new HashMap();
		map.put("username", username);
		map.put("password", password);
		List<member> l=se.selectList("memberMapper.selectUsernamePassword", map);
		if(l.size()!=0) {
			bl=true;
		}
		return bl;
	}

}
