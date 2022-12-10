package Dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbConnection {

	public static void main(String[] args) {
		System.out.println(DbConnection.getDb());

	}

	public static SqlSession  getDb() {
		SqlSession se=null;
		String resource = "mybatis-config.xml";

		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
			se=sf.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return se;

	}

}
