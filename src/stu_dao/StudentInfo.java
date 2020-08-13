package stu_dao;

/**
 * @Author Fang
 * @create 2020/8/12 20:53
 */
public class StudentInfo {
    public int no;
    public String name;
    public String sex;
    public int score;

    public StudentInfo() {
    }

    public StudentInfo(int no, String name, String sex, int score) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }
}
