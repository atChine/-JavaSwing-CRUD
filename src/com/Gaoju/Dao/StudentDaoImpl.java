package com.Gaoju.Dao;

import com.Gaoju.School.Student;
import com.Gaoju.Utils.Conn;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: StudentDaoImpl
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/26 19:28
 * @URL：https://github.com/GaoHaiNB
 */
public class StudentDaoImpl  {
    //修改
    public void updateStudent(Student student) throws Exception {
        Connection con = Conn.getCon();
        String sql="update student set name=?,address=?,classes=?,score=? where id=?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,student.getName());
        statement.setString(2,student.getAddress());
        statement.setString(3,student.getClasses());
        statement.setString(4, String.valueOf(student.getScore()));
        statement.setString(5,student.getId());
        int row = statement.executeUpdate();
        if (row>0){
            JOptionPane.showMessageDialog(null,"修改成功！","消息提示",JOptionPane.WARNING_MESSAGE);	//消息对话框
        }else {
            JOptionPane.showMessageDialog(null,"修改失败！","消息提示",JOptionPane.WARNING_MESSAGE);	//消息对话框
        }
    }

    //查询
    public ResultSet selectStudent(String sid) throws Exception {
        List<Student> studentList = new ArrayList<>();
        Connection con = Conn.getCon();
        String sql="select * from student where id=?;";
        PreparedStatement state = con.prepareStatement(sql);
        state.setString(1,sid);
        ResultSet rs = state.executeQuery();
        System.out.println(rs);
        return rs;
    }
    //提交
    public boolean submitStudent(Student student) throws Exception {
        Connection con = Conn.getCon();
        String sql="insert into student values(?,?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,student.getName());
        statement.setString(2,student.getAddress());
        statement.setString(3,student.getClasses());
        statement.setString(4,student.getId());
        statement.setString(5, String.valueOf(student.getScore()));
        int raw = statement.executeUpdate();
        if (raw>0){
            JOptionPane.showMessageDialog(null,"提交成功！","消息提示",JOptionPane.WARNING_MESSAGE);	//消息对话框
        }else {
            JOptionPane.showMessageDialog(null,"提交失败！","消息提示",JOptionPane.WARNING_MESSAGE);	//消息对话框
        }
        return false;
    }
}
