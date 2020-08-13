package stu_dao;

import java.util.List;

/**
 * @Author Fang
 * @create 2020/8/12 20:54
 */
public class Manager {

    public String getStudentName(StudentInfo studentInfo){
        return studentInfo.getName();
    }
    public int getStudentNao(StudentInfo studentInfo){
        return studentInfo.getNo();
    }

    public String getStudentSex(StudentInfo studentInfo){
        return studentInfo.getSex();
    }

    public int getStudentScore(StudentInfo studentInfo){
        return studentInfo.getScore();
    }

    public int getStudentNumber(List<StudentInfo> studentList){
        return studentList.size();
    }

    public String getStudentNameByMaxScore(List<StudentInfo> studentList){

        int max = 0;
        StudentInfo  studentInfo = new StudentInfo();
        for (int i = 0 ;i < studentList.size();++i){
            if (studentList.get(i).getScore() > max){
                max = studentList.get(i).getScore();
                studentInfo = studentList.get(i);
            }
        }

        return studentInfo.getName();
    }
}
