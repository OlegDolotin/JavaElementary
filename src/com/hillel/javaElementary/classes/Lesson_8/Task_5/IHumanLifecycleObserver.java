package com.hillel.javaElementary.classes.Lesson_8.Task_5;

import java.util.Date;

public interface IHumanLifecycleObserver {
    void onHumanWasBorn(BornParams params);
    void onWentToKindergarten(EducationParams params);
    void onWentToSchool(EducationParams params);
    void onWentToUniversity(EducationParams params);
    void onGotWork(WorkParams params);
    void onBoughtCar(BoughtCarParams params);
    void onCreatingFamily(CreatingFamilyParams params);
    void onGaveBirth(GaveBirthParams params);
    void onDeath(Date date);

    class BornParams{
        private boolean gender;
        private String name;
        private Date birthday;

        public BornParams(boolean gender, String name, Date birthday) {
            this.gender = gender;
            this.name = name;
            this.birthday = birthday;
        }

        public boolean getGender() {
            return gender;
        }

        public String getName() {
            return name;
        }

        public Date getBirthday() {
            return birthday;
        }
    }

    class EducationParams{
        private String educationalEstablishment;
        private int age;

        public EducationParams(String educationalEstablishment, int age) {
            this.educationalEstablishment = educationalEstablishment;
            this.age = age;
        }

        public String getEducationalEstablishment() {
            return educationalEstablishment;
        }

        public int getAge() {
            return age;
        }
    }

    class WorkParams{
        private String position;
        private int salary;

        public WorkParams(String position, int salary) {
            this.position = position;
            this.salary = salary;
        }

        public String getPosition() {
            return position;
        }

        public int getSalary() {
            return salary;
        }
    }

    class BoughtCarParams{
        private String brand;
        private int cost;
        private int mileage;

        public BoughtCarParams(String brand, int cost, int mileage) {
            this.brand = brand;
            this.cost = cost;
            this.mileage = mileage;
        }

        public String getBrand() {
            return brand;
        }

        public int getCost() {
            return cost;
        }

        public int getMileage() {
            return mileage;
        }
    }

    class CreatingFamilyParams{
        private String wifeName;
        private int age;

        public CreatingFamilyParams(String wifeName, int age) {
            this.wifeName = wifeName;
            this.age = age;
        }

        public String getWifeName() {
            return wifeName;
        }

        public int getAge() {
            return age;
        }
    }

    class GaveBirthParams{
        private String childName;
        private boolean gender;
        private Date birthday;

        public GaveBirthParams(String childName, boolean gender, Date birthday) {
            this.childName = childName;
            this.gender = gender;
            this.birthday = birthday;
        }

        public String getChildName() {
            return childName;
        }

        public boolean getGender() {
            return gender;
        }

        public Date getBirthday() {
            return birthday;
        }
    }
}
