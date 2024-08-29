 class StudentPassFail {
    public static void main(String[] args) {
        // Predefined scores for three subjects
        int subject1 = 35;  // Score in subject 1
        int subject2 = 45;  // Score in subject 2
        int subject3 = 50;  // Score in subject 3

        // Initialize the count for failed subjects
        int failedSubjects = 0;

        // Check each subject using a nested switch statement
        switch (subject1 > 40 ? "pass" : "fail") {
            case "fail":
                failedSubjects++;
                break;
        }

        switch (subject2 > 40 ? "pass" : "fail") {
            case "fail":
                failedSubjects++;
                break;
        }

        switch (subject3 > 40 ? "pass" : "fail") {
            case "fail":
                failedSubjects++;
                break;
        }

        // Determine the pass/fail status based on the number of failed subjects
        switch (failedSubjects) {
            case 0:
                System.out.println("The student has passed all subjects.");
                break;
            case 1:
                System.out.println("The student has failed in 1 subject.");
                break;
            case 2:
                System.out.println("The student has failed in 2 subjects.");
                break;
            case 3:
                System.out.println("The student has failed in all 3 subjects.");
                break;
            default:
                System.out.println("Invalid number of failed subjects.");
                break;
        }
    }
}




/*
Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. 
*/