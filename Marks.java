    // Marks abstract class
    abstract class Marks {
        abstract double getPercentage();
    }

    // Class A
    class A extends Marks {
        private double subject1, subject2, subject3;

        public A(double s1, double s2, double s3) {
            this.subject1 = s1;
            this.subject2 = s2;
            this.subject3 = s3;
        }

        @Override
        double getPercentage() {
            return (subject1 + subject2 + subject3) / 3;
        }
    }

    // Class B
    class B extends Marks {
        private double subject1, subject2, subject3, subject4;

        public B(double s1, double s2, double s3, double s4) {
            this.subject1 = s1;
            this.subject2 = s2;
            this.subject3 = s3;
            this.subject4 = s4;
        }

        @Override
        double getPercentage() {
            return (subject1 + subject2 + subject3 + subject4) / 4;
        }
    }

    // Testing code
    class StudentTester {
        public static void main(String[] args) {
            // Creating student A and calculating average percentage
            A studentA = new A(75, 80, 85);
            double percentageA = studentA.getPercentage();
            System.out.println("Average percentage for student A: " + percentageA);

            // Creating student B and calculating average percentage
            B studentB = new B(70, 75, 80, 85);
            double percentageB = studentB.getPercentage();
            System.out.println("Average percentage for student B: " + percentageB);
        }
    }


