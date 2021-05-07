package com.myproject.myapp;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//Runner는 임포트 안되니 직접 복붙해서 적기


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)
public class DataSourceTest {
    
    @Inject
    private DataSource dataSource;
    
    @Test
    public void testConnection() throws Exception {
        
        try{
        	Connection conn1 = dataSource.getConnection();
            Connection conn2 = dataSource.getConnection(); 
            
            System.out.println("===== mysql datasource connection test start =====");
            System.out.println(conn1);
            System.out.println(conn2);
            System.out.println("===== mysql datasource connection test end =====");
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
