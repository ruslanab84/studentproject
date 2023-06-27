package model;

public class Statistics {
    private String profile;
    private int avgExamPoint;
    private int studentCountProfile;
    private int universityCountProfile;
    private String universityName;

    public Statistics() {
    }

    public Statistics(String profile, int avgExamPoint, int studentCountProfile, int universityCountProfile, String universityName) {
        this.profile = profile;
        this.avgExamPoint = avgExamPoint;
        this.studentCountProfile = studentCountProfile;
        this.universityCountProfile = universityCountProfile;
        this.universityName = universityName;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getAvgExamPoint() {
        return avgExamPoint;
    }

    public void setAvgExamPoint(int avgExamPoint) {
        this.avgExamPoint = avgExamPoint;
    }

    public int getStudentCountProfile() {
        return studentCountProfile;
    }

    public void setStudentCountProfile(int studentCountProfile) {
        this.studentCountProfile = studentCountProfile;
    }

    public int getUniversityCountProfile() {
        return universityCountProfile;
    }

    public void setUniversityCountProfile(int universityCountProfile) {
        this.universityCountProfile = universityCountProfile;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
