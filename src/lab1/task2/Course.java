package lab1.task2;

 class Course {

    private String title, description;
    private Student[] studenti;

     public void setDescription(String description) {
         this.description = description;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public void setStudenti(Student[] studenti) {
         this.studenti = studenti;
     }

     String[] filterYear(int an){
        int namelength = 0;
        for(int i=0;i<studenti.length;i++)
            namelength++;
        String[] name = new String[namelength];
        for(int i=0;i<studenti.length;i++)
            if (studenti[i].getYear() == an) {
                name[i] = studenti[i].getName();
            }
        return name;
    }

}

