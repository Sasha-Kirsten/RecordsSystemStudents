public class Grade {

        //Here we declare the variables for object Grade.
        public int scores;

        public String subject;

        public int programming;

        public int webDev;

        public int maths;

        public int algorithms;

        // Here we declare the construction function for the Grade object.
        public Grade(int scores, String subject, int programming, int webDev, int maths, int algorithms){

            this.scores = scores;

            this.subject = subject;

            this.programming = programming;

            this.webDev = webDev;

            this.maths = maths;

            this.algorithms = algorithms;
        }

        //Here we declare the setters and getters.
        public int getScores() {
            return scores;
        }

        public void setScores(int scores) {
            this.scores = scores;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        //Here is the function to return the grades of the student's module.
    public static String getLetterGrade(double inputscore){
        if(inputscore>=70){
            return "A";
        }
        if(inputscore>=60){
            return "B";
        }
        if(inputscore>=50){
            return "C";
        }
        if(inputscore>=40){
            return "D";
        }
        if(inputscore<=40){
            return "F";
        }
        else{
            return "E";
        }
    }


    // private String subject;
    // private double score;

    // public Grade(String subject, double score) {
    //     this.subject = subject;
    //     this.score = score;
    // }

    // // Getters and setters

    // public static char getLetterGrade(double score) {
    //     if (score < 0 || score > 100) {
    //         return 'E';
    //     } else if (score >= 70) {
    //         return 'A';
    //     } else if (score >= 60) {
    //         return 'B';
    //     } else if (score >= 50) {
    //         return 'C';
    //     } else if (score >= 40) {
    //         return 'D';
    //     } else {
    //         return 'F';
    //     }
    // }




}
