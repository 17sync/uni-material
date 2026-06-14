class Course {
    String title;

    Course(String title) {
        this.title = title;
    }

    public void assignTeacher(Teacher t) 
    { 
        System.out.println(t.name + " teaches " + title);
    }
}