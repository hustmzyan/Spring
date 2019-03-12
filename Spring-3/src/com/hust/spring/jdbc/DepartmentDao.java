package com.hust.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;


/**
 * 不推荐使用JdbcDaoSupport，而推荐直接使用JdbcTemplate作为Dao类的成员变量
 */
@Repository
public class DepartmentDao extends JdbcDaoSupport {

    @Autowired
    public void setDataSource2(DataSource dataSource){
        setDataSource(dataSource);
    }

    public Department get(Integer id){
        String sql = "SELECT id, name FROM departments WHERE id = ?";
        RowMapper<Department> rowMapper = new BeanPropertyRowMapper<>(Department.class);
        return getJdbcTemplate().queryForObject(sql, rowMapper, id);
    }
}
